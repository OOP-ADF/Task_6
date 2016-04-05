/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author TOSHIBA
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
        view = home;
    }
    public void goToComposeTweet(){
        ComposeTweet compose = new ComposeTweet();
        compose.setVisible(true);
        compose.addListener(this);
        view = compose;
    }
    public void goToFollowUser(){
        FollowUser follow = new FollowUser();
        follow.setVisible(true);
        follow.addListener(this);
        view = follow;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
    }
    
    
}
