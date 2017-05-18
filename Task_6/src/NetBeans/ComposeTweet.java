package NetBeans;

import java.awt.event.ActionListener;

/**
 *
 * @author Vicha Octavia Tama
 */
public class ComposeTweet extends javax.swing.JFrame {
    public ComposeTweet() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTweet = new javax.swing.JTextArea();
        BtnCancel = new javax.swing.JButton();
        BtnTweet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Compose new Tweet ...");

        txAreaTweet.setColumns(20);
        txAreaTweet.setRows(5);
        jScrollPane1.setViewportView(txAreaTweet);

        BtnCancel.setText("Cancel");

        BtnTweet.setText("Tweet");

        jLabel2.setText("140");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(BtnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(BtnTweet)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancel)
                    .addComponent(BtnTweet)
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnTweet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTweet;
    // End of variables declaration//GEN-END:variables

    public void addListener(ActionListener e) {
        BtnCancel.addActionListener(e);
        BtnTweet.addActionListener(e);
    }
    public Object getBtnCancel(){
        return BtnCancel;
    }
    public Object getBtnTweet(){
        return BtnTweet;
    }
    public String getTweet(){
        return txAreaTweet.getText();
    }
}