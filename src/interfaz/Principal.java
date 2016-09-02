/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;
import clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jparedes2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    ArrayList <Persona> v= new ArrayList();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtPrimerNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        cmbGuardar = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Personas.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Basicos", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Identificacion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("Primer Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setText("Primer Apellido:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, -1));

        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, -1));
        jPanel2.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, -1));

        jLabel5.setText("Genero:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", " " }));
        jPanel2.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbGuardar.setText("Guardar");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, -1));

        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, -1));

        jButton1.setText("Listar Mujeres");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jButton2.setText("Numero de mujeres");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 180, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 150));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 490, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        setSize(new java.awt.Dimension(615, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed
        // TODO add your handling code here:
        Persona p;
        long identificacion;
        String Primer_Nombre, Primer_Apellido, genero;
        
        identificacion = Long.parseLong(txtIdentificacion.getText());
        Primer_Nombre = txtPrimerNombre.getText();
        Primer_Apellido = txtPrimerApellido.getText();
        genero= cmbGenero.getSelectedItem().toString();
        
        p= new Persona (identificacion, Primer_Nombre, Primer_Apellido, genero);
        v.add(p);
                
        JOptionPane.showMessageDialog(this, "Persona Agregada Correctamente");
        txtIdentificacion.setText("");
        txtPrimerApellido.setText("");
        txtPrimerNombre.setText("");
        cmbGenero.setSelectedIndex(0);
        txtIdentificacion.requestFocusInWindow();
        
    }//GEN-LAST:event_cmbGuardarActionPerformed

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarActionPerformed
       String aux;
       txtResultado.setText("");
       
       if (v.isEmpty())
       {
           txtResultado.setText("No hay personas que mostrar");
       }
       else {
        for (int i = 0; i < v.size(); i++) {
            aux= "Persona No. "+ (i+1)+"\n"
                    + "Identificacion: " + v.get(i).getIdentificacion()+"\n"
                    + "Primer Nombre: " + v.get(i).getPrimer_nombre()+"\n"
                    + "Segundo Apellido: " + v.get(i).getPrimer_apellido()+"\n"
                    + "Genero: " + v.get(i).getgenero()+"\n\n";
          txtResultado.append(aux);
        }
       }
       txtIdentificacion.requestFocusInWindow();
    }//GEN-LAST:event_cmbMostrarActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed
        // TODO add your handling code here:
        int op;
        op= JOptionPane.showConfirmDialog(this, "Seguro que desea eleminar las personas?", "Pregunta", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION)
        {
            v.clear();
            txtResultado.setText("");
            txtIdentificacion.setText("");
            txtPrimerApellido.setText("");
            txtPrimerNombre.setText("");
            txtIdentificacion.requestFocusInWindow();
            cmbGenero.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String aux;
        int cont=0;
       txtResultado.setText("");
       
       if (v.isEmpty())
       {
           txtResultado.setText("No hay personas que mostrar");
       }
       else { 
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getgenero().equalsIgnoreCase("Femenino")){
            aux= "Persona No. "+ (i+1)+"\n"
                    + "Identificacion: " + v.get(i).getIdentificacion()+"\n"
                    + "Primer Nombre: " + v.get(i).getPrimer_nombre()+"\n"
                    + "Segundo Apellido: " + v.get(i).getPrimer_apellido()+"\n"
                    + "Genero: " + v.get(i).getgenero()+"\n\n";
          txtResultado.append(aux);
          cont++;
        }
        }
       }
       if (cont==0)
       {
           txtResultado.setText("No hay mujeres que mostrar");
       }
       txtIdentificacion.requestFocusInWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int cont=0;
        for (int i = 0; i < v.size(); i++) 
        {
                if (v.get(i).getgenero().equalsIgnoreCase("Femenino"))
                {
                    cont++;
                }
        }
                if (cont==0)
                {
                    txtResultado.setText("No hay mujeres que mostrar");
                }
        txtResultado.setText("Numero de mujeres: "+cont);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.JButton cmbGuardar;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
