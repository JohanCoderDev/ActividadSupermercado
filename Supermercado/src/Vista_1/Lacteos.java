/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_1;

/**
 *
 * @author Cristhian - Alejandro - Johan
 */
public class Lacteos extends javax.swing.JFrame {
    
    
    private static Lacteos lacteos;

    /**
     * Creates new form verduras
     */
    private Lacteos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static Lacteos getLacteos(){
        if(lacteos == null)
        {
         lacteos = new Lacteos();   
        }
        
        return lacteos;
    }

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
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queso campesino ------- $ 5500", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/queso_chimba__1_-removebg-preview.png"))); // NOI18N
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(183, 210, 194));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yogurt -------- $ 4000", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/plastic-container-for-yogurt-illustration-free-png.png"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel3.setBackground(new java.awt.Color(183, 210, 194));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kumis ------- $6000", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Kumis-removebg-preview.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel7.setBackground(new java.awt.Color(183, 210, 194));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Helado de queso ------- $2000", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/png-clipart-ice-cream-cones-ice-pop-lollipop-popsicle-s-angle-food-removebg-preview.png"))); // NOI18N
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel2.setBackground(new java.awt.Color(183, 210, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queso crema --------- $3000", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/kisspng-cream-cheese-kraft-foods-milk-butter-cake-bagel-and-cream-cheese-5b243eb61e6ea5.1199537815291020061247-removebg-preview.png"))); // NOI18N
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel8.setBackground(new java.awt.Color(183, 210, 194));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leche ------- $6000", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/6c40e6ebea6870c673bc72d8f215724d-ilustracion-de-vaca-de-leche-de-caja-de-leche (1).png"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel9, java.awt.BorderLayout.CENTER);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Presentacion_2 presentacion2 = Presentacion_2.getPresentacion_2();
    presentacion2.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
