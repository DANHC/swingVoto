/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosAdmin;

import controladores.EmpleadoController;
import entidades.Empleado;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import utilidades.TextboxValidator;

/**
 *
 * @author Daniel
 */
public class FrmActuEmpleado extends javax.swing.JInternalFrame {

    
    TextboxValidator validator = new TextboxValidator();
    EmpleadoController empC = new EmpleadoController();
    
    public FrmActuEmpleado() {
        initComponents();
        this.llenarTabla("        - ");
        
    }

    public void llenarTabla(String dui) {
        String duiS = dui.equals("        - ") ? "" : dui;
        
        this.tableEmpleados.setModel( this.empC.getEmpleadosInfo(duiS) );
        TableColumnModel tcm = this.tableEmpleados.getColumnModel();
        tcm.removeColumn( tcm.getColumn(0) );
        tcm.removeColumn( tcm.getColumn(0) );
        tcm.removeColumn( tcm.getColumn(4) );
        tcm.removeColumn( tcm.getColumn(7) );
        tcm.removeColumn( tcm.getColumn(5) );
    }
    
    private Empleado llenarEmpleado() {
        Empleado emp = new Empleado();
        emp.setNombres(this.txtNombres.getText());
        emp.setApellidos(this.txtApellidos.getText());
        emp.setDireccion(this.txtDireccion.getText());
        emp.setTelefono(this.txtTelefono.getText());
        
        return emp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnActualizarDatos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscarDui = new javax.swing.JFormattedTextField();
        btnBuscarDui = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Empleado");

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableEmpleados.setRowHeight(18);
        tableEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmpleados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrar Empleado");

        btnActualizarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reiniciar-48.png"))); // NOI18N
        btnActualizarDatos.setText("Actualizar Datos");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar-26.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dirección:");

        jLabel10.setText("Buscar por DUI:");

        try {
            txtBuscarDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarDui.setText("Buscar");
        btnBuscarDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDuiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono:");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+503 #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(txtBuscarDui, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarDui))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(23, 23, 23)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(34, 34, 34)
                                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscarDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarDui))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        if(this.validator.emptyFields(this.rootPane.getContentPane()) && 
                !this.txtNombres.getText().isEmpty() &&
                !this.txtApellidos.getText().isEmpty() &&
                !this.txtDireccion.getText().isEmpty() &&
                this.txtTelefono.isEditValid()  )
        {
            
            int fila = this.tableEmpleados.getSelectedRow();
            
            if(fila != -1) {
                Empleado emp = this.llenarEmpleado();
                int estado = this.cmbEstado.getSelectedItem().equals("ACTIVO") ? 1 : 0;
                int empId = (Integer) this.tableEmpleados.getModel().getValueAt(fila, 0);
                
                String msj = this.empC.actualizarEmpleado(emp, empId, estado);
                JOptionPane.showMessageDialog(this, msj, "Notificacion", 2);
                
                this.llenarTabla("        - ");
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione al empleado", "Error", 2);
            }
            
        } else if(!this.validator.emptyFields(this.rootPane.getContentPane())) {
            int fila = this.tableEmpleados.getSelectedRow();
            
            if(fila != -1) {
                Empleado emp = this.llenarEmpleado();
                int estado = this.cmbEstado.getSelectedItem().equals("ACTIVO") ? 1 : 0;
                int empId = (Integer) this.tableEmpleados.getModel().getValueAt(fila, 0);
                
                String msj = this.empC.actualizarEmpleado(emp, empId, estado);
                JOptionPane.showMessageDialog(this, msj, "Notificacion", 2);
                
                this.llenarTabla("        - ");
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione al empleado", "Error", 2);
            }
 
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione al empleado", "Error", 2);
        }
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        Character c = evt.getKeyChar();

        if(Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        Character c = evt.getKeyChar();

        if(Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void btnBuscarDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDuiActionPerformed
        this.llenarTabla(this.txtBuscarDui.getText());
    }//GEN-LAST:event_btnBuscarDuiActionPerformed

    private void tableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpleadosMouseClicked
        int fila = this.tableEmpleados.getSelectedRow();
        
        String estado = (String) this.tableEmpleados.getModel().getValueAt(fila, 10);
        this.cmbEstado.getModel().setSelectedItem(estado);

        this.txtNombres.setText( (String) this.tableEmpleados.getModel().getValueAt(fila, 2));
        this.txtApellidos.setText( (String) this.tableEmpleados.getModel().getValueAt(fila, 3) );
        this.txtDireccion.setText( (String) this.tableEmpleados.getModel().getValueAt(fila, 6));
        this.txtTelefono.setText( (String) this.tableEmpleados.getModel().getValueAt(fila, 8) );
    }//GEN-LAST:event_tableEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnBuscarDui;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JFormattedTextField txtBuscarDui;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
