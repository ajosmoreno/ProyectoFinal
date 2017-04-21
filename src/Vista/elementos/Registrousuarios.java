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
    //JDateChooser jDateChoosernacimiento;
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
      //  jDateChoosernacimiento.setVisible(false);
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
              //  jDateChoosernacimiento.setDate(fechaestandar);
                jTextFielddni.setText("");
                jTextFieldusuario.setText("");
                
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
           //     jDateChoosernacimiento.setVisible(true);
                jLabeldni.setVisible(true);
                jTextFielddni.setVisible(true);
               
            }
        });
        
        
        jRadioButtonpermiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelnombre.setVisible(false);
                jLabelapellidos.setVisible(false);
                jLabeldireccion.setVisible(false);
                jLabeltelefono.setVisible(false);
                jLabelfechanacimiento.setVisible(false);
                jTextFieldnombre.setVisible(false);
                jTextFieldapellidos.setVisible(false);
                jTextFielddireccion.setVisible(false);
                jTextFieldtelefono.setVisible(false);
          //      jDateChoosernacimiento.setVisible(false);
                jLabeldni.setVisible(false);
                jTextFielddni.setVisible(false);
               
            }
        });
        
        
        this.add(jLabelregistro);
        this.add(jButtonaceptar);
        this.add(jButtoncancelar);
        this.add(jButtonborrartodo);
        this.add(jLabelusuario);
        this.add(jTextFieldusuario);
        this.add(jLabelcontraseña);
        this.add(jPasswordFieldcontraseña);
        this.add(jLabelpermiso);
        this.add(jRadioButtonpermiso1);
        this.add(jRadioButtonpermiso2);
        this.add(jLabelnombre);
        this.add(jTextFieldnombre);
        this.add(jLabelapellidos);
        this.add(jTextFieldapellidos);
        this.add(jLabeldni);
        this.add(jTextFielddni);
        this.add(jLabeldireccion);
        this.add(jTextFielddireccion);
        this.add(jLabeltelefono);
        this.add(jTextFieldtelefono);
        this.add(jLabelfechanacimiento);
   //     this.add(jDateChoosernacimiento);
   
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

        g.drawImage(image, 0, 0, 1366, 768, this);
        jButtonaceptar.setBounds(570, 640, 75, 30);
        jButtoncancelar.setBounds(760, 640, 75, 30);
        jButtonborrartodo.setBounds(850, 640, 75, 30);
        jLabelusuario.setBounds(150,170,150,30);
        jTextFieldusuario.setBounds(300,170,150,30);
        jLabelcontraseña.setBounds(150, 220, 150, 30);
        jPasswordFieldcontraseña.setBounds(150, 270, 150, 30);
        jLabelpermiso.setBounds(150,310,150,30);
        jRadioButtonpermiso1.setBounds(300,310,100,30);
        jRadioButtonpermiso2.setBounds(400,310,100,30);
        jLabelnombre.setBounds(150, 350, 150, 30);
        jTextFieldnombre.setBounds(300, 350, 150, 30);
        jLabelapellidos.setBounds(150, 390, 150, 30);
        jTextFieldapellidos.setBounds(300, 390, 200, 30);
        jLabeldireccion.setBounds(150, 430, 200, 30);
        jTextFielddireccion.setBounds(300, 430, 200, 30);
        jLabeltelefono.setBounds(150, 470, 150, 30);
        jTextFieldtelefono.setBounds(300, 470, 150, 30);
        jLabelfechanacimiento.setBounds(150,510,150,30);
    //    jDateChoosernacimiento.setBounds(300,510,100,30);
        jLabeldni.setBounds(150,550,150,30);
        jTextFielddni.setBounds(300,550,150,30);
        jLabelregistro.setBounds(650, 100, 300, 50);

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
