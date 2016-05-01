/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatwitter;

import twitter4j.*;
import java.util.List;
import javac.swing.JOptionPane;
import javax.net.ssl.SSLEngineResult.Status;

/**
 *
 * @author Ekaaaa 
 * NIM 1301144312 
 * Kelas IF 38 02
 */
public class TwitterModel {

    private Twitter twitter;

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
            for (int i = 0; i < status.size(); i++) {
                s = (s + status.get(i).getUser().getScreenName() + " - " + status.get(i).getText() + "\n\n");
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
