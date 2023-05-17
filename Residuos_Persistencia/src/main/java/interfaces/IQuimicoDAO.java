/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Quimico;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IQuimicoDAO {

    public Quimico agregarQuimico(Quimico quimico);

    public List<Quimico> consutlarQuimicos();
}
