/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import fachada.FachadaDAOs;
import fachada.IDatos;
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
public class FabricaNegocio implements IFabricaNegocio {

    private IDatos datos;

    public FabricaNegocio() {
        this.datos = new FachadaDAOs();
    }

    @Override
    public AdministradorNegocio crearAdministradorNegocio() {
        return new AdministradorNegocio(datos);
    }

    @Override
    public FleteNegocio crearFleteNegocio() {
        return new FleteNegocio(datos);
    }

    @Override
    public ProductorNegocio crearProductorNegocio() {
        return new ProductorNegocio(datos);
    }

    @Override
    public QuimicoNegocio crearQuimicoNegocio() {
        return new QuimicoNegocio(datos);
    }

    @Override
    public ResiduoNegocio crearResiduoNegocio() {
        return new ResiduoNegocio(datos);
    }

    @Override
    public TransportistaNegocio crearTransportistaNegocio() {
        return new TransportistaNegocio(datos);
    }

    @Override
    public TrasladoNegocio crearTrasladoNegocio() {
        return new TrasladoNegocio(datos);
    }

    @Override
    public VehiculoNegocio crearVehiculoNegocio() {
        return new VehiculoNegocio(datos);
    }

}
