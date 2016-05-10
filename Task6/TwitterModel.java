
  package twitter;
  
  /**
   *
   * @author IchsanGhifari
   */
  
  import twitter4j.*;
  import java.util.List;
  import javax.swing.JOptionPane;
  
  public class TwitterModel {
      private Twitter twitter;
      
      public TwitterModel(){
           twitter = new TwitterFactory().getInstance();
       }
       public void tweetStatus (String tweet){
           try{
               twitter.updateStatus(tweet);
               JOptionPane.showMessageDialog(null, "pesan berhasil");
           } catch (Exception e){
               JOptionPane.showMessageDialog(null, "judul exception","pesan exception", JOptionPane.ERROR_MESSAGE);
           }
       }
       public String getHomeTimeline(){
           try {
               String s = "";
               List<Status> status = twitter.getHomeTimeline();
               for (int i = 0; i < status.size(); i  ) {
                   s = s   status.get(i).getUser().getScreenName()   " - "
                             status.get(i).getText()   "\n\n";
               }
               return s;
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Pesan Error","Error", JOptionPane.ERROR_MESSAGE);
               return null;
           }    
       }
       
       public void followUser(String user){
           try{
               twitter.createFriendship(user);
           }catch (Exception e){
               JOptionPane.showMessageDialog(null, "judul exception", "pesan exception", JOptionPane.ERROR_MESSAGE);
           }
       }
  }