/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Productor;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class ProductorNegocio {

    IDatos datos;

    public ProductorNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Productor agregarProductor(Productor productor) {
        return datos.agregarProductor(productor);
    }

}
