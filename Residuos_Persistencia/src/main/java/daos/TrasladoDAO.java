/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Administrador;
import dominio.Traslado;
import interfaces.ITrasladoDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class TrasladoDAO implements ITrasladoDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Traslado> COLECCION;

    public TrasladoDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("traslados", Traslado.class);
    }

    @Override
    public Traslado agregarTraslado(Traslado traslado) {
        try {
            this.COLECCION.insertOne(traslado);
            return traslado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
