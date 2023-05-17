/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Flete;
import dominio.Transportista;
import dominio.Usuario;
import interfaces.ITransportistaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Jorge
 */
public class TransportistaDAO implements ITransportistaDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Usuario> COLECCION;

    public TransportistaDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("usuarios", Usuario.class);
    }

    @Override
    public Transportista agregarTransportista(Transportista transportista) {
        try {
            // Verificar si ya existe un transportista con el mismo RFC
            Document queryRfc = new Document("rfc", transportista.getRfc());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un transportista con "
                        + "el mismo RFC", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un transportista con el mismo RFC");
            }

            // Verificar si ya existe un transportista con el mismo usuario de credencial
            Document queryUsuario = new Document("credencial.usuario", transportista.getCredencial().getUsuario());
            long countUsuario = this.COLECCION.countDocuments(queryUsuario);
            if (countUsuario > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un transportista con el mismo usuario",
                        "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un transportista con el mismo usuario de credencial");
            }

            // Insertar el transportista en la colección
            this.COLECCION.insertOne(transportista);

            return transportista;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
