/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.Administrador;
import dominio.Flete;
import dominio.Productor;
import dominio.Quimico;
import dominio.Residuo;
import dominio.Transportista;
import dominio.Traslado;
import dominio.Usuario;
import dominio.Vehiculo;
import fachada.IDatos;
import factory.FabricaNegocio;
import java.util.List;
import negocio.AdministradorNegocio;
import negocio.FleteNegocio;
import negocio.ProductorNegocio;
import negocio.QuimicoNegocio;
import negocio.ResiduoNegocio;
import negocio.TransportistaNegocio;
import negocio.TrasladoNegocio;
import negocio.VehiculoNegocio;

/**
 *
 * @author HP
 */
public class FachadaNegocio implements INegocio {

    private AdministradorNegocio administradorNegocio;
    private FleteNegocio fleteNegocio;
    private ProductorNegocio productorNegocio;
    private QuimicoNegocio quimicoNegocio;
    private ResiduoNegocio residuoNegocio;
    private TransportistaNegocio transportistaNegocio;
    private TrasladoNegocio trasladoNegocio;
    private VehiculoNegocio vehiculoNegocio;

    public FachadaNegocio() {
        FabricaNegocio fabrica = new FabricaNegocio();
        this.administradorNegocio = fabrica.crearAdministradorNegocio();
        this.fleteNegocio = fabrica.crearFleteNegocio();
        this.productorNegocio = fabrica.crearProductorNegocio();
        this.quimicoNegocio = fabrica.crearQuimicoNegocio();
        this.residuoNegocio = fabrica.crearResiduoNegocio();
        this.transportistaNegocio = fabrica.crearTransportistaNegocio();
        this.trasladoNegocio = fabrica.crearTrasladoNegocio();
        this.vehiculoNegocio = fabrica.crearVehiculoNegocio();
    }

    @Override
    public Administrador agregarAdministrador(Administrador administrador) {
        return administradorNegocio.agregarAdministrador(administrador);
    }

    @Override
    public Usuario encontrarUsuario(String usuario, String contrasenia) {
        return administradorNegocio.encontrarUsuario(usuario, contrasenia);
    }

    @Override
    public Flete agregarFlete(Flete flete) {
        return fleteNegocio.agregarFlete(flete);
    }

    @Override
    public Productor agregarProductor(Productor productor) {
        return productorNegocio.agregarProductor(productor);
    }

    @Override
    public Quimico agregarQuimico(Quimico quimico) {
        return quimicoNegocio.agregarQuimico(quimico);
    }

    @Override
    public List<Quimico> consutlarQuimicos() {
        return quimicoNegocio.consutlarQuimicos();
    }

    @Override
    public Residuo agregarResiduo(Residuo residuo) {
        return residuoNegocio.agregarResiduo(residuo);
    }

    @Override
    public List<Residuo> consultarResiduos() {
        return residuoNegocio.consultarResiduos();
    }

    @Override
    public Residuo buscarResiduo(String id) {
        return residuoNegocio.buscarResiduo(id);
    }

    @Override
    public Transportista agregarTransportista(Transportista transportista) {
        return transportistaNegocio.agregarTransportista(transportista);
    }

    @Override
    public Traslado agregarTraslado(Traslado traslado) {
        return trasladoNegocio.agregarTraslado(traslado);
    }

    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return vehiculoNegocio.agregarVehiculo(vehiculo);
    }

}
