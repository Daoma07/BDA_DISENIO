/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Vehiculo;
import interfaces.IVehiculoDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class VehiculoDAO implements IVehiculoDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Vehiculo> COLECCION;

    public VehiculoDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("vehiuclos", Vehiculo.class);
    }

    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        try {
            this.COLECCION.insertOne(vehiculo);
            return vehiculo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
