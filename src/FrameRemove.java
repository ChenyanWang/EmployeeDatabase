
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author 499326
 */
public class FrameRemove extends javax.swing.JFrame {
    
    /**
     * Creates new form FrameRemove
     */
    
    String empNumber = FrameDisplay.getSelectedEmployeeNumber();
    
    public FrameRemove() {
        initComponents();
        
        //popup appears if user tries to close window
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                int selectedOption = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to close the window?",
                        "EXIT",
                        JOptionPane.YES_NO_OPTION);
                //if user clicks yes, program closes
                if (selectedOption == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                }
            }
        });
        //initializes text of message
        labelRemoveTitle.setText("Are you sure you want to remove employee " + empNumber + "?");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRemoveTitle = new javax.swing.JLabel();
        buttonRemoveYes = new javax.swing.JButton();
        buttonRemoveNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        labelRemoveTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        labelRemoveTitle.setText("Are you sure you want to remove employee ####?");

        buttonRemoveYes.setText("Yes");
        buttonRemoveYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveYesActionPerformed(evt);
            }
        });

        buttonRemoveNo.setText("No");
        buttonRemoveNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRemoveTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(buttonRemoveYes)
                        .addGap(105, 105, 105)
                        .addComponent(buttonRemoveNo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoveTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRemoveYes)
                    .addComponent(buttonRemoveNo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonRemoveYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveYesActionPerformed
        //uses remove command from mainframe to remove employee from hashtable if user clicks yes
        FrameMain.getEmployeeHashTable().removeEmployee(Integer.valueOf(empNumber));
        new FrameDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonRemoveYesActionPerformed
    
    private void buttonRemoveNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveNoActionPerformed
        //closes remove frame and opens display frame
        dispose();
        new FrameDisplay().setVisible(true);
    }//GEN-LAST:event_buttonRemoveNoActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRemove().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRemoveNo;
    private javax.swing.JButton buttonRemoveYes;
    private javax.swing.JLabel labelRemoveTitle;
    // End of variables declaration//GEN-END:variables
}