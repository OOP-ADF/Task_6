# Task_6
Exercise on API using Twitter4J

## Aplikasi Java Twitter
Buatlah aplikasi java twitter yaitu aplikasi yang untuk mengakses social media twitter melaui apikasi java. Aplikasi java twitter ini memiliki spesifikasi sebagai berikut

### 0. Twitter OAuth Token
* log in ke akun Twitter
* buka halaman [apps.twitter.com] (apps.twitter.com)
* buatlag aplikasi baru dengan mengekklik create new App<br>![a01] (/asset/a01.PNG) <br>
* tuliskan nama dan deskripsi aplikasi, tuliskan website aplikasi (jika ada) atau tuliskan alamat URL akun Twitter masing-masing<br>![a02] (/asset/a02.PNG) <br>
* check Developer Agreement, dan klik Create your Twitter application<br>![a03] (/asset/a03.PNG) <br>
* setelah aplikasi dibuat, navigasikan ke tab Keys and Access Tokens
* akan terlihat 25-character Consumer Key dan 50-character Consumer Secret aplikasi yang baru dibuat<br>![a04] (/asset/a04.PNG) <br>
* scroll down dan klik create your new access token<br>![a05] (/asset/a05.PNG) <br>
* akan terlihat 49-digit-dash-character Access Token dan 45-character Access Token Secret<br>![a06] (/asset/a06.PNG) <br>
* buatlah sebuah file text dengan filename twitter4j.properties<br>![a07] (/asset/a07.PNG) <br>
* tuliskan Consumer Key, Consumer Secret, Access Token, and Access Token Secret ke dalam twitter4j.properties sebagai berikut<br>![a08] (/asset/a08.PNG) <br>
* twitter4j.properties telah terdaftar di dalam .gitignore, sehingga file twitter4j.properties tidak akan disinkronisasikan (push) ke repositori
* see more [here] (https://dev.twitter.com/oauth/overview/application-owner-access-tokens)


### 1. TwitterModel.java
* download library for Twitter API dari [Twitter4J] (http://twitter4j.org)
* temukan lib jar twitter4j-core-4.0.1.jar
* Buatlah sebuah project NetBeans
* Copy kan library twitter4j-core-4.0.1.jar dan twitter4j.properties pada folder project anda
* Tambahkan (add) seluruh library tersebut pada project NetBeans Anda
* Buatlah sebuah kelas dengan nama TwitterModel.java dengan spesifikasi sbb:<br>![01] (/asset/01.PNG) <br>
* Tambahkan import twitter4j<br>![02] (/asset/02.PNG) <br>
* Terdapat sebuah variable private Twitter dengan nama twitter

* <b>a. Constructor TwitterModel </b>
 * Constructor akan menginstansiasi object twitter <br>![03] (/asset/03.PNG) <br>

* <b>b. Method tweetStatus ( tweet : String ) </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan mengirimkan String tweet ke akun twitter<br>![04] (/asset/04.PNG) <br>
 * Tampilkan pesan status berhasil diposting dengan <br>![05] (/asset/05.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>![06] (/asset/06.PNG) <br>

* <b>c. Method getHomeTimeline() : String  </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan mengambil tweet yang ada pada home timeline dan mengembalikan isi String s<br>![07] (/asset/07.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>![06] (/asset/06.PNG) <br>
 * jika terjadi error, method akan mengembalikan nilai null
 
* <b>d. Method followUser ( user : String ) </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan membuat akun memfollow sebuah akun twitter dengan syntax<br>![08] (/asset/08.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>![06] (/asset/06.PNG) <br>

### 2. interface View.java
* terdapat method abstrak addListener<br>![18] (/asset/18.PNG) <br>

### 3. HomeTimeline.java
Buatlah class JFrame HomeTimeline.java dengan tampilan sebagai berikut <br>![09] (/asset/09.PNG) <br>
* terdapat komponen : 
 * JTextArea : txAreaTimeline, set Editable = false
 * JButton : btnCompose, btnFollow, btnRefresh, btnExit
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>![10] (/asset/10.PNG) <br>
* tambahkan method setTimeline untuk mengeset String pada text area Timeline<br>![11] (/asset/11.PNG) <br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>![12] (/asset/12.PNG) <br>

### 4. ComposeTweet.java
Buatlah class JFrame ComposeTweet.java dengan tampilan sebagai berikut <br>![13] (/asset/13.PNG) <br>
* terdapat komponen : 
 * JTextArea : txAreaTweet
 * JButton : btnCancel, btnTweet
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>![14] (/asset/14.PNG) <br>
* tambahkan method getTweet untuk mengambil String pada text area Tweet<br>![15] (/asset/15.PNG) <br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>![17] (/asset/17.PNG) <br>

### 5. FollowUser.java
Buatlah class JFrame FollowUser.java dengan tampilan sebagai berikut <br>![19] (/asset/19.PNG) <br>
* terdapat komponen : 
 * JTextField : txFieldUser
 * JButton : btnCancel, btnFollow
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>![20] (/asset/20.PNG) <br>
* tambahkan method getUser untuk mengambil String pada text area User<br>![21] (/asset/21.PNG) <br>
* tambahkan method setUser untuk mengeset String pada text area User<br>![22] (/asset/22.PNG) <br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>![23] (/asset/23.PNG) <br>


### 6. Controller.java
Buatlah class Controller.java sesuai class diagram berikut <br>![24] (/asset/24.PNG) <br>
* kelas Controller <b> implements ActionListener </b>
* implementasikan method actionPerformed(ActionEvent ae)

#### a. Method goToHomeTimeline()
* method menginstansiasi gui HomeTimeline
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui HomeTimeline<br>
* method mengeset text area timeline dengan String yang diambil dari getHomeTimeline dari model<br>![25] (/asset/25.PNG) <br>

#### b. Method goToComposeTweet()
* method menginstansiasi gui ComposeTweet
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui ComposeTweet<br>![26] (/asset/26.PNG) <br>

#### c. Method goToFollowUser()
* method menginstansiasi gui FollowUser
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui FollowUser<br>![27] (/asset/27.PNG) <br>

#### d. Constructor Controller()
* Constructor menginstansiasi TwitterModel model
* Constructor memanggil method goToHomeTimeline<br>![28] (/asset/28.PNG) <br>

#### e. Method actionPerformed(ActionEvent ae)
* get Object source action event<br>![29] (/asset/29.PNG) <br>
* cek current view
* jika view merupakan HomeTimeline : 
  * Downcast view<br>![30] (/asset/30.PNG) <br>
  * cek source action event
  * jika event berasal dari btnCompose : 
    * panggil method goToComposeTweet()
    * dispose view home
    * ![31] (/asset/31.PNG) 
  * jika event berasal dari btnFollow :
    * panggil method goToFollowUser()
    * dispose view home
    * ![32] (/asset/32.PNG) 
  * jika event berasal dari btnRefresh : 
    * set text area timeline dengan String yang diambil dari getHomeTimeline dari model
    * ![33] (/asset/33.PNG) 
  * jika event berasal dari btnExit :
    * tampilkan pesan
    * hentikan program
    * ![34] (/asset/34.PNG) 
* jika view merupakan ComposeTweet :
  * Downcast view<br>![35] (/asset/35.PNG) <br>
  * cek source action event
  * jika event berasal dari btnCancel : 
    * panggil method goToHomeTimeline
    * dispose view compose 
    * ![36] (/asset/36.PNG) 
  * jika event berasal dari btnTweet :
    * ambil String status tweet dari text area tweet
    * post status tweet dengan memanggil method tweetStatus dari objek model
    * panggil method goToHomeTimeline
    * dispose view compose
    * ![37] (/asset/37.PNG)
* jika view merupakan FollowUser :
  * Downcast view<br>![38] (/asset/38.PNG) <br>
  * cek source action event
  * jika event berasal dari btnCancel : 
    * panggil method goToHomeTimeline
    * dispose view follow
    * ![39] (/asset/39.PNG)
  * jika event berasal dari btnFollow : 
    * ambil String user dari text field user
    * follow user dengan memanggil method followUser dari objek model 
    * kosongkan text field user 
    * ![40] (/asset/40.PNG) 
	
### 7. Driver.java
* Buatlah class Driver.java yang memiliki main method (psvm)
* instansiasi objek Controller()
* cobalah aplikasi Java Twitter yang telah dibuat
