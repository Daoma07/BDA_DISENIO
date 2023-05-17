/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Usuario {

    /**
     * Atributos de un usario autenticado
     */
    private ObjectId id;
    private String nombre;
    private String rfc;
    private Credencial credencial;
    private String tipo;

    /**
     * Constructor sin argumentos de la clase Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre del usuario.
     * @param rfc RFC del usuario.
     * @param credencial Credenciales del usuario.
     */
    public Usuario(String nombre, String rfc, Credencial credencial) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.credencial = credencial;
    }

    /**
     * Constructor de la clase Usuario.
     *
     * @param id Identificador único del usuario.
     * @param nombre Nombre del usuario.
     * @param rfc RFC del usuario.
     * @param credencial Credenciales del usuario.
     */
    public Usuario(ObjectId id, String nombre, String rfc, Credencial credencial) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.credencial = credencial;
    }

    /**
     * Obtiene el identificador del usuario.
     *
     * @return El identificador del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param id El identificador del usuario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el RFC del usuario.
     *
     * @return El RFC del usuario.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del usuario.
     *
     * @param rfc El RFC del usuario.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene las credenciales del usuario.
     *
     * @return Las credenciales del usuario.
     */
    public Credencial getCredencial() {
        return credencial;
    }

    /**
     * Establece las credenciales del usuario.
     *
     * @param credencial Las credenciales del usuario.
     */
    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + ", credencial=" + credencial + ", tipo=" + tipo + '}';
    }

}
