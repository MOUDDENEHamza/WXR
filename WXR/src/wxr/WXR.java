/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package wxr;

/**
 *
 * @author ncazes2
 */
public class WXR extends javax.swing.JFrame {

    /** Creates new form WXR */
    public WXR() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        modePanel = new javax.swing.JPanel();
        wxonButton = new javax.swing.JButton();
        tstButton = new javax.swing.JButton();
        wxaButton = new javax.swing.JButton();
        offModeButton = new javax.swing.JButton();
        stdbyButton = new javax.swing.JButton();
        tiltAnglePanel = new javax.swing.JPanel();
        tiltAngleModeTextField = new javax.swing.JTextField();
        autoButton = new javax.swing.JButton();
        manualButton = new javax.swing.JButton();
        stabilizationTextField = new javax.swing.JTextField();
        onStabilizationButton = new javax.swing.JButton();
        offStabilizationButton = new javax.swing.JButton();
        editTiltAngleTextField = new javax.swing.JTextField();
        currentValueTiltAngleTextField = new javax.swing.JTextField();
        newValueTiltAngleTextField = new javax.swing.JTextField();
        currentValueTiltAngleDisplayTextField = new javax.swing.JTextField();
        newValueTiltAngleDisplayTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wxonButton.setText("WXON");

        tstButton.setText("TST");

        wxaButton.setText("WXA");

        offModeButton.setText("OFF");

        stdbyButton.setText("STDBY");

        javax.swing.GroupLayout modePanelLayout = new javax.swing.GroupLayout(modePanel);
        modePanel.setLayout(modePanelLayout);
        modePanelLayout.setHorizontalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(wxonButton)
                        .addGap(39, 39, 39)
                        .addComponent(tstButton)
                        .addGap(35, 35, 35)
                        .addComponent(wxaButton))
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(offModeButton)
                        .addGap(43, 43, 43)
                        .addComponent(stdbyButton)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        modePanelLayout.setVerticalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wxonButton)
                    .addComponent(tstButton)
                    .addComponent(wxaButton))
                .addGap(36, 36, 36)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offModeButton)
                    .addComponent(stdbyButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MODE", modePanel);

        tiltAngleModeTextField.setEditable(false);
        tiltAngleModeTextField.setText("Tilt Angle Mode:");

        autoButton.setText("AUTO");

        manualButton.setText("MANUAL");

        stabilizationTextField.setEditable(false);
        stabilizationTextField.setText("Stabilization:");

        onStabilizationButton.setText("ON");

        offStabilizationButton.setText("OFF");

        editTiltAngleTextField.setEditable(false);
        editTiltAngleTextField.setText("Edit Tilt Angle:");

        currentValueTiltAngleTextField.setEditable(false);
        currentValueTiltAngleTextField.setText("The current value:");

        newValueTiltAngleTextField.setEditable(false);
        newValueTiltAngleTextField.setText("Enter the new value:");

        currentValueTiltAngleDisplayTextField.setEditable(false);
        currentValueTiltAngleDisplayTextField.setText("15");

        newValueTiltAngleDisplayTextField.setText("XX");

        okButton.setText("OK");

        javax.swing.GroupLayout tiltAnglePanelLayout = new javax.swing.GroupLayout(tiltAnglePanel);
        tiltAnglePanel.setLayout(tiltAnglePanelLayout);
        tiltAnglePanelLayout.setHorizontalGroup(
            tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                        .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiltAngleModeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stabilizationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autoButton)
                                    .addComponent(onStabilizationButton))
                                .addGap(37, 37, 37)
                                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manualButton)
                                    .addComponent(offStabilizationButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                        .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTiltAngleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newValueTiltAngleTextField)
                                    .addComponent(currentValueTiltAngleTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentValueTiltAngleDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                                        .addComponent(newValueTiltAngleDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(okButton)))))
                        .addGap(0, 142, Short.MAX_VALUE))))
        );
        tiltAnglePanelLayout.setVerticalGroup(
            tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiltAnglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tiltAngleModeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoButton)
                    .addComponent(manualButton))
                .addGap(18, 18, 18)
                .addComponent(stabilizationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onStabilizationButton)
                    .addComponent(offStabilizationButton))
                .addGap(18, 18, 18)
                .addComponent(editTiltAngleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentValueTiltAngleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentValueTiltAngleDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tiltAnglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newValueTiltAngleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newValueTiltAngleDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TILT ANGLE", tiltAnglePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
            java.util.logging.Logger.getLogger(WXR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WXR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WXR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WXR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WXR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autoButton;
    private javax.swing.JTextField currentValueTiltAngleDisplayTextField;
    private javax.swing.JTextField currentValueTiltAngleTextField;
    private javax.swing.JTextField editTiltAngleTextField;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton manualButton;
    private javax.swing.JPanel modePanel;
    private javax.swing.JTextField newValueTiltAngleDisplayTextField;
    private javax.swing.JTextField newValueTiltAngleTextField;
    private javax.swing.JButton offModeButton;
    private javax.swing.JButton offStabilizationButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton onStabilizationButton;
    private javax.swing.JTextField stabilizationTextField;
    private javax.swing.JButton stdbyButton;
    private javax.swing.JTextField tiltAngleModeTextField;
    private javax.swing.JPanel tiltAnglePanel;
    private javax.swing.JButton tstButton;
    private javax.swing.JButton wxaButton;
    private javax.swing.JButton wxonButton;
    // End of variables declaration//GEN-END:variables

}
