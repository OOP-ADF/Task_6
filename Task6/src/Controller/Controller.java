/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TwitterModel;
import View.ComposeTweet;
import View.FollowUser;
import View.HomeTimeLine;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author PrimaAnanda-PC
 */
public class Controller implements ActionListener {
    private TwitterModel model;
    private View view;
    
    public void goToHomeTimeLine() {
        HomeTimeLine htl = new HomeTimeLine();
        htl.setVisible(true);
        htl.addListener(this);
        htl.setTimeline(model.getHomeTimeline());
        view = htl;
    }
    
    public void goToComposeTweet() {
        ComposeTweet compose = new ComposeTweet();
        compose.setVisible(true);
        compose.addListener(this);
        view = compose;
    }
    
    public void goToFollowUser() {
        FollowUser follow = new FollowUser();
        follow.setVisible(true);
        follow.addListener(this);
        view = follow;
    }
    
    public Controller() {
        model = new TwitterModel();
        goToHomeTimeLine();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(view instanceof HomeTimeLine) {
            HomeTimeLine home = (HomeTimeLine) view;
            if(source.equals(home.getBtnCompose())) {
                goToComposeTweet();
                home.dispose();
            } else if(source.equals(home.getBtnFollow())) {
                goToComposeTweet();
                home.dispose();
            } else if(source.equals(home.getBtnRefresh())) {
                String timeline = model.getHomeTimeline();
                home.setTimeline(timeline);
            } else if(source.equals(home.getBtnExit())) {
                JOptionPane.showMessageDialog(null, "Thank you");
                System.exit(0);
            }
        } else if (view instanceof ComposeTweet) {
            ComposeTweet compose = (ComposeTweet) view;
            if(source.equals(compose.getBtnCancel())) {
                goToHomeTimeLine();
                compose.dispose();
            } else if(source.equals(compose.getBtnTweet())) {
                String tweet = compose.getTweet();
                model.tweetStatus(tweet);
                goToHomeTimeLine();
                compose.dispose();
            }
        } else if (view instanceof FollowUser) {
            FollowUser follow = (FollowUser) view;
            if(source.equals(follow.getBtnCancel())) {
                goToHomeTimeLine();
                follow.dispose();
            } else if(source.equals(follow.getBtnFollow())) {
                String user = follow.getUser();
                model.followUser(user);
                follow.setUser("");
            }
        }
    }
}
