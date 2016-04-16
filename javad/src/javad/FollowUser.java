/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javad;

import java.awt.event.ActionListener;

/**
 *
 * @author Ari Adrian Ibrahim
 */
public class FollowUser extends javax.swing.JFrame implements View  {

    /**
     * Creates new form FollowUser
     */
    public FollowUser() {
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

        btnCancel = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txFieldUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancel.setText("Cancel");

        btnFollow.setText("Follow");

        jLabel1.setText("Follow User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(btnFollow))
                        .addComponent(txFieldUser, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnFollow))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     public Object getBtnCancel() {
        return btnCancel;
    }

    public Object getBtnFollow() {
        return btnFollow;
    }

    public String getUser() {
        return txFieldUser.getText();
    }

    public void setUser(String s) {
        txFieldUser.setText(s);
    }
    @Override
    public void addListener(ActionListener e){
        btnCancel.addActionListener(e);
        btnFollow.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFollow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txFieldUser;
    // End of variables declaration//GEN-END:variables
}
