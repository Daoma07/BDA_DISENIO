/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dominio.Productor;
import dominio.Usuario;
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
public abstract class IFabricaFormularios {

    public abstract FrmPrincipal crearFormularioPrincipal(Usuario usuario);

    public abstract FrmProductor crearFormularioProductor();

    public abstract FrmRegistrarResiduos crearFormularioRegistrarResiduos(Usuario usuario);

    public abstract FrmRegistroTraslados crearFormularioRegistroTraslados();

    public abstract FrmSolicitudes crearFormularioSolicitudes();

    public abstract FrmSolicitudesTraslados crearFormularioSolicitudesTraslados(Usuario usuario);

    public abstract FrmVehiculos crearFormularioVehiculos();

    public abstract Login crearLogin();

}
