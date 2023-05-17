/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import daos.AdministradorDAO;
import daos.FleteDAO;
import daos.ProductorDAO;
import daos.QuimicoDAO;
import daos.ResiduoDAO;
import daos.TransportistaDAO;
import daos.TrasladoDAO;
import daos.VehiculoDAO;
import dominio.Administrador;
import dominio.Flete;
import dominio.Productor;
import dominio.Quimico;
import dominio.Residuo;
import dominio.Transportista;
import dominio.Traslado;
import dominio.Usuario;
import dominio.Vehiculo;
import factory.FabricaDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class FachadaDAOs implements IDatos {

    private AdministradorDAO administradorDAO;
    private FleteDAO fleteDAO;
    private ProductorDAO productorDAO;
    private QuimicoDAO quimicoDAO;
    private ResiduoDAO residuoDAO;
    private TransportistaDAO transportistaDAO;
    private TrasladoDAO trasladoDAO;
    private VehiculoDAO vehiculoDAO;

    public FachadaDAOs() {
        FabricaDAO fabrica = new FabricaDAO();
        this.administradorDAO = fabrica.crearAdministradorDAO();
        this.fleteDAO = fabrica.crearFleteDAO();
        this.productorDAO = fabrica.crearProductorDAO();
        this.quimicoDAO = fabrica.crearQuimicoDAO();
        this.residuoDAO = fabrica.crearResiduoDAO();
        this.transportistaDAO = fabrica.crearTransportistaDAO();
        this.trasladoDAO = fabrica.crearTrasladoDAO();
        this.vehiculoDAO = fabrica.crearVehiculoDAO();
    }

    //Administrador
    @Override
    public Administrador agregarAdministrador(Administrador administrador) {
        return administradorDAO.agregarAdministrador(administrador);
    }

    @Override
    public Usuario encontrarUsuario(String usuario, String contrasenia) {
        return administradorDAO.encontrarUsuario(usuario, contrasenia);
    }

    //Flete
    @Override
    public Flete agregarFlete(Flete flete) {
        return fleteDAO.agregarFlete(flete);
    }

    //Productor
    @Override
    public Productor agregarProductor(Productor productor) {
        return productorDAO.agregarProductor(productor);
    }

    //Quimico
    @Override
    public Quimico agregarQuimico(Quimico quimico) {
        return quimicoDAO.agregarQuimico(quimico);
    }

    @Override
    public List<Quimico> consutlarQuimicos() {
        return quimicoDAO.consutlarQuimicos();
    }

    //Residuo
    @Override
    public Residuo agregarResiduo(Residuo residuo) {
        return residuoDAO.agregarResiduo(residuo);
    }

    @Override
    public List<Residuo> consultarResiduos() {
        return residuoDAO.consultarResiduos();
    }

    @Override
    public Residuo buscarResiduo(String id) {
        return residuoDAO.buscarResiduo(id);
    }

    //Transportista
    @Override
    public Transportista agregarTransportista(Transportista transportista) {
        return transportistaDAO.agregarTransportista(transportista);
    }

    //Traslado
    @Override
    public Traslado agregarTraslado(Traslado traslado) {
        return trasladoDAO.agregarTraslado(traslado);
    }

    //Vehiculo
    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return vehiculoDAO.agregarVehiculo(vehiculo);
    }

}
