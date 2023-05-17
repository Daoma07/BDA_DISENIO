/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Quimico;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author HP
 */
public class QuimicoNegocio {

    IDatos datos;

    public QuimicoNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Quimico agregarQuimico(Quimico quimico) {
        return datos.agregarQuimico(quimico);
    }

    public List<Quimico> consutlarQuimicos() {
        return datos.consutlarQuimicos();
    }
}
