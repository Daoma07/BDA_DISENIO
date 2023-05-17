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
public class Quimico {

    private ObjectId id;
    private String nombre;

    public Quimico() {
    }

    /**
     * Crea una instancia de Quimico con el nombre especificado.
     *
     * @param nombre El nombre del químico.
     */
    public Quimico(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Crea una instancia de Quimico con el ID y el nombre especificados.
     *
     * @param id El ID del químico.
     * @param nombre El nombre del químico.
     */
    public Quimico(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del químico.
     *
     * @return El ID del químico.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del químico.
     *
     * @param id El ID del químico.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del químico.
     *
     * @return El nombre del químico.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del químico.
     *
     * @param nombre El nombre del químico.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Quimico other = (Quimico) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
