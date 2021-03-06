/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosVotante;

import controladores.CandidatoController;
import controladores.CombosController;
import controladores.VotanteController;
import controladores.VotoController;
import entidades.JuntaReceptora;
import entidades.Voto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import utilidades.TextboxValidator;

/**
 *
 * @author Daniel
 */
public class FrmRealizarVoto extends javax.swing.JFrame {

    
    private TextboxValidator validator = new TextboxValidator();
    private VotanteController votC = new VotanteController();
    private CombosController junta = new CombosController();
    private CandidatoController candiC = new CandidatoController();
    private VotoController votoC = new VotoController();
    
    public FrmRealizarVoto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVotar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDui = new javax.swing.JFormattedTextField();
        btnVerificarDui = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbJunta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCandidatos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VOTACION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnVotar.setText("Votar por el candidato seleccionado");
        btnVotar.setEnabled(false);
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese su DUI:");

        try {
            txtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVerificarDui.setText("Verificarse");
        btnVerificarDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDuiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Codigo JRV");

        cmbJunta.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerificarDui, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbJunta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarDui))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbJunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(38, 38, 38)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tablaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCandidatos.setEnabled(false);
        tablaCandidatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaCandidatos);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        
        int index = this.tablaCandidatos.getSelectedRow();
        
        if(index != -1) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Votar por el candidato seleccionado?", "Confirme", 0);
            if(respuesta == 0) {
                Voto voto = new Voto();
                JuntaReceptora jrv = (JuntaReceptora) this.cmbJunta.getSelectedItem();
                int idJunta = jrv.getId();
                int idCandi =  (Integer) this.tablaCandidatos.getModel().getValueAt(index, 0);
                
                voto.setIdJunta(idJunta);
                voto.setIdCandidato(idCandi);
                String msj = this.votoC.insertarVoto(voto);
                JOptionPane.showMessageDialog(this, msj, "Notificacion", 2);
                this.votC.deshabilitarVotante(this.txtDui.getText());
                this.desHabilitarControles();
                this.txtDui.setEnabled(true);
                this.txtDui.setText("");
            } 

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione al candidato primero", "Error", 2);
        }
        
    }//GEN-LAST:event_btnVotarActionPerformed
    
    private void llenarJuntas(ArrayList<JuntaReceptora> juntas) {
        this.cmbJunta.removeAllItems();
        for(JuntaReceptora junta : juntas) {
            this.cmbJunta.addItem(junta);
        }
    }
    
    public void llenarTabla() {
        this.tablaCandidatos.setModel(this.candiC.getCandidatos());
        TableColumnModel tcm = this.tablaCandidatos.getColumnModel();
        tcm.removeColumn( tcm.getColumn(0) );
    }
    
    //Se habilita cuando el votante ya se ha verificado
    private void habilitarControles() {
        this.btnVotar.setEnabled(true);
        this.cmbJunta.setEnabled(true);
        this.tablaCandidatos.setEnabled(true);
    }
    
    private void desHabilitarControles() {
        this.btnVotar.setEnabled(false);
        this.cmbJunta.setEnabled(false);
        this.tablaCandidatos.setEnabled(false);
    }
    
    
    private void btnVerificarDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDuiActionPerformed
        if(this.validator.emptyFields(jPanel1)) {
            JOptionPane.showMessageDialog(this, "Llene el campo!", "Error", 2);
        } else {
            int centroV = this.votC.verificarVotante(this.txtDui.getText());
            
            if(centroV != 0) {
                ArrayList<JuntaReceptora> juntas = this.junta.getJuntas(centroV);
                
                if(!juntas.isEmpty()) {
                    this.habilitarControles();
                    this.llenarJuntas(juntas);
                    this.llenarTabla();
                    this.txtDui.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay juntas receptoras disponibles", "Error", 2);
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "Usted no se encuentra registrado en el padrón", "Error", 2);
            }
            
        }
    }//GEN-LAST:event_btnVerificarDuiActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRealizarVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificarDui;
    private javax.swing.JButton btnVotar;
    /*
    private javax.swing.JComboBox<String> cmbJunta;
    */
    private javax.swing.JComboBox<JuntaReceptora> cmbJunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCandidatos;
    private javax.swing.JFormattedTextField txtDui;
    // End of variables declaration//GEN-END:variables
}
