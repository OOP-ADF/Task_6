/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTwitter;
    import twitter4j.*;
    import java.util.List;
    import javafx.animation.Animation.Status;
    import javax.swing.JOptionPane;
/**
 *
 * @author Faishal
 */
public class TwitterModel {
    private final Twitter twitter;

    public TwitterModel() {
        twitter = new TwitterFactory().getInstance();
    }

    public void tweetStatus(String tweet) {
        try {
            twitter.updateStatus(tweet);
            JOptionPane.showMessageDIalog(null, "pesan berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "judul exception", "pesan exception", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getHomeTimeline() {
        String s = "";
        try {
            List<Status> status = twitter.getHomeTimeLine();
            for (Status statu : status) {
                s = (s + statu.getUser().getScreenName() + " - " + statu.getText() + "\n\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "judul exception", "pesan exception", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }

    public void followUser(String user) {
        try {
            twitter.createFriendship(user);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "judul exception", "pesan exception", JOptionPane.ERROR_MESSAGE);
        }
    }
}  

