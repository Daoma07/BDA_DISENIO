/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Destino {

    private String calle;
    private String numero;
    private String colonia;
    private Calendar fechaLlegada;

    /**
     * Constructor predeterminado de la clase Destino. Crea una instancia de
     * Destino sin inicializar sus atributos.
     */
    public Destino() {
    }

    /**
     * Constructor de la clase Destino que recibe la calle, número, colonia y fecha de llegada.
     *
     * @param calle        La calle del destino.
     * @param numero       El número del destino.
     * @param colonia      La colonia del destino.
     * @param fechaLlegada La fecha de llegada al destino.
     */
    public Destino(String calle, String numero, String colonia, Calendar fechaLlegada) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * Obtiene la calle del destino.
     *
     * @return La calle del destino.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle del destino.
     *
     * @param calle La calle del destino a establecer.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número del destino.
     *
     * @return El número del destino.
     */
    public String getNumero() {
        return numero;
    }

     /**
     * Establece el número del destino.
     *
     * @param numero El número del destino a establecer.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia del destino.
     *
     * @return La colonia del destino.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia del destino.
     *
     * @param colonia La colonia del destino a establecer.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene la fecha de llegada al destino.
     *
     * @return La fecha de llegada al destino.
     */
    public Calendar getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Establece la fecha de llegada al destino.
     *
     * @param fechaLlegada La fecha de llegada al destino a establecer.
     */
    public void setFechaLlegada(Calendar fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

}
