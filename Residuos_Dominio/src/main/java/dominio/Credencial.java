/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * La clase Credencial representa las credenciales de usuario para acceder al
 * sistema.
 *
 * @author HP
 */
public class Credencial {

    private String usuario;
    private String contrasenia;

    public Credencial() {
    }

    /**
     * Constructor de la clase Credencial que recibe el nombre de usuario y
     * contraseña.
     *
     * @param usuario El nombre de usuario.
     * @param contrasenia La contraseña.
     */
    public Credencial(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param usuario El nombre de usuario a establecer.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña.
     *
     * @return La contraseña.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña.
     *
     * @param contrasenia La contraseña a establecer.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
