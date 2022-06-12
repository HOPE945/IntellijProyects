/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
 import javax.swing.table.DefaultTableModel; 
/**
 *
 * @author peace
 */
public class FrmActualizar extends javax.swing.JFrame {

    /**
     * Creates new form FrmActualizar
     */
    public FrmActualizar() {
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

        jOpActualizar = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultTableModel dtm = new DefaultTableModel();
        tblActualizar = new javax.swing.JTable();
        txtActualizarNombrePais = new javax.swing.JTextField();
        txtIdActualizarPais = new javax.swing.JTextField();
        lblTituloAcualizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCapitalPaisActualizar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPoblacionActualizar = new javax.swing.JTextField();
        btnActualizarIPais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ActuralizarPais");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblActualizar.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblActualizar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 860, 160));
        jPanel1.add(txtActualizarNombrePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, -1));

        txtIdActualizarPais.setEditable(false);
        txtIdActualizarPais.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtIdActualizarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, -1));

        lblTituloAcualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTituloAcualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAcualizar.setText("Actualizar informacion de País");
        jPanel1.add(lblTituloAcualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el Id del pais que desea actualizar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Pais");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capital Pais");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 20));
        jPanel1.add(txtCapitalPaisActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Poblacón");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));
        jPanel1.add(txtPoblacionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, -1));

        btnActualizarIPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actulizarimg/actualizarimg/actualizar.png"))); // NOI18N
        btnActualizarIPais.setText("Actualizar");
        jPanel1.add(btnActualizarIPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarIPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JOptionPane jOpActualizar;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblTituloAcualizar;
    public javax.swing.JTable tblActualizar;
    public javax.swing.JTextField txtActualizarNombrePais;
    public javax.swing.JTextField txtCapitalPaisActualizar;
    public javax.swing.JTextField txtIdActualizarPais;
    public javax.swing.JTextField txtPoblacionActualizar;
    // End of variables declaration//GEN-END:variables
}
