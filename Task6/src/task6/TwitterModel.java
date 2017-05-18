/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task6;

/**
 *
 * @author dhivazhr
 */
import twitter4j.*;
import java.util.List;
import javax.swing.JOptionPane;

public class TwitterModel {
    private Twitter twitter;
    
    public TwitterModel() {
        twitter = new TwitterFactory().getInstance();
    }
    
    public void tweetStatus(String tweet) {
        try {
            twitter.updateStatus(tweet);
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex, "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getHomeTimeline() {
        try {
            String s = "";
            List<Status> status = twitter.getHomeTimeline();
            for (int i=0; i<status.size(); i++) {
                s = s+status.get(i).getUser().getScreenName()+" - "+status.get(i).getText()+"\n\n";
            }
            return s;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,ex,"Gagal",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void followUser(String user) {
        try {
            twitter.createFriendship(user);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Gagal",JOptionPane.ERROR_MESSAGE);
        }
    }
}
