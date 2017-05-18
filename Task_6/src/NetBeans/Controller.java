/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetBeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Vicha Octavia Tama
 */
public class Controller implements ActionListener {
    private TwitterModel model;
    private View view;
    
    public Controller(){
        model = new TwitterModel();
        goToHomeTimeline();
    }
    public void goToHomeTimeline(){
        HomeTimeline home = new HomeTimeline();
        home.setVisible(true);
        home.addListener(this);
        home.setTimeline(model.getHomeTimeline());
        view = (View) home;
    }
    public void goToComposeTweet(){
        ComposeTweet compose = new ComposeTweet();
        compose.setVisible(true);
        compose.addListener(this);
        view = (View) compose;
    }
    public void goToFollowUser(){
        FollowUser follow = new FollowUser();
        follow.setVisible(true);
        follow.addListener(this);
        view = (View) follow;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(view instanceof HomeTimeline){
            HomeTimeline home = (HomeTimeline) view;
            if(source.equals(home.getBtnCompose())){
                goToComposeTweet();
                home.dispose();
            }
            else if(source.equals(home.getBtnFollow())){
                goToFollowUser();
                home.dispose();
            }
            else if(source.equals(home.getBtnRefresh())){
                String Timeline = model.getHomeTimeline();
                home.setTimeline(Timeline);
            }
            else if(source.equals(home.getBtnExit())){
                JOptionPane.showMessageDialog(null,"Thankyou");
                System.exit(0);
            }
        }
        else if(view instanceof ComposeTweet){
            ComposeTweet compose = (ComposeTweet) view;
            if(source.equals(compose.getBtnCancel())){
                goToHomeTimeline();
                compose.dispose();
            }
            else if(source.equals(compose.getBtnTweet())){
                String Tweet = compose.getTweet();
                model.tweetStatus(Tweet);
                goToHomeTimeline();
                compose.dispose();
            }
        }
        else if (view instanceof FollowUser){
            FollowUser follow = (FollowUser) view;
            if(source.equals(follow.getBtnCancel())){
                goToHomeTimeline();
                follow.dispose();
            }
            else if(source.equals(follow.getBtnFollow())){
                String user = follow.getUser();
                model.followUser(user);
                follow.setUser("");
                
            }
        }
        
    }
    
    
}

