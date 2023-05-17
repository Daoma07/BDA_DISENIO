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
public class Flete {

    private ObjectId id;
    private Traslado traslado;
    private Transportista transportista;
    private int numeroVehiculos;
    private Float kilometrajeRecorridos;
    private Float costeTrabajo;
    private Float cantidadTransportada;
    private Destino destino;
    private List<cargaVehiculo> cargasVehiculo;

    /**
     * Constructor predeterminado de la clase Flete.
     * Crea una instancia de Flete sin inicializar sus atributos.
     */
    public Flete() {
    }

     /**
     * Constructor de la clase Flete que recibe el traslado, transportista, destino y cargas de vehículo.
     *
     * @param traslado        El traslado asociado al flete.
     * @param transportista   El transportista encargado del flete.
     * @param destino         El destino del flete.
     * @param cargasVehiculo  Las cargas de vehículo del flete.
     */
    public Flete(Traslado traslado, Transportista transportista, Destino destino, List<cargaVehiculo> cargasVehiculo) {
        this.traslado = traslado;
        this.transportista = transportista;
        this.destino = destino;
        this.cargasVehiculo = cargasVehiculo;
    }

    /**
     * Constructor de la clase Flete que recibe el ID, traslado, transportista, número de vehículos, kilometraje recorrido, coste de trabajo, cantidad transportada, destino y cargas de vehículo.
     *
     * @param id                   El ID del flete.
     * @param traslado             El traslado asociado al flete.
     * @param transportista        El transportista encargado del flete.
     * @param numeroVehiculos      El número de vehículos utilizados en el flete.
     * @param kilometrajeRecorridos El kilometraje recorrido en el flete.
     * @param costeTrabajo         El coste de trabajo del flete.
     * @param cantidadTransportada La cantidad transportada en el flete.
     * @param destino              El destino del flete.
     * @param cargasVehiculo       Las cargas de vehículo del flete.
     */
    public Flete(ObjectId id, Traslado traslado, Transportista transportista, int numeroVehiculos, Float kilometrajeRecorridos, Float costeTrabajo, Float cantidadTransportada, Destino destino, List<cargaVehiculo> cargasVehiculo) {
        this.id = id;
        this.traslado = traslado;
        this.transportista = transportista;
        this.numeroVehiculos = numeroVehiculos;
        this.kilometrajeRecorridos = kilometrajeRecorridos;
        this.costeTrabajo = costeTrabajo;
        this.cantidadTransportada = cantidadTransportada;
        this.destino = destino;
        this.cargasVehiculo = cargasVehiculo;
    }

    /**
     * Obtiene el ID del flete.
     *
     * @return El ID del flete.
     */
    public ObjectId getId() {
        return id;
    }

     /**
     * Establece el ID del flete.
     *
     * @param id el ID del flete a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el Traslado del flete.
     * 
     * @return El Traslado del flete.
     */
    public Traslado getTraslado() {
        return traslado;
    }

    /**
     * Establece el Traslado del flete.
     *
     * @param traslado el Traslado del flete a establecer.
     */
    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    /**
     * Obtiene el Transportista del flete.
     *
     * @return El Transportista del flete.
     */
    public Transportista getTransportista() {
        return transportista;
    }

    /**
     * Establece el Transportista del flete.
     *
     * @param transportista el Transportista del flete a establecer.
     */
    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    /**
     * Obtiene el numero de Vehiculos del flete.
     *
     * @return El numero de Vehiculos del flete.
     */
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    /**
     * Establece el Numero de Vehiculos del flete.
     *
     * @param numeroVehiculos el Numero de Vehiculos del flete a establecer.
     */
    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    /**
     * Obtiene el Kilometraje Recorrido del flete.
     *
     * @return El Kilometraje Recorrido del flete.
     */
    public Float getKilometrajeRecorridos() {
        return kilometrajeRecorridos;
    }

    /**
     * Establece el Kilometraje Recorrido del flete.
     *
     * @param kilometrajeRecorridos el Kilometraje Recorrido del flete a establecer.
     */
    public void setKilometrajeRecorridos(Float kilometrajeRecorridos) {
        this.kilometrajeRecorridos = kilometrajeRecorridos;
    }

    /**
     * Obtiene el Costo del flete.
     *
     * @return El Costo del flete.
     */
    public Float getCosteTrabajo() {
        return costeTrabajo;
    }

    /**
     * Establece el Costo del flete.
     *
     * @param costeTrabajo el costo del flete a establecer.
     */
    public void setCosteTrabajo(Float costeTrabajo) {
        this.costeTrabajo = costeTrabajo;
    }

    /**
     * Obtiene La cantidad transportada del flete.
     *
     * @return La cantidad transportada del flete.
     */
    public Float getCantidadTransportada() {
        return cantidadTransportada;
    }

    /**
     * Establece La cantidad transportada del flete.
     *
     * @param cantidadTransportada La cantidad transportada flete a establecer.
     */
    public void setCantidadTransportada(Float cantidadTransportada) {
        this.cantidadTransportada = cantidadTransportada;
    }

     /**
     * Obtiene El Destino del flete.
     *
     * @return El Destino del flete.
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * Establece El Destino del flete.
     *
     * @param destino El Destino del flete a establecer.
     */
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    /**
     * Obtiene La carga del Vehiculo del flete.
     *
     * @return La carga del Vehiculo del flete.
     */
    public List<cargaVehiculo> getCargasVehiculo() {
        return cargasVehiculo;
    }

    /**
     * Establece La carga del Vehiculo del flete.
     *
     * @param cargasVehiculo La carga del Vehiculo a establecer.
     */
    public void setCargasVehiculo(List<cargaVehiculo> cargasVehiculo) {
        this.cargasVehiculo = cargasVehiculo;
    }

}
