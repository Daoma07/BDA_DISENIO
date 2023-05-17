/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Residuo;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public interface IResiduoDAO {

    public Residuo agregarResiduo(Residuo residuo);

    public List<Residuo> consultarResiduos();

    public Residuo buscarResiduo(String id);

}
