 package twitter;
  
  import java.awt.event.ActionListener;
  import javax.swing.JButton;
  

  public class FollowUser extends javax.swing.JFrame implements View{
  
   
      public FollowUser() {
          initComponents();
      }
  
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {
  
          jLabel1 = new javax.swing.JLabel();
          txFieldUser = new javax.swing.JTextField();
          btnCancel = new javax.swing.JButton();
          btnFollow = new javax.swing.JButton();
  
          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  
          jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
          jLabel1.setText("Follow User");
  
          btnCancel.setText("Cancel");
  
          btnFollow.setText("Follow");
  
          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                          .addComponent(btnCancel)
                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(btnFollow))
                      .addGroup(layout.createSequentialGroup()
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(txFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel1))
                          .addGap(0, 0, Short.MAX_VALUE)))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(btnCancel)
                      .addComponent(btnFollow))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
  
          pack();
      }// </editor-fold>//GEN-END:initComponents
  

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnCancel;
      private javax.swing.JButton btnFollow;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JTextField txFieldUser;
      // End of variables declaration//GEN-END:variables
  
      @Override
      public void addListener(ActionListener e) {
          btnCancel.addActionListener(e);
          btnFollow.addActionListener(e);
      }
      
          public Object getBtnCancel() {
          return btnCancel;
      }
  
      public Object getBtnFollow() {
          return btnFollow;
      }
      
      public String getUser(){
          return txFieldUser.getText();
      }
      
      public void setUser(String s){
          txFieldUser.setText(s);
      }
  }