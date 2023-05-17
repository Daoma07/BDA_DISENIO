/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dominio.Productor;
import dominio.Usuario;
import fachada.INegocio;
import fachada.FachadaNegocio;
import formularios.FrmPrincipal;
import formularios.FrmProductor;
import formularios.FrmRegistrarResiduos;
import formularios.FrmRegistroTraslados;
import formularios.FrmSolicitudes;
import formularios.FrmSolicitudesTraslados;
import formularios.FrmVehiculos;
import formularios.Login;

/**
 *
 * @author HP
 */
public class FabricaFormularios extends IFabricaFormularios {

    private INegocio negocio;

    public FabricaFormularios() {
        this.negocio = new FachadaNegocio();
    }

    @Override
    public FrmPrincipal crearFormularioPrincipal(Usuario usuario) {
        return new FrmPrincipal(negocio, usuario);
    }

    @Override
    public FrmProductor crearFormularioProductor() {
        return new FrmProductor();
    }

    @Override
    public FrmRegistrarResiduos crearFormularioRegistrarResiduos(Usuario usuario) {
        return new FrmRegistrarResiduos(negocio, usuario);
    }

    @Override
    public FrmRegistroTraslados crearFormularioRegistroTraslados() {
        return new FrmRegistroTraslados();
    }

    @Override
    public FrmSolicitudes crearFormularioSolicitudes() {
        return new FrmSolicitudes();
    }

    @Override
    public FrmSolicitudesTraslados crearFormularioSolicitudesTraslados(Usuario usuario) {
        return new FrmSolicitudesTraslados(negocio, usuario);
    }

    @Override
    public FrmVehiculos crearFormularioVehiculos() {
        return new FrmVehiculos();
    }

    @Override
    public Login crearLogin() {
        return new Login(negocio);
    }

}
