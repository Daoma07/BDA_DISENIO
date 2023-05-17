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
public class Tratamiento {

    private String detalle;
    private List<Residuo> residuos;

     /**
     * Constructor por defecto de la clase Tratamiento.
     */
    public Tratamiento() {
    }

    /**
     * Constructor de la clase Tratamiento que recibe el detalle y la lista de residuos.
     *
     * @param detalle   El detalle del tratamiento.
     * @param residuos  La lista de residuos asociados al tratamiento.
     */
    public Tratamiento(String detalle, List<Residuo> residuos) {
        this.detalle = detalle;
        this.residuos = residuos;
    }

    /**
     * Constructor de la clase Tratamiento que recibe solo el detalle.
     *
     * @param detalle   El detalle del tratamiento.
     */
    public Tratamiento(String detalle) {
        this.detalle = detalle;
    }

    /**
     * Constructor de la clase Tratamiento que recibe el ID, el detalle y la lista de residuos.
     *
     * @param id        El ID del tratamiento.
     * @param detalle   El detalle del tratamiento.
     * @param residuos  La lista de residuos asociados al tratamiento.
     */
    public Tratamiento(ObjectId id, String detalle, List<Residuo> residuos) {
        this.detalle = detalle;
        this.residuos = residuos;
    }

    /**
     * Obtiene el detalle del tratamiento.
     *
     * @return El detalle del tratamiento.
     */
    public String getDetalle() {
        return detalle;
    }

     /**
     * Establece el detalle del tratamiento.
     *
     * @param detalle El detalle del tratamiento.
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * Obtiene la lista de residuos asociados al tratamiento.
     *
     * @return La lista de residuos asociados al tratamiento.
     */
    public List<Residuo> getResiduos() {
        return residuos;
    }

    /**
     * Establece la lista de residuos asociados al tratamiento.
     *
     * @param residuos La lista de residuos asociados al tratamiento.
     */
    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }

}
