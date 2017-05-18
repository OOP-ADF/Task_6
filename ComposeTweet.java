package Task_6;
  
import java.awt.event.ActionListener;
  
/**
*
* @author Gentur Cipto Tri Atmaja
* IF 38 09 / 1301140239
*/

public class ComposeTweet extends javax.swing.JFrame implements View 
{
  
      
	public ComposeTweet() 
	{
        initComponents();
    }
      
     
    @SuppressWarnings("unchecked")
      
    private void initComponents() 
	{
		jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnTweet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTweet = new javax.swing.JTextArea();
        Label2 = new javax.swing.JLabel();
  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Compose new Tweet...");
  
        btnCancel.setText("Cancel");
  
        btnTweet.setText("Tweet");
   
        txAreaTweet.setColumns(20);
        txAreaTweet.setRows(5);
        jScrollPane1.setViewportView(txAreaTweet);
  
        jLabel2.setText("140");
  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTweet))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnTweet)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
  
        pack();
    }
  
   
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnTweet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTweet;
    
  
    @Override
    public void addListener(ActionListener e) 
	{
        btnCancel.addActionListener(e);
        btnTweet.addActionListener(e);
    }
      
    public Object getBtnCancel()
	{
        return btnCancel;
    }
      
    public Object getBtnTweet(){
        return btnTweet;
    }
    
	public String getTweet()
	{
        return txAreaTweet.getText();
    } 
} 