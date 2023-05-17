/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import daos.AdministradorDAO;
import daos.FleteDAO;
import daos.ProductorDAO;
import daos.QuimicoDAO;
import daos.ResiduoDAO;
import daos.TransportistaDAO;
import daos.TrasladoDAO;
import daos.VehiculoDAO;

/**
 *
 * @author HP
 */
public interface IFabricaDAO {

    public AdministradorDAO crearAdministradorDAO();

    public FleteDAO crearFleteDAO();

    public ProductorDAO crearProductorDAO();

    public QuimicoDAO crearQuimicoDAO();

    public ResiduoDAO crearResiduoDAO();

    public TransportistaDAO crearTransportistaDAO();

    public TrasladoDAO crearTrasladoDAO();

    public VehiculoDAO crearVehiculoDAO();
}
