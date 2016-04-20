/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class Controller implements ActionListener{
    TwitterModel model;
    View view;
    
    public Controller(){
        model = new TwitterModel();
        gotoHomeTimeline();
    }
    public void gotoHomeTimeline(){
        HomeTimeline home = new HomeTimeline();
        home.setVisible(true);
        home.addListener(this);
        home.setTimeline(model.getHomeTimeline());
        view= home;
    }
    public void gotoComposeTweet(){
        ComposeTweet compose = new ComposeTweet();
        compose.setVisible(true);
        compose.addListener(this);
        view= compose;
    }
    public void gotoFollowUser(){
        FollowUser follow = new FollowUser();
        follow.setVisible(true);
        follow.addListener(this);
        view = follow;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         Object source = ae.getSource();
         if(view instanceof HomeTimeline){
         HomeTimeline home = (HomeTimeline) view;
            if(source.equals(home.getBtnCompose())){
                gotoComposeTweet();
                home.dispose();
            }else if(source.equals(home.getBtnFollow())){
                gotoComposeTweet();
                home.dispose();
            }else if(source.equals(home.getBtnRefresh())){
                String timeline = model.getHomeTimeline();
                home.setTimeline(timeline);
            }else if(source.equals(home.getBtnExit())){
                JOptionPane.showMessageDialog(null,"Thank You");
                System.exit(0);
            }
         }
         if(view instanceof ComposeTweet){
             ComposeTweet compose = (ComposeTweet) view;
             if(source.equals(compose.getBtnCancel())){
                 gotoHomeTimeline();
                 compose.dispose();
             }else if(source.equals(compose.getBtnTweet())){
                 String tweet = compose.getTweet();
                 model.tweetStatus(tweet);
                 gotoHomeTimeline();
                 compose.dispose();
             }
         }
         if(view instanceof FollowUser){
             FollowUser follow = (FollowUser) view;
             if(source.equals(follow.getBtnCencel())){
                 gotoHomeTimeline();
                 follow.dispose();
             }else if(source.equals(follow.getBtnFollow())){
                 String user = follow.getUser();
                 model.followUser(user);
                 follow.setUser("");
             }
         }
         
         
    }
}
