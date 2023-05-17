/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import daos.AdministradorDAO;
import daos.ProductorDAO;
import daos.ResiduoDAO;
import dominio.Administrador;
import dominio.Credencial;
import dominio.Productor;
import dominio.Residuo;
import dominio.Usuario;
import factory.FabricaDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaDAO fabrica = new FabricaDAO();

        ResiduoDAO residuo = fabrica.crearResiduoDAO();

        Residuo residuoo = residuo.buscarResiduo("64645f525f41805980591b12");

        if (residuoo != null) {
            System.out.println(residuoo.getCodigo());
        }

//
////        ProductorDAO productor = fabrica.crearProductorDAO();
////
////        Credencial credencial = new Credencial("daniell", "1234");
////        Productor productorNuevo = new Productor("DAniel", "asdd", credencial);
////
////        productor.agregarProductor(productorNuevo);
//        //   AdministradorDAO administrador = fabrica.crearAdministradorDAO();
//        ProductorDAO productor = fabrica.crearProductorDAO();
////
//        Credencial credencial111 = new Credencial("daniell", "12344");
//        //  Administrador administradorNuevo = new Administrador("DAniel", "asdasd", credencial2);
//        Productor administradorNuevo = new Productor("DAniel", "asdaasdasdsd", credencial111);
//
//        // administrador.agregarAdministrador(administradorNuevo);
//        productor.agregarProductor(administradorNuevo);
////
////        Usuario ad = administrador.encontrarUsuario("daniel", "1234");
////
////        if (ad != null) {
////            System.out.println("goasd");
////        }
    }

}
