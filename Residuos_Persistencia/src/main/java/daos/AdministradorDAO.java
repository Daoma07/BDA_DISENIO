/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Administrador;
import dominio.Productor;
import dominio.Usuario;
import interfaces.IAdministradorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author HP
 */
public class AdministradorDAO implements IAdministradorDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Usuario> COLECCION;

    public AdministradorDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("usuarios", Usuario.class);
    }

    @Override
    public Administrador agregarAdministrador(Administrador administrador) {
        try {
            // Verificar si ya existe un administrador con el mismo RFC
            Document queryRfc = new Document("rfc", administrador.getRfc());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un administrador con "
                        + "el mismo RFC", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un administrador con el mismo RFC");
            }

            // Verificar si ya existe un administrador con el mismo usuario de credencial
            Document queryUsuario = new Document("credencial.usuario", administrador.getCredencial().getUsuario());
            long countUsuario = this.COLECCION.countDocuments(queryUsuario);
            if (countUsuario > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un administrador con el mismo usuario",
                        "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un administrador con el mismo usuario de credencial");
            }

            // Insertar el administrador en la colección
            this.COLECCION.insertOne(administrador);

            return administrador;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Usuario encontrarUsuario(String usuario, String contrasenia) {
        try {
            // Construir el filtro para buscar el usuario por el nombre de usuario y contraseña
            Document filtro = new Document();
            filtro.append("credencial.usuario", usuario);
            filtro.append("credencial.contrasenia", contrasenia);

            // Realizar la búsqueda del usuario en la base de datos
            Usuario usuarioEncontrado = this.COLECCION.find(filtro).first();
            if (usuarioEncontrado != null) {

                return usuarioEncontrado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son correctos", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

}
