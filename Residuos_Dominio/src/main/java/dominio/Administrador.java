/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.bson.types.ObjectId;

/**
 * La clase Administrador representa a un administrador en el sistema. Extiende
 * la clase Usuario y hereda sus propiedades y métodos.
 *
 * @author HP
 */
public class Administrador extends Usuario {

    /**
     * Constructor predeterminado de la clase Administrador. Crea una instancia
     * de Administrador sin inicializar sus atributos.
     */
    public Administrador() {
        setTipo("administrador");

    }

    /**
     * Constructor de la clase Administrador que recibe el nombre, RFC y
     * credencial del administrador.
     *
     * @param nombre El nombre del administrador.
     * @param rfc El RFC del administrador.
     * @param credencial La credencial del administrador.
     */
    public Administrador(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
        setTipo("administrador");

    }

    /**
     * Constructor de la clase Administrador que recibe el ID, nombre, RFC y
     * credencial del administrador.
     *
     * @param id El ID del administrador.
     * @param nombre El nombre del administrador.
     * @param rfc El RFC del administrador.
     * @param credencial La credencial del administrador.
     */
    public Administrador(ObjectId id, String nombre, String rfc, Credencial credencial) {
        super(id, nombre, rfc, credencial);
        setTipo("administrador");
    }

}
