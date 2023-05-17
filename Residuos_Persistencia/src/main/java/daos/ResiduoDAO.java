/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import dominio.Administrador;
import dominio.Residuo;
import interfaces.IResiduoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author Jorge
 */
public class ResiduoDAO implements IResiduoDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Residuo> COLECCION;

    public ResiduoDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("residuos", Residuo.class);
    }

    @Override
    public Residuo agregarResiduo(Residuo residuo) {
        try {

            // Verifica si ya existe un residuo con el mismo código, nombre o listas de químicos
            boolean existeResiduo = this.COLECCION.countDocuments(
                    Filters.or(
                            Filters.eq("codigo", residuo.getCodigo()),
                            Filters.eq("nombre", residuo.getNombre()),
                            Filters.eq("quimicos", residuo.getQuimicos())
                    )) > 0;

            if (existeResiduo) {

                JOptionPane.showMessageDialog(null, "Ya existe un residuo con el mismo\n"
                        + "código, nombre o listas de químicos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.COLECCION.insertOne(residuo);
                JOptionPane.showMessageDialog(null, "Residuo insertado exitosamente");
            }
            return residuo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Residuo> consultarResiduos() {
        try {

            List<Residuo> residuos = new ArrayList<>();
            MongoCursor<Residuo> cursor = COLECCION.find().iterator();

            try {
                while (cursor.hasNext()) {
                    Residuo residuo = cursor.next();
                    residuos.add(residuo);
                }
            } finally {
                cursor.close();
            }

            return residuos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Residuo buscarResiduo(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            return COLECCION.find(Filters.eq("_id", objectId)).first();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
