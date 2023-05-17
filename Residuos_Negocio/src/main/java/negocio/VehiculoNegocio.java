/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Vehiculo;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class VehiculoNegocio {

    IDatos datos;

    public VehiculoNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return datos.agregarVehiculo(vehiculo);
    }
}
