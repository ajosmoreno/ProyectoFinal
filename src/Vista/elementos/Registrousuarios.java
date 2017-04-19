/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.elementos;

import Vista.VentanaPrincipal;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class Registrousuarios extends javax.swing.JDialog {

    /**
     * Creates new form Registrousuarios
     */
    private Image image = Toolkit.getDefaultToolkit().getImage("src/Imagenes/fondoregistro");
    JButton jButtonaceptar = new JButton("Aceptar");
    JButton jButtoncancelar = new JButton("Cancelar");
    JButton jButtonborrartodo = new JButton("Borrar Todo");
    JLabel jLabelusuario = new JLabel("Nombre usuario:");
    JLabel jLabelnombre = new JLabel("Nombre:");
    JLabel jLabelapellidos = new JLabel("Apellidos:");
    JLabel jLabeldireccion = new JLabel("Direccion:");
    JLabel jLabeldni = new JLabel("DNI:");
    JLabel jLabeltelefono = new JLabel("Telefono:");
    JLabel jLabelcontraseña = new JLabel("Contraseña");
    JLabel jLabelregistro = new JLabel("Registro de Usuarios");
    JLabel jLabelpermiso = new JLabel("Tipo de usuario");
    JLabel jLabelfechanacimiento = new JLabel("Fecha de nacimiento:");
    JRadioButton jRadioButtonpermiso1 = new JRadioButton("Invitado");
    JRadioButton jRadioButtonpermiso2 = new JRadioButton("Cliente");
    JTextField jTextFieldusuario = new JTextField("");
    JTextField jTextFieldnombre = new JTextField("");
    JTextField jTextFieldapellidos = new JTextField("");
    JTextField jTextFielddni = new JTextField("");
    JTextField jTextFielddireccion = new JTextField("");
    JTextField jTextFieldtelefono = new JTextField("");
    JPasswordField jPasswordFieldcontraseña = new JPasswordField("");
    JDateChooser jDateChoosernacimiento;
    VentanaPrincipal padre;

    public Registrousuarios(java.awt.Frame parent, boolean modal) {

        jLabelnombre.setVisible(false);
        jLabelapellidos.setVisible(false);
        jLabeldireccion.setVisible(false);
        jLabeltelefono.setVisible(false);
        jLabelfechanacimiento.setVisible(false);
        jTextFieldnombre.setVisible(false);
        jTextFieldapellidos.setVisible(false);
        jTextFielddireccion.setVisible(false);
        jTextFieldtelefono.setVisible(false);
        jDateChoosernacimiento.setVisible(false);
        jLabeldni.setVisible(false);
        jTextFielddni.setVisible(false);

        jButtonaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jButtoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jButtonborrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnombre.setText("");
                jTextFieldapellidos.setText("");
                jTextFielddireccion.setText("");
                jTextFieldtelefono.setText("");
                jPasswordFieldcontraseña.setText("");
                jDateChoosernacimiento.setDate(Date fechaestandar);
                jTextFielddni.setText("");
            }
        });

        jRadioButtonpermiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelnombre.setVisible(true);
                jLabelapellidos.setVisible(true);
                jLabeldireccion.setVisible(true);
                jLabeltelefono.setVisible(true);
                jLabelfechanacimiento.setVisible(true);
                jTextFieldnombre.setVisible(true);
                jTextFieldapellidos.setVisible(true);
                jTextFielddireccion.setVisible(true);
                jTextFieldtelefono.setVisible(true);
                jDateChoosernacimiento.setVisible(true);
                jLabeldni.setVisible(true);
                jTextFielddni.setVisible(true);
            }
        });

        this.add(jButtonaceptar);
        this.add(jButtoncancelar);
        this.add(jButtonborrartodo);
        this.add(jLabelnombre);
        this.add(jLabelapellidos);
        this.add(jLabeldireccion);
        this.add(jLabeltelefono);
        this.add(jLabelcontraseña);
        this.add(jLabelregistro);
        this.add(jTextFieldnombre);
        this.add(jTextFieldapellidos);
        this.add(jTextFielddireccion);
        this.add(jTextFieldtelefono);
        this.add(jPasswordFieldcontraseña);
        this.add(jRadioButtonpermiso1);
        this.add(jRadioButtonpermiso2);
        this.add(jLabelpermiso);
        this.add(jLabelfechanacimiento);
        this.add(jDateChoosernacimiento);
        this.add(jLabeldni);
        this.add(jTextFielddni);
        
        Date datechooser = new Date fecha;

    }

    /**
     *
     * @param padre
     */
    public void setPadre(VentanaPrincipal padre) {
        this.padre = padre;
    }

    private void jButtonaceptarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void jButtoncancelarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void jButtonborrartodoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    public void paintComponent(Graphics g) {

        g.drawImage(image, 0, 0, 1080, 600, this);
        jButtonaceptar.setBounds(450, 500, 75, 30);
        jButtoncancelar.setBounds(600, 500, 75, 30);
        jButtonborrartodo.setBounds(750, 500, 75, 30);
        jLabelnombre.setBounds(100, 130, 150, 25);
        jLabelapellidos.setBounds(100, 170, 150, 25);
        jLabeldireccion.setBounds(100, 210, 150, 30);
        jLabeltelefono.setBounds(100, 250, 150, 30);
        jLabelcontraseña.setBounds(100, 290, 150, 30);
        jLabelregistro.setBounds(475, 50, 300, 50);
        jTextFieldnombre.setBounds(280, 130, 200, 30);
        jTextFieldapellidos.setBounds(280, 170, 200, 30);
        jTextFielddireccion.setBounds(280, 210, 200, 30);
        jTextFieldtelefono.setBounds(280, 250, 200, 30);
        jPasswordFieldcontraseña.setBounds(310, 130, 150, 30);
        jRadioButtonpermiso1.setBounds();
        jRadioButtonpermiso2.setBounds();
        jLabelpermiso.setBounds();
        jDateChoosernacimiento.setBounds();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
