/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.DenominadorCeroException;
import clases.Fracionario;
import javax.swing.JOptionPane;

/**
 *
 * @author walbonis1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOperacion = new javax.swing.JComboBox();
        txtDenominador2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("operaciones con fracionario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 20, 230, 30));
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, -1));
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "suma", "resta", "multiplicacion", "division", " " }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, -1));
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, -1));
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 80, -1));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, 20));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 80, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 80, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 20, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        cmdLimpiar.setText("Limpiar");
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        cmdSalir.setText("Salir");
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(536, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, n1, n2, d1, d2;
        Fracionario f1, f2, f3 = null;
        
         op = cmbOperacion.getSelectedIndex();
        n1 = Integer.parseInt(txtNumerador1.getText());
        d1 = Integer.parseInt(txtDenominador1.getText());
        n2 = Integer.parseInt(txtNumerador2.getText());
        d2 = Integer.parseInt(txtDenominador2.getText());
        try{
        f1 = new Fracionario(n1, d1);
        f2 = new Fracionario(n2, d2);
            
        switch (op) {
            case 0:
                f3 = f1.sumar(f2);
                break;
            case 1:
                f3 = f1.resta(f2);
                break;
                }
        
        txtNumerador3.setText("" + f3.getNumerador());
        txtDenominador3.setText("" + f3.getDenominador());
        }catch(DenominadorCeroException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    // End of variables declaration//GEN-END:variables
}
