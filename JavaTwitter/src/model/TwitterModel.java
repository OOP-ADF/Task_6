package model;

import twitter4j.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Muhammad Hariz Arasy
 * 1301140259
 * IF-38-09
 */
public class TwitterModel {
    private Twitter twitter;
    
    public TwitterModel() {
        twitter = new TwitterFactory().getInstance();
    }
    
    public void tweetStatus(String tweet) {
        try {
            twitter.updateStatus(tweet);
            JOptionPane.showMessageDialog(null, "Tweet succeed");
        } catch (TwitterException ex) {
            JOptionPane.showMessageDialog(null,"Tweet failed",
                    ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getHomeTimeline() {
        String s = "";
        try {
            List<Status> status = twitter.getHomeTimeline();
            for (int i = 0; i < status.size(); i++) {
                s = s + status.get(i).getUser().getScreenName() + " - "
                        + status.get(i).getText() + "\n\n";
            }
        } catch (TwitterException ex) {
            s = null;
            JOptionPane.showMessageDialog(null,"Failed to show timeline",
                    ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    
    public void followUser(String user) {
        try {
            twitter.createFriendship(user);
        } catch (TwitterException ex) {
            JOptionPane.showMessageDialog(null,"Failed to follow user",
                    ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
}
