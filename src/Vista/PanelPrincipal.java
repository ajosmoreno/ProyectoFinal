/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Antonio
 */
public class PanelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelbienvenido = new javax.swing.JLabel();
        jLabelusuario = new javax.swing.JLabel();
        jTextFieldusuario = new javax.swing.JTextField();
        jPasswordFieldusuario = new javax.swing.JPasswordField();
        jLabelpassword = new javax.swing.JLabel();
        jLabelregistro = new javax.swing.JLabel();
        jButtonregistro = new javax.swing.JButton();
        jButtonentrar = new javax.swing.JButton();
        jButtoninvitado = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelbienvenido.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabelbienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbienvenido.setText("Bienvenido");
        getContentPane().add(jLabelbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 138, 54));

        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setText("Usuario :");
        getContentPane().add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, 40));
        getContentPane().add(jTextFieldusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, -1));
        getContentPane().add(jPasswordFieldusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 210, -1));

        jLabelpassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpassword.setText("Contraseña :");
        getContentPane().add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 90, 30));

        jLabelregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelregistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelregistro.setText("¿Aun no estas registrado?");
        getContentPane().add(jLabelregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 20));

        jButtonregistro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonregistro.setText("Registrar");
        jButtonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, 40));

        jButtonentrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonentrar.setText("Entrar");
        jButtonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonentrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 40));

        jButtoninvitado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtoninvitado.setText("Entrar como invitado");
        jButtoninvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoninvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 160, 40));

        jButtonsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 80, 40));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jButtoninvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninvitadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtoninvitadoActionPerformed

    private void jButtonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregistroActionPerformed
        // TODO add your handling code here:
        RegistroUsuarios registro = new RegistroUsuarios(this,true);
        registro.setVisible(true);
        
    }//GEN-LAST:event_jButtonregistroActionPerformed

    private void jButtonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonentrarActionPerformed
        // TODO add your handling code here:
        Opciones opcion = new Opciones(this,true);
        opcion.setVisible(true);
    }//GEN-LAST:event_jButtonentrarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonentrar;
    private javax.swing.JButton jButtoninvitado;
    private javax.swing.JButton jButtonregistro;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabelbienvenido;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelregistro;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JPasswordField jPasswordFieldusuario;
    private javax.swing.JTextField jTextFieldusuario;
    // End of variables declaration//GEN-END:variables
}
