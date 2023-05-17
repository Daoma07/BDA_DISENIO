/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Productor;
import dominio.Usuario;
import interfaces.IProductorDAO;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Jorge
 */
public class ProductorDAO implements IProductorDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Productor> COLECCION;

    public ProductorDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("usuarios", Productor.class);
    }

    @Override
    public Productor agregarProductor(Productor productor) {
        try {
            // Verificar si ya existe un productor con el mismo RFC
            Document queryRfc = new Document("rfc", productor.getRfc());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un productor con "
                        + "el mismo RFC", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un productor con el mismo RFC");
            }

            // Verificar si ya existe un productor con el mismo usuario de credencial
            Document queryUsuario = new Document("credencial.usuario", productor.getCredencial().getUsuario());
            long countUsuario = this.COLECCION.countDocuments(queryUsuario);
            if (countUsuario > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un productor con el mismo usuario",
                        "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un productor con el mismo usuario de credencial");
            }

            // Insertar el productor en la colección
            this.COLECCION.insertOne(productor);

            return productor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
