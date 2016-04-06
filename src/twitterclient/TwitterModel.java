/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterclient;
import twitter4j.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agungrb
 */
public class TwitterModel {
    private Twitter twitter;
    
    public TwitterModel() {
        twitter = new TwitterFactory().getInstance();
    }
    
    public void tweetStatus(String tweet) {
        
    }
}
