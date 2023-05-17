/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Transportista;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class TransportistaNegocio {

    IDatos datos;

    public TransportistaNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Transportista agregarTransportista(Transportista transportista) {
        return datos.agregarTransportista(transportista);
    }
}
