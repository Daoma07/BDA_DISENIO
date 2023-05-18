/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dominio.Administrador;
import dominio.Productor;
import dominio.Transportista;
import dominio.Usuario;
import fachada.INegocio;
import factory.FabricaFormularios;
import dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    private INegocio negocio;
    private FabricaFormularios fabrica;
    private Usuario usuario;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(INegocio negocio, Usuario usuario) {
        initComponents();
        fabrica = new FabricaFormularios();
        this.negocio = negocio;
        this.usuario = usuario;
        this.esconderBotones();
        this.validarUsuario();
        // JOptionPane.showMessageDialog(null, usuario.toString());
    }
    
    public void esconderBotones() {
        
        this.btnRegistrarResiduoProductor.setVisible(false);
        this.btnSolicitarTrasladoProductor.setVisible(false);
        this.btnRegistrarTrasladoTransportista.setVisible(false);
        this.btnVerTrasladosAdministrador.setVisible(false);
    }
    
    public void validarUsuario() {
        
        if (null != usuario.getTipo()) {
            switch (usuario.getTipo()) {
                case "productor":
                    // JOptionPane.showMessageDialog(null, usuario.toString());
                    this.btnRegistrarResiduoProductor.setVisible(true);
                    this.btnSolicitarTrasladoProductor.setVisible(true);
                    break;
                case "administrador":
                    this.btnVerTrasladosAdministrador.setVisible(true);
                    break;
                case "transportista":
                    this.btnRegistrarTrasladoTransportista.setVisible(true);
                    break;
                default:
                    break;
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVerTrasladosAdministrador = new javax.swing.JButton();
        btnRegistrarResiduoProductor = new javax.swing.JButton();
        btnSolicitarTrasladoProductor = new javax.swing.JButton();
        btnRegistrarTrasladoTransportista = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 139, 133));

        btnVerTrasladosAdministrador.setBackground(new java.awt.Color(51, 139, 133));
        btnVerTrasladosAdministrador.setText("Ver Traslados");
        btnVerTrasladosAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTrasladosAdministradorActionPerformed(evt);
            }
        });

        btnRegistrarResiduoProductor.setBackground(new java.awt.Color(51, 139, 133));
        btnRegistrarResiduoProductor.setText("Registrar Residuo");
        btnRegistrarResiduoProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarResiduoProductorActionPerformed(evt);
            }
        });

        btnSolicitarTrasladoProductor.setBackground(new java.awt.Color(51, 139, 133));
        btnSolicitarTrasladoProductor.setText("Solicitar Traslado");
        btnSolicitarTrasladoProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarTrasladoProductorActionPerformed(evt);
            }
        });

        btnRegistrarTrasladoTransportista.setBackground(new java.awt.Color(51, 139, 133));
        btnRegistrarTrasladoTransportista.setText("Registrar Traslado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerTrasladosAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarResiduoProductor, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(btnSolicitarTrasladoProductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarTrasladoTransportista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnRegistrarResiduoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSolicitarTrasladoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarTrasladoTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerTrasladosAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 739, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSolicitarTrasladoProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarTrasladoProductorActionPerformed
        fabrica.crearFormularioSolicitudesTraslados(usuario).setVisible(true);
    }//GEN-LAST:event_btnSolicitarTrasladoProductorActionPerformed

    private void btnRegistrarResiduoProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarResiduoProductorActionPerformed
        // TODO add your handling code here:

        fabrica.crearFormularioRegistrarResiduos(usuario).setVisible(true);
    }//GEN-LAST:event_btnRegistrarResiduoProductorActionPerformed

    private void btnVerTrasladosAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTrasladosAdministradorActionPerformed
        // TODO add your handling code here:
        fabrica.crearFormularioSolicitudes().setVisible(true);
    }//GEN-LAST:event_btnVerTrasladosAdministradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarResiduoProductor;
    private javax.swing.JButton btnRegistrarTrasladoTransportista;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnSolicitarTrasladoProductor;
    private javax.swing.JButton btnVerTrasladosAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
