/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.funcionario;
import CLASES.horarios;
import CONTROLADORES.controladorfuncionario;
import CONTROLADORES.ctrl_controladoravisos;
import CONTROLADORES.excel;
import PERSISTENCIA.CPrincipal;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author franc
 */
public class tabladehorarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form tabladehorarios
     */
    funcionario funcio;
    excel ex = new excel();
    public static List<horarios> horariosfuncio = new ArrayList<horarios>();
    public static boolean activo = false;
    controladorfuncionario CF =  new controladorfuncionario();
    ctrl_controladoravisos CA = new ctrl_controladoravisos();
    public tabladehorarios() {
        activo = true;
        initComponents();
        TableColumn sportColumn = TablaDatos.getColumnModel().getColumn(0);
        JComboBox comboBox = new JComboBox();
        CF.CargarCBoxFuncios(comboBox);
        sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
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
        TablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        TablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        TablaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "LUNES", "OCUP", "MARTES", "OCUP", "MIERCOLES", "OCUP", "JUEVES", "OCUP", "VIERNES", "OCUP", "SABADO", "OCUP", "DOMINGO", "OCUP"
            }
        ));
        TablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        TablaDatos.setSelectionForeground(new java.awt.Color(0, 204, 102));
        TablaDatos.setShowGrid(true);
        TablaDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Cargar tabla con excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.SystemColor.textHighlight);
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(java.awt.SystemColor.activeCaptionText);
        jButton4.setText("NuevaTupla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("IMPRIMIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton3)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addGap(115, 115, 115)
                .addComponent(jButton4)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String datosuwu;

       
        for (int i = 0; i < TablaDatos.getRowCount(); i++) {
             horariosfuncio.clear();
            funcio = controladorfuncionario.findfuncionario((String) TablaDatos.getValueAt(i, 0));
            if (funcio != null) {
                datosuwu = (String) TablaDatos.getValueAt(i, 1);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {

                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 2), "Lunes");
                }

                datosuwu = (String) TablaDatos.getValueAt(i, 3);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 4), "Martes");
                }

                datosuwu = (String) TablaDatos.getValueAt(i, 5);

                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 6), "Miercoles");
                }

                datosuwu = (String) TablaDatos.getValueAt(i, 7);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 8), "Jueves");
                }

                datosuwu = (String) TablaDatos.getValueAt(i, 9);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 10), "Viernes");

                }

                datosuwu = (String) TablaDatos.getValueAt(i, 11);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 12), "Sabado");

                }

                datosuwu = (String) TablaDatos.getValueAt(i, 13);
                if (!datosuwu.equals("descansa") || !(datosuwu.equals("desc."))) {
                    crearhorario(datosuwu, (String) TablaDatos.getValueAt(i, 14), "Domingo");
                }
                funcio.setHorariosdelfuncionario(horariosfuncio);
                System.out.println(funcio);
                CPrincipal.getInstance().merge(funcio);
            } else {
               //no existe el funcionario
            }
            CA.carteldeok();
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void crearhorario(String datosuwu, String ocup, String dia) {
        boolean masdeuno = false;
        String temporal;
        int contador = 1;
        String datos[];
        String madeunhorario[] = null;
        if (datosuwu.contains("/")) {
            masdeuno = true;
            contador++;
            madeunhorario = datosuwu.split("/"); //0 y 1 osea 2
        } else {

        }
        for (int i = 0; i < contador; i++) {
            if (masdeuno == true) {
                temporal = madeunhorario[i];
                datos = temporal.split("a");
            } else {
                datos = datosuwu.split("a");
            }
            horarios horariolunes = new horarios();
            horariolunes.setDia(dia);
            horariolunes.setOcupacion(ocup);
            horariolunes.setHoracomienzo(datos[0]);
            horariolunes.setHorafin(datos[1]);
            horariosfuncio.add(horariolunes);
            main.Horarios.add(horariolunes);
            horariolunes.setFuncionarioasignado(funcio);
            CPrincipal.getInstance().persist(horariolunes);
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser selecArchivo = new JFileChooser();
        File archivo;
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (.xlsx)", "xlsx"));
        if (selecArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = selecArchivo.getSelectedFile();
            if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                ex.procesarexcel2(archivo);
                JOptionPane.showMessageDialog(null, "Datos cargados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Elija un formato valido.");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        activo = true;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void TablaDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaDatosKeyPressed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaDatosKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)TablaDatos.getModel();
        modelo.addRow(new Object[1]);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       MessageFormat header = new MessageFormat("Report Print");
       MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            TablaDatos.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se puede imprimir %s%n",e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
