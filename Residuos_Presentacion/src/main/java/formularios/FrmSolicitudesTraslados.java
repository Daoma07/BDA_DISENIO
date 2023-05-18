/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dominio.Quimico;
import dominio.Residuo;
import dominio.Traslado;
import dominio.Unidad;
import dominio.Usuario;
import fachada.INegocio;
import factory.FabricaFormularios;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FrmSolicitudesTraslados extends javax.swing.JFrame {

    private INegocio negocio;
    private FabricaFormularios fabrica;
    private List<Residuo> residuosSeleccionados;
    private List<Residuo> listaResiduos;
    private Usuario usuario;

    /**
     * Creates new form FrmSolicitudesTraslados
     */
    public FrmSolicitudesTraslados(INegocio negocio, Usuario usuario) {
        initComponents();
        fabrica = new FabricaFormularios();
        this.negocio = negocio;
        this.usuario = usuario;
        residuosSeleccionados = new ArrayList<>();
        listaResiduos = negocio.consultarResiduos();
        this.llenarTablaResiduos();
    }

    /**
     * Metodo que llena la tabla tblQuimicosDisponibles, conforme al residuo
     * sleeccionado.
     */
    public void llenarTablaResiduoQuimicos() {
        int filaTabla = this.tblSolicitudesTraslado.getSelectedRow();
        String id = (String) tblSolicitudesTraslado.getValueAt(filaTabla, 0).toString();
        Residuo residuo = new Residuo();
        residuo = negocio.buscarResiduo(id);
        List<Quimico> quimicos = residuo.getQuimicos();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblQuimicosDisponibles.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        quimicos.forEach(quimico -> {
            Object[] fila = {
                quimico.getNombre()
            };
            modeloTabla.addRow(fila);
        });
    }

    public void llenarTablaResiduoQuimicosSeleccionadoss() {
        int filaTabla = this.tblSeleccionSolicitudes.getSelectedRow();
        String id = (String) tblSeleccionSolicitudes.getValueAt(filaTabla, 0).toString();
        Residuo residuo = new Residuo();
        residuo = negocio.buscarResiduo(id);
        List<Quimico> quimicos = residuo.getQuimicos();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblQuimicosSeleccionados.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        quimicos.forEach(quimico -> {
            Object[] fila = {
                quimico.getNombre()
            };
            modeloTabla.addRow(fila);
        });
    }

    /**
     * Metodo que llena la tabla tblSolicitudesTraslado con los residuos
     * almacenados.
     */
    public void llenarTablaResiduos() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSolicitudesTraslado.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        listaResiduos.forEach(residuo -> {
            Object[] fila = {
                residuo.getId(),
                residuo.getCodigo(),
                residuo.getNombre(),};
            modeloTabla.addRow(fila);
        });
    }

    /**
     * Metodo que llena la tabla tblSeleccionSolicitudes conforme a los residuos
     * seleccionados.
     */
    public void llenarTablaResiduoSeleccionado() {
        List<Residuo> listaResiduos = residuosSeleccionados;
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSeleccionSolicitudes.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        listaResiduos.forEach(residuo -> {
            Object[] fila = {
                residuo.getId(),
                residuo.getCodigo(),
                residuo.getNombre(),
                residuo.getCantidad(),
                residuo.getUnidad()
            };
            modeloTabla.addRow(fila);

        });
    }

    /**
     * Metodo que
     *
     */
    public void seleccionarResiduo() {
        int fila = this.tblSolicitudesTraslado.getSelectedRow();
        String id = (String) tblSolicitudesTraslado.getValueAt(fila, 0).toString();
        Residuo residuo = negocio.buscarResiduo(id);
        for (int i = 0; i < listaResiduos.size(); i++) {
            if (residuo.getCodigo() == listaResiduos.get(i).getCodigo()) {
                listaResiduos.remove(i);
            }
        }
        this.residuosSeleccionados.add(residuo);
        this.llenarTablaResiduos();
        this.llenarTablaResiduoSeleccionado();
    }

    public void seleccionarResiduoAsignar() {
        int fila = this.tblSeleccionSolicitudes.getSelectedRow();
        //String id = (String) tblSeleccionSolicitudes.getValueAt(fila, 0).toString();
        Float cantidad = Float.valueOf(this.txtCantidad.getText());
        String unidadSeleccionada = (String) this.cbxUnidades.getSelectedItem();
        Unidad unidad = null;
        if (unidadSeleccionada == "LITRO") {
            unidad = unidad.LITROS;
        } else {
            unidad = unidad.KILOGRAMOS;
        }

        residuosSeleccionados.get(fila).setCantidad(cantidad);
        residuosSeleccionados.get(fila).setUnidad(unidad);
        this.llenarTablaResiduoSeleccionado();
    }

    public boolean validadCampoCantidad() {
        if (txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo cantidad vacio...", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public boolean validaCampoFecha(){
        if(fecha.getDate() == null){
            JOptionPane.showMessageDialog(null, "Porfavor selecciona una fecha del selector...", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validaFechaSeleccionada(){
        LocalDate fechaActual = LocalDate.now();
        Date fechaAsignada = fecha.getDate();
        Date nuevaFechaActual = new Date(fechaActual.getYear()-1900, fechaActual.getMonthValue()-1,fechaActual.getDayOfMonth());
        int res = fechaAsignada.compareTo(nuevaFechaActual);
        System.out.println("FECHA ACTUAL: "+ nuevaFechaActual);
        System.out.println("FECHA SELECCIONADA: "+ fechaAsignada);
        if(res<0){
            JOptionPane.showMessageDialog(null, "La fecha asignada es menor a la actual...", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validarSeleccionResiduo(){
        if(residuosSeleccionados.size() == 0){
            JOptionPane.showMessageDialog(null, "Porfavor agrega minimo un residuo al traslado...", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validaAsignacionUnidadCantidad(){
        float cantidad = 0;
        Unidad unidadMedida = null;
        
        for (int i = 0; i < residuosSeleccionados.size(); i++) {
            cantidad = (float) tblSeleccionSolicitudes.getValueAt(i, 3);
            unidadMedida = (Unidad) tblSeleccionSolicitudes.getValueAt(i, 4);
            System.out.println("CANTIDAD"+cantidad);
            System.out.println("UNIDAD"+unidadMedida);
            if(cantidad <= 0 || unidadMedida == null){    
            JOptionPane.showMessageDialog(null, "Porfavor asigna una cantidad y unidad de medida al residuo...", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
            }
        }
        return true;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudesTraslado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSeleccionSolicitudes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxUnidades = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQuimicosDisponibles = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblQuimicosSeleccionados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitudes Traslados");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Solicitudes de Traslados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 20, -1, -1));

        tblSolicitudesTraslado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSolicitudesTraslado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSolicitudesTrasladoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSolicitudesTraslado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 153, 565, 160));

        tblSeleccionSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Cantidad", "Unidad Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSeleccionSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSeleccionSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSeleccionSolicitudes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 394, 565, 199));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Residuos Disponibles");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Residuos Seleccionados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 338, -1, -1));

        cbxUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LITRO", "KILOGRAMO" }));
        cbxUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 101, -1));

        jLabel4.setText("Unidad de Medida");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, 20));

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, -1, -1));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1153, 20, -1, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 181, -1));

        jLabel5.setText("Ingrese Fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, -1, -1));

        tblQuimicosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblQuimicosDisponibles);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 153, 147, 160));

        tblQuimicosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblQuimicosSeleccionados);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 394, 147, 199));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Quimicos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 105, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Quimicos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 364, -1, -1));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel8.setText("Ingrese la Cantidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void tblSolicitudesTrasladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSolicitudesTrasladoMouseClicked
        // TODO add your handling code here:
        this.llenarTablaResiduoQuimicos();
    }//GEN-LAST:event_tblSolicitudesTrasladoMouseClicked

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        this.seleccionarResiduo();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void tblSeleccionSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSeleccionSolicitudesMouseClicked
        // TODO add your handling code here:
        this.llenarTablaResiduoQuimicosSeleccionadoss();
    }//GEN-LAST:event_tblSeleccionSolicitudesMouseClicked

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        this.seleccionarResiduoAsignar();
        this.txtCantidad.setText("");
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void cbxUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUnidadesActionPerformed

    public void vaciarFormulario() {
        this.residuosSeleccionados.clear();
        this.listaResiduos.clear();
        this.listaResiduos = negocio.consultarResiduos();
        this.llenarTablaResiduoSeleccionado();
        this.llenarTablaResiduos();
    }

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        if (validaAsignacionUnidadCantidad() != false && validaCampoFecha() != false && validaFechaSeleccionada() != false && validarSeleccionResiduo() != false) {
            Traslado traslado = new Traslado(residuosSeleccionados, null, fecha.getDate(), null);
            if (negocio.agregarTraslado(traslado) != null) {
                JOptionPane.showMessageDialog(null, "Se agrego el Traslado");
                this.vaciarFormulario();
            }
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxUnidades;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblQuimicosDisponibles;
    private javax.swing.JTable tblQuimicosSeleccionados;
    private javax.swing.JTable tblSeleccionSolicitudes;
    private javax.swing.JTable tblSolicitudesTraslado;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
