/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Traslado;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class TrasladoNegocio {

    IDatos datos;

    public TrasladoNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Traslado agregarTraslado(Traslado traslado) {
        return datos.agregarTraslado(traslado);
    }
}
