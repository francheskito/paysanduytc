/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.funcionario;
import CLASES.horarios;
import static GUI.administrarfuncionarios.mdl1;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class listarhorarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form listarhorarios
     */
        int contadorglobal =0; 
        public static boolean activo = false;
    public listarhorarios() {
        activo=true;
        initComponents();
        cargartabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mdl1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 28, 28));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        mdl1.setBackground(new java.awt.Color(28, 28, 28));
        mdl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dia", "Horario Inicio", "Horario Fin", "Funcionario"
            }
        ));
        jScrollPane1.setViewportView(mdl1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        activo=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing
public void cargartabla() {
    
        DefaultTableModel md1 = (DefaultTableModel) mdl1.getModel();
        md1.setRowCount(0);
        Iterator<funcionario> it = main.funcionarios.iterator();
        while (it.hasNext()) {
            funcionario next = it.next();
                
                Iterator<horarios> it2 =next.getHorariosdelfuncionario().iterator();
                while (it2.hasNext()) { 
                horarios next1 = it2.next();
                Object[] fila = new Object[4];
                fila[0] = next+" "+next.getApellido();
                fila[1] = next1.getDia();
                fila[2] = next1.getHoracomienzo();
                fila[3] = next1.getHorafin();
               md1.addRow(fila);

            }
               
              // fila[3] = next.getFuncionariosasignados().get(contadorglobal).getNombre()+" "+next.getFuncionariosasignados().get(contadorglobal).getApellido();
            
                

        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mdl1;
    // End of variables declaration//GEN-END:variables
}
