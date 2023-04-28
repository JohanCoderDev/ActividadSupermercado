/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_1;

import Vista_1.MasOpciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristhian - Alejandro - Johan
 */
public class Lacteos extends javax.swing.JFrame {
    
    //Se crea variable en la que se guarda estado de la clase Lacteos
    private static Lacteos lacteos;

     /**
     * Constructor privado de la clase Lacteos
     */
    private Lacteos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     /**
     * @method getLacteos
     * Metodo que duelve una instancia de la clase Lacteos
     * Si no hay crea una nueva
     * @return lacteos 
     */
    public static Lacteos getLacteos(){
        if(lacteos == null)
        {
         lacteos = new Lacteos();   
        }   
        return lacteos;
    }
    
    String queso = " Queso ";
    String kumis = " kumis ";
    String quesoCrema = " Queso crema ";
    String yogurt = " Yogurt ";
    String helado = " Helado ";
    String leche = " Leche ";
    
    int queso1 = 5500;
    int kumis1 = 6000;
    int quesoCrema1 = 3000;
    int yogurt1 = 4000;
    int helado1 = 2000;
    int leche1 = 6000;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 133, 114));

        jLabel3.setBackground(new java.awt.Color(102, 133, 114));
        jLabel3.setFont(new java.awt.Font("Golos Text", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lacteos");
        getContentPane().add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(95, 179, 136));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jPanel4.setBackground(new java.awt.Color(183, 210, 194));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queso campesino ------- $ 5500", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/queso_chimba__1_-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 210));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 100));

        jPanel1.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(183, 210, 194));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yogurt -------- $ 4000", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/plastic-container-for-yogurt-illustration-free-png.png"))); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, 171));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 100));

        jPanel1.add(jPanel6);

        jPanel3.setBackground(new java.awt.Color(183, 210, 194));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kumis ------- $6000", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Kumis-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 171));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 100));

        jPanel1.add(jPanel3);

        jPanel7.setBackground(new java.awt.Color(183, 210, 194));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Helado ------- $2000", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8_melting_ice_cream_50px.png"))); // NOI18N
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -50, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/paketa-removebg-preview (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 100));

        jPanel1.add(jPanel7);
        jPanel7.getAccessibleContext().setAccessibleName("Helado ------- $2000");

        jPanel2.setBackground(new java.awt.Color(183, 210, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queso crema --------- $3000", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/dsfsd.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, 171));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 110, 100));

        jPanel1.add(jPanel2);

        jPanel8.setBackground(new java.awt.Color(183, 210, 194));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leche ------- $6000", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lechenebla.png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, 171));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Comprar-removebg-preview (1).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 110, 100));

        jPanel1.add(jPanel8);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(209, 191, 161));
        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     //Boton regresar al menú
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Presentacion_2 presentacion2 = Presentacion_2.getPresentacion_2();
    presentacion2.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + kumis + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + kumis1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + quesoCrema + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + quesoCrema1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + leche + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + leche1;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + yogurt + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + yogurt1;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + helado + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + helado1;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MasOpciones.canasta = MasOpciones.canasta + " | " + queso + "\n";
        JOptionPane.showMessageDialog(null , "Agregado al carrito de compras" , "Accion realizada con exito", 1);
        MasOpciones.canasta1 = MasOpciones.canasta1 + queso1;

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
            java.util.logging.Logger.getLogger(verduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verduras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
