/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;
import twitter4j.*;
import java.util.List;
/**
 *
 * @author user
 */
public class TwitterModel {
	private Twitter twitter;
	
	public TwitterModel() {
		twitter = new TwitterFactory().getInstance();
	}
	
	public void tweetStatus(String tweet) {
		try {
			twitter.updateStatus(tweet);
			JOptionPane.showMessageDialog (null,"pesan berhasil");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"judul exception",
				" pesan exception", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String getHomeTimeline () {
            try {
		String s = "";
		List <Status> status = twitter.getHomeTimeline();
                for (int i=0;i<status.size();i++) {
                	s = s+ status.get(i).getUser().getScreenName()+" - "
        			+status.get(i).getText()+"\n";
                }
                    
                return s;
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"judul exception",
				" pesan exception", JOptionPane.ERROR_MESSAGE);
		}
                return null;
                
	}
	
	public void FollowUser (String user) {
		try {
			twitter.createFriendship (user);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"judul exception",
				" pesan exception", JOptionPane.ERROR_MESSAGE);
		}
	}

}

