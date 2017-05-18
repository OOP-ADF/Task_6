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
import task6.View;

/**
 *
 * @author abdulnursahid
 */
public class Controller implements ActionListener {

    private TwitterModel model;
    private View view;
    private String currentView;
    private Jpanel mainPanel;
    
    private  HomeTimeline h;
    private ComposeTweet c;
    private FollowUser f;

    public Controller() {
        model = new TwitterModel();
        goToHomeTimeline();
        
        h = new HomeTimeline();
        c = new ComposeTweet();
        f = new FollowUser();
        
        h.addListener(this);
        c.addListener(this);
        f.addListener(this);
        
        mainPanel = view.getmainPanel;
        
        
    }

    public void goToHomeTimeline() {
        HomeTimeline home = new HomeTimeline();
        home.setVisible(true);
        home.addListener(this);
        home.setTimeline(model.getHomeTimeline());
        view = home;
    }

    private void goToComposeTweet() {
        ComposeTweet compose = new ComposeTweet();
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

            ComposeTweet compose = (ComposeTweet) view;

            if (source.equals(compose.getBtnCancel())) {
                goToHomeTimeline();
                compose.dispose();

            } else if (source.equals(compose.getBtntweet())) {
                String tweet = compose.getTweet();
                model.tweetStatus(tweet);
                goToHomeTimeline();
                compose.dispose();
            }   
            

            FollowUser follow = (FollowUser) view;
            if (source.equals(follow.getBtnCancel())) {
                goToHomeTimeline();
                follow.dispose();
            } else if (source.equals(follow.getBtnFollow())) {
                String user = follow.getUser();
                model.followUser(user);
                follow.setUser("");
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog((Component) view, e.getMessage());
        }
    }
}



