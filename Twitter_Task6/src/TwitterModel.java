/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import twitter4j.*;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Rona
 */
public class TwitterModel {
    private Twitter twitter;

    public TwitterModel() {
        twitter=new TwitterFactory().getInstance();
    }
    
    public void tweetStatus (String tweet){
        try {
            twitter.updateStatus(tweet);
            JOptionPane.showMessageDialog(null, "Pesan Berhasil");
            JOptionPane.showMessageDialog(null, "Judul Exception", "Pesan Exception", JOptionPane.ERROR_MESSAGE);
        } catch (TwitterException ex) {
            java.util.logging.Logger.getLogger(TwitterModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHomeTimeline(){
        String s = "";
        try {
            List<Status> status = twitter.getHomeTimeline();
            for (int i = 0; i<status.size(); i++) {
                s = s +status.get(i).getUser().getScreenName() + " - " + status.get(i).getText() + "\n\n";
            }
        } catch (TwitterException ex) {
            java.util.logging.Logger.getLogger(TwitterModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public void followUser(String user){
        try {
            twitter.createFriendship(user);
            JOptionPane.showMessageDialog(null, "Judul Exception", "Pesan Exception", JOptionPane.ERROR_MESSAGE);
        } catch (TwitterException ex) {
            java.util.logging.Logger.getLogger(TwitterModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
