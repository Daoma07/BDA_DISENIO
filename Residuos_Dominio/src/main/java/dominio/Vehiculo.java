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
public class Vehiculo {

    private ObjectId id;
    private String matricula;
    private String tipo;
    private Transportista transportista;
    private List<cargaVehiculo> cargasVehiculo;

    /**
     * Crea un nuevo objeto Vehiculo sin parámetros.
     */
    public Vehiculo() {
    }

    /**
     * Crea un nuevo objeto Vehiculo con la matrícula, el tipo y el transportista especificados.
     *
     * @param matricula    La matrícula del vehículo.
     * @param tipo         El tipo de vehículo.
     * @param transportista El transportista asociado al vehículo.
     */
    public Vehiculo(String matricula, String tipo, Transportista transportista) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.transportista = transportista;
    }

    /**
     * Crea un nuevo objeto Vehiculo con la matrícula y el tipo especificados.
     *
     * @param matricula La matrícula del vehículo.
     * @param tipo      El tipo de vehículo.
     */
    public Vehiculo(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    /**
     * Crea un nuevo objeto Vehiculo con el ID, la matrícula, el tipo y el transportista especificados.
     *
     * @param id           El ID del vehículo.
     * @param matricula    La matrícula del vehículo.
     * @param tipo         El tipo de vehículo.
     * @param transportista El transportista asociado al vehículo.
     */
    public Vehiculo(ObjectId id, String matricula, String tipo, Transportista transportista) {
        this.id = id;
        this.matricula = matricula;
        this.tipo = tipo;
        this.transportista = transportista;
    }

    /**
     * Obtiene el ID del vehículo.
     *
     * @return El ID del vehículo.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del vehículo.
     *
     * @param id El nuevo ID del vehículo.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la matrícula del vehículo.
     *
     * @return La matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     *
     * @param matricula La nueva matrícula del vehículo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return El tipo de vehículo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de vehículo.
     *
     * @param tipo El nuevo tipo de vehículo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el transportista asociado al vehículo.
     *
     * @return El transportista asociado al vehículo.
     */
    public Transportista getTransportista() {
        return transportista;
    }

    /**
     * Establece el transportista asociado al vehículo.
     *
     * @param transportista El nuevo transportista asociado al vehículo.
     */
    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    /**
     * Obtiene la lista de cargas del vehículo.
     *
     * @return La lista de cargas del vehículo.
     */
    public List<cargaVehiculo> getCargasVehiculo() {
        return cargasVehiculo;
    }

     /**
     * Establece la lista de cargas del vehículo.
     *
     * @param cargasVehiculo La nueva lista de cargas del vehículo.
     */
    public void setCargasVehiculo(List<cargaVehiculo> cargasVehiculo) {
        this.cargasVehiculo = cargasVehiculo;
    }

}
