/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Alienware
 */
public class Controller implements ActionListener{
    private TwitterModel  model;
    private View view;
    
    public Controller(){
        model = new TwitterModel();
        goToHomeTimeline();
}

   public void goToHomeTimeline() {
        HomeTimeline home = new HomeTimeline();
        home.setVisible(true);
        home.addListener(this);
        home.setTimeline(model.getHomeTimeline());
        view = home;
    }

    private void goToComposeTweet() {
        ComposeTweett compose = new ComposeTweett();
        compose.setVisible(true);
        compose.addListener(this);
        view = compose;
     }
    
    private void goToFollowUser() {
         FollowUser follow = new FollowUser();
         follow.setVisible(true);
         follow.addListener(this);
         view = follow;
    }
    
    public void actionPerformed(ActionEvent ae) {
         Object source = ae.getSource();
         try {
             if (view instanceof HomeTimeline) {
                 HomeTimeline home = (HomeTimeline) view;
                 if (source.equals(home.getBtnCompose())) {
                     goToComposeTweet();
                     home.dispose();
                 
                 } else if (source.equals(home.getBtnFollow())) {
                     goToFollowUser();
                     home.dispose();

                 } else if (source.equals(home.getBtnRefresh())) {
                     String timeline = model.getHomeTimeline();
                     home.setTimeline(timeline);
 
                 } else if (source.equals(home.getBtnExit())) {
                     JOptionPane.showMessageDialog(null, "Thank You");
                     System.exit(0);
                 }
             } else if (view instanceof ComposeTweett){
 
                 ComposeTweett compose = (ComposeTweett) view;
                 if (source.equals(compose.getBtncancel())) {
                     goToHomeTimeline();
                     compose.dispose();
 
                 } else if (source.equals(compose.getBtnTweet())) {
                     String tweet = compose.getTweet();
                     model.tweetstatus(tweet);
                     goToHomeTimeline();
                     compose.dispose();
                 }
             } else {
 
                 FollowUser follow = (FollowUser) view;
                 if (source.equals(follow.getBtnCancel())) {
                     goToHomeTimeline();
                     follow.dispose();
                 } else if (source.equals(follow.getBtnFollow())) {
                     String user = follow.getUser();
                     model.followeUser(user);
                     follow.setUser("");
                 }
             }
             }catch (Exception e) {
             JOptionPane.showMessageDialog((Component) view, e.getMessage());
         }
     }
 }

