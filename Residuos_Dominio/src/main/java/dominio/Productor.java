/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Productor extends Usuario {

    /**
     * Constructor vacío de la clase Productor.
     */
    public Productor() {
        setTipo("productor");
    }

    /**
     * Constructor de la clase Productor que recibe el nombre, el RFC y las
     * credenciales del productor.
     *
     * @param nombre El nombre del productor.
     * @param rfc El RFC del productor.
     * @param credencial Las credenciales del productor.
     */
    public Productor(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
        setTipo("productor");
    }

    /**
     * Constructor de la clase Productor que recibe el ID, el nombre, el RFC y
     * las credenciales del productor.
     *
     * @param id El ID del productor.
     * @param nombre El nombre del productor.
     * @param rfc El RFC del productor.
     * @param credencial Las credenciales del productor.
     */
    public Productor(ObjectId id, String nombre, String rfc, Credencial credencial) {
        super(id, nombre, rfc, credencial);
        setTipo("productor");
    }

}
