/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Flete;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class FleteNegocio {

    IDatos datos;

    public FleteNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Flete agregarFlete(Flete flete) {
        return datos.agregarFlete(flete);
    }
}
