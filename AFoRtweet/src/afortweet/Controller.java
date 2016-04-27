/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afortweet;

import View.ComposeTweet;
import View.FollowUser;
import View.HomeTimeline;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author Acer
 */
public class Controller implements ActionListener {

    View view;
    TwitterModel model;

    public void goToHomeTimeline() {
        HomeTimeline homeTimeline = new HomeTimeline();
        homeTimeline.setVisible(true);
        homeTimeline.addListener(this);
        homeTimeline.setTimeline(model.getHomeTimeline());
        view = homeTimeline;
    }

    public void goToCompose() {
        ComposeTweet composeTweet = new ComposeTweet();
        composeTweet.setVisible(true);
        composeTweet.addListener(this);
        view = composeTweet;
    }

    public void goToFollowUser() {
        FollowUser followUser = new FollowUser();
        followUser.setVisible(true);
        followUser.addListener(this);
        view = followUser;
    }

    public Controller() {
        model = new TwitterModel();
        goToHomeTimeline();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (view instanceof HomeTimeline) {
            HomeTimeline homeTimeline = (HomeTimeline) view;
            if (o.equals(homeTimeline.getBtnCompose())) {
                goToCompose();
                homeTimeline.dispose();
            } else if (o.equals(homeTimeline.getBtnFollow())) {
                goToFollowUser();
                homeTimeline.dispose();
            } else if (o.equals(homeTimeline.getBtnRefresh())) {
                String timeline = model.getHomeTimeline();
                homeTimeline.setTimeline(timeline);
            } else if (o.equals(homeTimeline.getBtnExit())) {
                JOptionPane.showMessageDialog(null, "Thank You :* ");
                System.exit(0);
            }
        } else if (view instanceof ComposeTweet) {
            ComposeTweet composeTweet = (ComposeTweet) view;
            if (o.equals(composeTweet.getBtnCancel())) {
                goToHomeTimeline();
                composeTweet.dispose();                
            } else if (o.equals(composeTweet.getBtnTweet())) {
                String tweet = composeTweet.getTweet();
                model.tweetStatus(tweet);
                goToHomeTimeline();
                composeTweet.dispose();
            }
        } else if (view instanceof FollowUser) {
            FollowUser followUser = (FollowUser) view;
            if (o.equals(followUser.getBtnCancel())) {
                goToHomeTimeline();
                followUser.dispose();
            } else if (o.equals(followUser.getBtnFollow())) {
                String user = followUser.getUser();
                model.followUser(user);
                followUser.setUser("");
            }
        }

    }

}
