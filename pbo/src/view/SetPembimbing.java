package view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
public class SetPembimbing extends javax.swing.JPanel {
    public SetPembimbing() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        kodeDosenLabel = new javax.swing.JLabel();
        kodeDosenTextField = new javax.swing.JTextField();
        setPembimbingLabel = new javax.swing.JLabel();
        setPembimbingComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        setButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Set Pembimbing| Mahasiswa");

        kodeDosenLabel.setText("Kode Dosen");

        kodeDosenTextField.setText("    ");
        kodeDosenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeDosenTextFieldActionPerformed(evt);
            }
        });

        setPembimbingLabel.setText("Set Pembimbing ke-");

        setPembimbingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        setButton.setText("Set");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeDosenLabel)
                            .addComponent(judulLabel)
                            .addComponent(setPembimbingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeDosenTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPembimbingComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setButton)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel)
                    .addComponent(judulLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeDosenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeDosenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPembimbingLabel)
                    .addComponent(setPembimbingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(setButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void kodeDosenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeDosenTextFieldActionPerformed
    }//GEN-LAST:event_kodeDosenTextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel kodeDosenLabel;
    private javax.swing.JTextField kodeDosenTextField;
    private javax.swing.JButton setButton;
    private javax.swing.JComboBox<String> setPembimbingComboBox;
    private javax.swing.JLabel setPembimbingLabel;
    // End of variables declaration//GEN-END:variables
    public String getKodeDosenTATextField(){
        return kodeDosenTextField.getText();
    }
    public int getSetPembimbing() {
        return setPembimbingComboBox.getSelectedIndex() + 1;
    }
    public Object getSetButton() {
        return setButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        kodeDosenTextField.setText("");
    }
    public void addListener(ActionListener e) {
        kodeDosenTextField.addActionListener(e);
        setButton.addActionListener(e);
        backButton.addActionListener(e);
    }
}