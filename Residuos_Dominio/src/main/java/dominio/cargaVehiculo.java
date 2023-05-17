/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class cargaVehiculo {

    private ObjectId id;
    private Float cantidadCarga;
    private Float kilometraje;
    private Flete flete;
    private Vehiculo vehiculo;

    /**
     * Constructor sin argumentos de la clase cargaVehiculo.
     */
    public cargaVehiculo() {
    }

     /**
     * Constructor de la clase cargaVehiculo con parámetros.
     *
     * @param cantidadCarga La cantidad de carga del vehículo.
     * @param kilometraje El kilometraje del vehículo.
     * @param flete El flete asociado al vehículo.
     * @param vehiculo El vehículo relacionado con la carga.
     */
    public cargaVehiculo(Float cantidadCarga, Float kilometraje, Flete flete, Vehiculo vehiculo) {
        this.cantidadCarga = cantidadCarga;
        this.kilometraje = kilometraje;
        this.flete = flete;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor de la clase cargaVehiculo con parámetros.
     *
     * @param id El identificador de la carga del vehículo.
     * @param cantidadCarga La cantidad de carga del vehículo.
     * @param kilometraje El kilometraje del vehículo.
     * @param flete El flete asociado al vehículo.
     * @param vehiculo El vehículo relacionado con la carga.
     */
    public cargaVehiculo(ObjectId id, Float cantidadCarga, Float kilometraje, Flete flete, Vehiculo vehiculo) {
        this.id = id;
        this.cantidadCarga = cantidadCarga;
        this.kilometraje = kilometraje;
        this.flete = flete;
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el identificador de la carga del vehículo.
     *
     * @return El identificador de la carga.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la carga del vehículo.
     *
     * @param id El identificador de la carga.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la cantidad de carga del vehículo.
     *
     * @return La cantidad de carga del vehículo.
     */
    public Float getCantidadCarga() {
        return cantidadCarga;
    }

    /**
     * Establece la cantidad de carga del vehículo.
     *
     * @param cantidadCarga La cantidad de carga del vehículo.
     */
    public void setCantidadCarga(Float cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    /**
     * Obtiene el kilometraje del vehículo.
     *
     * @return El kilometraje del vehículo.
     */
    public Float getKilometraje() {
        return kilometraje;
    }

    /**
     * Establece el kilometraje del vehículo.
     *
     * @param kilometraje El kilometraje del vehículo.
     */
    public void setKilometraje(Float kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * Obtiene el flete asociado al vehículo.
     *
     * @return El flete asociado al vehículo.
     */
    public Flete getFlete() {
        return flete;
    }

    /**
 * Establece el flete asociado al vehículo.
 *
 * @param flete El flete a establecer.
 */
    public void setFlete(Flete flete) {
        this.flete = flete;
    }

    /**
     * Obtiene el vehículo relacionado con la carga.
     *
     * @return El vehículo relacionado con la carga.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo relacionado con la carga.
     *
     * @param vehiculo El vehículo a establecer.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
