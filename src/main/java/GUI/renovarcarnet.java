/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.carnets;
import CONTROLADORES.controladorfuncionario;
import CONTROLADORES.ctrl_controladoravisos;
import static GUI.main.funcionarios;
import static GUI.main.jDesktopPane1;
import PERSISTENCIA.CPrincipal;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class renovarcarnet extends javax.swing.JInternalFrame {

    /**
     * Creates new form renovarcarnet
     */
    public static boolean activo = false;
    ctrl_controladoravisos ctrlavisos = new ctrl_controladoravisos();
    controladorfuncionario ctrlfuncionario = new controladorfuncionario();
    public static carnets carnefuncionario = new carnets();

    public renovarcarnet() {

        initComponents();
        activo = true;
        jLabelPropietario.setText(carnefuncionario.getFuncionariodueniodelcarne().getNombre());
        jLabelFechaVencimiento.setText(String.valueOf(carnefuncionario.getFechavencimiento()));
        jLabelTipoCarne.setText(carnefuncionario.getTipocarnet());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFechaVencimiento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelTipoCarne = new javax.swing.JLabel();
        jLabelPropietario = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(28, 28, 28));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Renovar Carnet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Fecha Actual de Vencimiento");

        jLabelFechaVencimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFechaVencimiento.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de Carne");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Propietario");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelTipoCarne.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipoCarne.setText("jLabel5");

        jLabelPropietario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPropietario.setText("jLabel6");

        jDateChooser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechaVencimiento)
                            .addComponent(jLabelTipoCarne)
                            .addComponent(jLabelPropietario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelFechaVencimiento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelTipoCarne))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date date = new Date();
        carnefuncionario.setFechaRenovacion(date);
        carnefuncionario.setFechavencimiento(jDateChooser.getDate());
        carnefuncionario.setEstado("Vigente");
        CPrincipal.getInstance().merge(carnefuncionario);
        main.funcionarios = ctrlfuncionario.cargarfuncionarios();

        ctrlavisos.avisarcarnevencido(main.funcionarios);
        if (funcionariosvencidos.activo == true) {
            funcionariosvencidos.cargartablaporvencer();
            funcionariosvencidos.cargartablavencidos();
        }
        JOptionPane.showMessageDialog(null, "Carnet Renovado con Exito!", null, JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        activo = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        activo = false;
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFechaVencimiento;
    private javax.swing.JLabel jLabelPropietario;
    private javax.swing.JLabel jLabelTipoCarne;
    // End of variables declaration//GEN-END:variables
}
