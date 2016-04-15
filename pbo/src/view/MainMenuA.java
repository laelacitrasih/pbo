package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainMenuA extends javax.swing.JPanel {
    public MainMenuA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FindKelompokTAButton = new javax.swing.JButton();
        AddMemberButton = new javax.swing.JButton();
        DeleteMemberButton = new javax.swing.JButton();
        FindMemberButton = new javax.swing.JButton();
        LocationLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        CreateKelompokTAButton = new javax.swing.JButton();
        DeleteKelompokTAButton = new javax.swing.JButton();

        FindKelompokTAButton.setText("Find Kelompok TA");

        AddMemberButton.setText("Add Member");

        DeleteMemberButton.setText("Delete Member");

        FindMemberButton.setText("Find Member");

        LocationLabel.setText("Main Menu | Dosen");

        judulLabel.setText("Sistem Informasi Pengolahan Data TA");

        CreateKelompokTAButton.setText("Create Kelompok TA");
        CreateKelompokTAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateKelompokTAButtonActionPerformed(evt);
            }
        });

        DeleteKelompokTAButton.setText("Delete Kelompok TA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LocationLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateKelompokTAButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(FindMemberButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteMemberButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddMemberButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FindKelompokTAButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteKelompokTAButton, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel)
                    .addComponent(judulLabel))
                .addGap(40, 40, 40)
                .addComponent(CreateKelompokTAButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteKelompokTAButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FindKelompokTAButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FindMemberButton)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void CreateKelompokTAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateKelompokTAButtonActionPerformed
    }//GEN-LAST:event_CreateKelompokTAButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMemberButton;
    private javax.swing.JButton CreateKelompokTAButton;
    private javax.swing.JButton DeleteKelompokTAButton;
    private javax.swing.JButton DeleteMemberButton;
    private javax.swing.JButton FindKelompokTAButton;
    private javax.swing.JButton FindMemberButton;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel judulLabel;
    // End of variables declaration//GEN-END:variables
    public void addListener(ActionListener e) {
        CreateKelompokTAButton.addActionListener(e);
        DeleteKelompokTAButton.addActionListener(e);
        FindKelompokTAButton.addActionListener(e);
        AddMemberButton.addActionListener(e);
        DeleteMemberButton.addActionListener(e);
        FindMemberButton.addActionListener(e);
    }
    public JButton getAddMemberButton() {
        return AddMemberButton;
    }
    public JButton getCreateKelompokTAButton() {
        return CreateKelompokTAButton;
    }
    public JButton getDeleteKelompokTAButton() {
        return DeleteKelompokTAButton;
    }
    public JButton getDeleteMemberButton() {
        return DeleteMemberButton;
    }
    public JButton getFindKelompokTAButton() {
        return FindKelompokTAButton;
    }
    public JButton getFindMemberButton() {
        return FindMemberButton;
    }
}