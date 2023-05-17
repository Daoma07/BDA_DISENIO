/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Administrador;
import dominio.Usuario;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IAdministradorDAO {

    public Administrador agregarAdministrador(Administrador administrador);

    public Usuario encontrarUsuario(String usuario, String contrasenia);
}
