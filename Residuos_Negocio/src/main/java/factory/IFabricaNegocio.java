/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

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
public interface IFabricaNegocio {

    public AdministradorNegocio crearAdministradorNegocio();

    public FleteNegocio crearFleteNegocio();

    public ProductorNegocio crearProductorNegocio();

    public QuimicoNegocio crearQuimicoNegocio();

    public ResiduoNegocio crearResiduoNegocio();

    public TransportistaNegocio crearTransportistaNegocio();

    public TrasladoNegocio crearTrasladoNegocio();

    public VehiculoNegocio crearVehiculoNegocio();
}
