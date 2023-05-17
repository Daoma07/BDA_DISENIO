/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Administrador;
import dominio.Usuario;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class AdministradorNegocio {

    IDatos datos;

    public AdministradorNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Administrador agregarAdministrador(Administrador administrador) {
        return datos.agregarAdministrador(administrador);
    }

    public Usuario encontrarUsuario(String usuario, String contrasenia) {
        return datos.encontrarUsuario(usuario, contrasenia);
    }
}
