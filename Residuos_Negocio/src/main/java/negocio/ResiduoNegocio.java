/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Residuo;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author HP
 */
public class ResiduoNegocio {

    IDatos datos;

    public ResiduoNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Residuo agregarResiduo(Residuo residuo) {
        return datos.agregarResiduo(residuo);
    }

    public List<Residuo> consultarResiduos() {
        return datos.consultarResiduos();
    }

    public Residuo buscarResiduo(String id) {
        return datos.buscarResiduo(id);
    }
}
