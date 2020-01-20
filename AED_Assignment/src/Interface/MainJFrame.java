package Interface;
import Business.Product;
public class MainJFrame extends javax.swing.JFrame {
    private Product product;
    public MainJFrame() {
        initComponents();
        product = new Product(); 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        View_Jpane = new javax.swing.JPanel();
        Create_Jpane = new javax.swing.JPanel();
        Create_Button = new javax.swing.JButton();
        View_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1065, 788));

        javax.swing.GroupLayout View_JpaneLayout = new javax.swing.GroupLayout(View_Jpane);
        View_Jpane.setLayout(View_JpaneLayout);
        View_JpaneLayout.setHorizontalGroup(
            View_JpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1312, Short.MAX_VALUE)
        );
        View_JpaneLayout.setVerticalGroup(
            View_JpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(View_Jpane);

        Create_Button.setBackground(new java.awt.Color(0, 0, 51));
        Create_Button.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Create_Button.setForeground(new java.awt.Color(51, 51, 255));
        Create_Button.setText("Create");
        Create_Button.setToolTipText("");
        Create_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_ButtonActionPerformed(evt);
            }
        });

        View_Button.setBackground(new java.awt.Color(0, 51, 51));
        View_Button.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        View_Button.setForeground(new java.awt.Color(0, 153, 153));
        View_Button.setText("View");
        View_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        View_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Create_JpaneLayout = new javax.swing.GroupLayout(Create_Jpane);
        Create_Jpane.setLayout(Create_JpaneLayout);
        Create_JpaneLayout.setHorizontalGroup(
            Create_JpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_JpaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Create_JpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(View_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Create_JpaneLayout.setVerticalGroup(
            Create_JpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_JpaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Create_Button)
                .addGap(18, 18, 18)
                .addComponent(View_Button)
                .addContainerGap(980, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(Create_Jpane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jSplitPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_ButtonActionPerformed
        Create_Jpanel cjp = new Create_Jpanel(product);
        jSplitPane.setRightComponent(cjp);
    }//GEN-LAST:event_Create_ButtonActionPerformed

    private void View_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_ButtonActionPerformed
        View_Jpanel djp = new View_Jpanel(product);
        jSplitPane.setRightComponent(djp);
    }//GEN-LAST:event_View_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create_Button;
    private javax.swing.JPanel Create_Jpane;
    private javax.swing.JButton View_Button;
    private javax.swing.JPanel View_Jpane;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
}
