/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Transportista extends Usuario {

    private List<Flete> fletes;
    private List<Vehiculo> vehiculos;

    /**
     * Constructor vacío de la clase Transportista.
     */
    public Transportista() {
        setTipo("transportista");
    }

    /**
     * Constructor de la clase Transportista con parámetros.
     *
     * @param nombre El nombre del transportista.
     * @param rfc El RFC del transportista.
     * @param credencial La credencial del transportista.
     */
    public Transportista(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
        setTipo("transportista");
    }

    /**
     * Constructor de la clase Transportista con parámetros.
     *
     * @param id El ID del transportista.
     * @param nombre El nombre del transportista.
     * @param rfc El RFC del transportista.
     * @param credencial La credencial del transportista.
     */
    public Transportista(ObjectId id, String nombre, String rfc, Credencial credencial) {
        super(id, nombre, rfc, credencial);
        setTipo("transportista");
    }

    /**
     * Obtiene la lista de fletes asociados al transportista.
     *
     * @return La lista de fletes del transportista.
     */
    public List<Flete> getFletes() {
        return fletes;
    }

    /**
     * Establece la lista de fletes asociados al transportista.
     *
     * @param fletes La lista de fletes del transportista.
     */
    public void setFletes(List<Flete> fletes) {
        this.fletes = fletes;
    }

    /**
     * Obtiene la lista de vehículos asociados al transportista.
     *
     * @return La lista de vehículos del transportista.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece la lista de vehículos asociados al transportista.
     *
     * @param vehiculos La lista de vehículos del transportista.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
