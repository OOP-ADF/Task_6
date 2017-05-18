package Task_6;
  
import java.awt.event.ActionListener;

/**
*
* @author Gentur Cipto Tri Atmaja
* IF 38 09 / 1301140239
*/
  
  
public class HomeTimeline extends javax.swing.JFrame implements View 
{
    public HomeTimeline() 
	{
          initComponents();
	}
  
    @SuppressWarnings("unchecked")
      
    private void initComponents() 
	{
  
        btnCompose = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTimeline = new javax.swing.JTextArea();
  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  
        btnCompose.setText("Compose");
  
        btnFollow.setText("Follow User");
  
        btnRefresh.setText("Refresh");
  
        btnExit.setText("Exit");
  
        txAreaTimeline.setEditable(false);
        txAreaTimeline.setColumns(20);
        txAreaTimeline.setRows(5);
        jScrollPane1.setViewportView(txAreaTimeline);
  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
			.addContainerGap()
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCompose)
                        .addGap(26, 26, 26)
                        .addComponent(btnFollow)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnRefresh)
                        .addGap(29, 29, 29)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
		layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompose)
                    .addComponent(btnFollow)
                    .addComponent(btnRefresh)
                    .addComponent(btnExit))
                .addContainerGap())
				);
  
        pack();
		}
  
    private javax.swing.JButton btnCompose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFollow;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTimeline;
    
      @Override
    public void addListener(ActionListener e) 
	{
        btnCompose.addActionListener(e);
        btnExit.addActionListener(e);
        btnFollow.addActionListener(e);
        btnRefresh.addActionListener(e);
    }
      
    public Object getBtnCompose()
	{
        return btnCompose;
    }
      
    public Object getBtnExit()
	{
        return btnExit;
    }
      
    public Object getBtnFollow()
	{
        return btnFollow;
    }
      
    public Object getBtnRefresh()
	{
        return btnRefresh;
    }
      
    public void setTimeline(String s)
	{
        txAreaTimeline.setText(s);
    }
} 