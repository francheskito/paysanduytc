/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.cargo;
import CLASES.carnets;
import CLASES.funcionario;
import CLASES.obtienecargo;
import CONTROLADORES.controladorfuncionario;
import PERSISTENCIA.CPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class addfuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form addfuncionario
     */
    public static funcionario funcio2 = null;
    controladorfuncionario CF = new controladorfuncionario();
    public static boolean activo = false;
    public Icon icono = new ImageIcon(getClass().getResource("/META-INF/check.png"));
    JLabel label = new JLabel();

    public addfuncionario() {
        initComponents();
        jDateChooserBrebet.setVisible(false);
        jDateChooserCarnet.setVisible(false);
        jDateChooserLibreta.setVisible(false);
        CF.CargarCBoxCargos();
        jButtonModificar.setEnabled(false);
        activo = true;
        
        if (funcio2 == null) {
            jButtonAgregar.setEnabled(true);
            jButtonModificar.setEnabled(false);
        } else {
            jTextFieldNombre.setText(funcio2.getNombre());
            jTextFieldApeliido.setText(funcio2.getApellido());

            jTextFieldCedula.setText(String.valueOf(funcio2.getCedula()));
            jTextFieldCelular.setText(funcio2.getCelular());
            jLabel6.setText("");
            jComboBoxCargo.setVisible(false);
            jDateChooserCarnet.setVisible(false);
            jDateChooserBrebet.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jDateChooserFecha.setDate(funcio2.getFechaNacimiento());

            jButtonAgregar.setEnabled(false);
            jButtonModificar.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jDateChooserBrebet = new com.toedter.calendar.JDateChooser();
        jDateChooserCarnet = new com.toedter.calendar.JDateChooser();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApeliido = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserLibreta = new com.toedter.calendar.JDateChooser();
        jCheckBox3 = new javax.swing.JCheckBox();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("F.N");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Celular");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jComboBoxCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jComboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 230, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Cargo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 289, -1, 30));

        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox1.setText("Brebet");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 337, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox2.setText("Carnet Salud");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 384, -1, -1));

        jDateChooserBrebet.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooserBrebet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 332, 153, -1));

        jDateChooserCarnet.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooserCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 379, 153, -1));

        jDateChooserFecha.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 151, 257, -1));

        jButtonModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 516, -1, -1));

        jButtonAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 516, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 16, 257, -1));

        jTextFieldApeliido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldApeliido, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 61, 257, -1));

        jTextFieldCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 106, 257, -1));

        jTextFieldCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularActionPerformed(evt);
            }
        });
        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 210, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 110, -1, -1));

        jDateChooserLibreta.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooserLibreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 438, 153, -1));

        jCheckBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox3.setText("Libreta de Conducir");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 443, -1, -1));

        jDateChooserIngreso.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooserIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fecha Ingreso");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            jDateChooserBrebet.setVisible(true);
        } else {
            jDateChooserBrebet.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ItemStateChanged
    public boolean validarDNI(String input) {
        String[] cedulaString = input.split("");
        int[] constantes = {2, 9, 8, 7, 6, 3, 4};
        int s = 0, h = 0;

        /* Pasar de cadena de String a cadena de enteros*/
        int size = cedulaString.length;
        int[] cedulaInt = new int[size];
        for (int i = 0; i < size; i++) {
            cedulaInt[i] = Integer.parseInt(cedulaString[i]);
        }
        /*--------------------------------------------------*/

        if (cedulaInt.length == 8) {
            for (int i = 0; i <= 6; i++) {
                s = s + (cedulaInt[i] * constantes[i]);
            }
            h = (10 - (s % 10)) % 10;
        }
        if (cedulaInt[7] == h) {
            return true;
        }
        return false;
    }
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        JLabel msg = new JLabel();
        msg.setText("<html>");
        String nombre, apellido, celular;
        String cedula = jTextFieldCedula.getText();
        Date fn, datebrebet, datecarnet, datelibreta, dateingreso;
        cargo pepe;
        boolean tienecarne = false, tienebrebet = false, tienelibreta = false;
        if (cedula.isBlank()) {
            msg.setText(msg.getText() + "Falta compleatar campo cedula <br>");
            jTextFieldCedula.setBackground(Color.red);
        } else if (cedula.length() != 8 || !validarDNI(cedula)) {
            msg.setText(msg.getText() + "La cedula es invalida <br>");
            jTextFieldCedula.setBackground(Color.red);
        }
        if (jCheckBox1.isSelected()) {
            tienebrebet = true;
        }

        if (jCheckBox2.isSelected()) {
            tienecarne = true;
        }
        if (jCheckBox3.isSelected()) {
            tienelibreta = true;
        }
        nombre = jTextFieldNombre.getText();
        apellido = jTextFieldApeliido.getText();
        celular = jTextFieldCelular.getText();

        fn = jDateChooserFecha.getDate();
        datebrebet = jDateChooserBrebet.getDate();
        datecarnet = jDateChooserCarnet.getDate();
        datelibreta = jDateChooserLibreta.getDate();
        dateingreso = jDateChooserIngreso.getDate();
        if (nombre.isBlank()) {

            msg.setText(msg.getText() + "Falta compleatar campo nombre <br>");
            jTextFieldNombre.setBackground(Color.red);
        }
        if (apellido.isBlank()) {
            msg.setText(msg.getText() + "Falta compleatar campo apellido <br>");
            jTextFieldApeliido.setBackground(Color.red);
        }
        if (celular.isBlank()) {
            msg.setText(msg.getText() + "Falta compleatar campo celular <br>");
            jTextFieldCelular.setBackground(Color.red);
        }
        if (tienecarne) {
            if (checkvaliddate(datecarnet) == true) {
                msg.setText(msg.getText() + "Fecha Carnet Vencida <br>");
            } else {

            }
        }
        if (tienelibreta) {
            if (checkvaliddate(datelibreta) == true) {
                msg.setText(msg.getText() + "Fecha Libreta Vencida <br>");
            } else {

            }
        }
        if (tienebrebet) {
            if (checkvaliddate(datebrebet) == true) {
                msg.setText(msg.getText() + "Fecha Brebet Vencida <br>");
            } else {

            }
        }
        if (msg.getText().equals("<html>")) {
            pepe = (cargo) jComboBoxCargo.getSelectedItem();
            funcionario funcionarioo = new funcionario();
            funcionarioo.setNombre(nombre);
            funcionarioo.setApellido(apellido);
            funcionarioo.setCelular(celular);
            funcionarioo.setFechaNacimiento(fn);
            funcionarioo.setFechaIngreso(dateingreso);

            funcionarioo.setCedula(Integer.parseInt((cedula)));
            obtienecargo cargoobtenido = new obtienecargo();
            cargoobtenido.setCargoobtenido(pepe);
            Date hoy = new Date();
            cargoobtenido.setFechaObtencionCargo(hoy);

            CPrincipal.getInstance().persist(funcionarioo);

            cargoobtenido.setFuncionarioasignado(funcionarioo);
            CPrincipal.getInstance().persist(cargoobtenido);
            CPrincipal.getInstance().refresh(funcionarioo);

            if (tienecarne) {

                carnets carne = new carnets();
                carne.setFechavencimiento(datecarnet);
                carne.setFuncionariodueniodelcarne(funcionarioo);
                carne.setTipocarnet("Carne de salud");

                CPrincipal.getInstance().persist(carne);
                CPrincipal.getInstance().refresh(funcionarioo);

            }
            if (tienebrebet) {

                carnets carne2 = new carnets();
                carne2.setFechavencimiento(datebrebet);
                carne2.setFuncionariodueniodelcarne(funcionarioo);
                carne2.setTipocarnet("Carne Brebet");
                CPrincipal.getInstance().persist(carne2);
                CPrincipal.getInstance().refresh(funcionarioo);

            }
            if (tienelibreta) {

                carnets carne3 = new carnets();
                carne3.setFechavencimiento(datelibreta);
                carne3.setFuncionariodueniodelcarne(funcionarioo);
                carne3.setTipocarnet("Libreta Conducir");
                CPrincipal.getInstance().persist(carne3);
                CPrincipal.getInstance().refresh(funcionarioo);

            }
            main.funcionarios.add(funcionarioo);
            vaciarcampos();
            label.setText("Funcionario registrado correctamente");
            label.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, null, JOptionPane.OK_OPTION, icono);

            //    JOptionPane.showMessageDialog(null, "Funcionario registrado correctamente", null, JOptionPane.OK_OPTION);
        } else {
            //   JOptionPane.showMessageDialog(null, "Error: Verifique datos", null, JOptionPane.ERROR_MESSAGE);
            msg.setFont(new Font("Arial", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            msg.setText("<html>");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (jCheckBox2.isSelected()) {
            jDateChooserCarnet.setVisible(true);
        } else {
            jDateChooserCarnet.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ItemStateChanged
    public boolean checkvaliddate(Date datetoverify) {
        return !datetoverify.after(new Date());
    }
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        funcio2= null;
        activo = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String nombre, apellido, celular;
        Date fn, datebrebet, datecarnet;
        boolean tienecarne = false, tienebrebet = false;

        if (jCheckBox1.isSelected()) {
            tienebrebet = true;
        }

        if (jCheckBox2.isSelected()) {
            tienecarne = true;
        }
        nombre = jTextFieldNombre.getText();
        apellido = jTextFieldApeliido.getText();
        celular = jTextFieldCelular.getText();

        fn = jDateChooserFecha.getDate();
        datebrebet = jDateChooserBrebet.getDate();
        datecarnet = jDateChooserCarnet.getDate();

        String msg = "";

        if (nombre.isBlank()) {
            msg += "Falta compleatar campo nombre\n";
            jTextFieldNombre.setBackground(Color.red);
        }
        if (apellido.isBlank()) {
            msg += "Falta compleatar campo Username\n";
            jTextFieldApeliido.setBackground(Color.red);
        }
        if (celular.isBlank()) {
            msg += "Falta compleatar campo apellido\n";
            jTextFieldCelular.setBackground(Color.red);
        }

        if (msg.isBlank()) {
            funcio2.setNombre(nombre);
            funcio2.setApellido(apellido);
            funcio2.setCelular(celular);
            funcio2.setFechaNacimiento(fn);
            CPrincipal.getInstance().merge(funcio2);
            CPrincipal.getInstance().refresh(funcio2);
            vaciarcampos();
            JOptionPane.showMessageDialog(null, "Funcionario modificado correctamente", null, JOptionPane.OK_OPTION);

        } else {
            JOptionPane.showMessageDialog(null, "Error: Verifique datos", null, JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTextFieldCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularActionPerformed

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            jDateChooserLibreta.setVisible(true);
        } else {
            jDateChooserLibreta.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jTextFieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaKeyTyped

    private void jTextFieldCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularKeyTyped
    public void vaciarcampos() {
        jTextFieldNombre.setText("");
        jTextFieldApeliido.setText("");
        jTextFieldCedula.setText("");
        jTextFieldCelular.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jDateChooserFecha.setCalendar(null);
        jDateChooserCarnet.setCalendar(null);
        jDateChooserBrebet.setCalendar(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JComboBox<cargo> jComboBoxCargo;
    private com.toedter.calendar.JDateChooser jDateChooserBrebet;
    private com.toedter.calendar.JDateChooser jDateChooserCarnet;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private com.toedter.calendar.JDateChooser jDateChooserLibreta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApeliido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
