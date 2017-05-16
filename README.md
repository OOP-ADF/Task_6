# Task_6
Exercise on API using Twitter4J

## Aplikasi Java Twitter
Buatlah aplikasi java twitter yaitu aplikasi yang untuk mengakses social media twitter melaui apikasi java. Aplikasi java twitter ini memiliki spesifikasi sebagai berikut

### 0. Twitter OAuth Token
* log in ke akun Twitter
* buka halaman [apps.twitter.com] (apps.twitter.com)
* buatlag aplikasi baru dengan mengekklik create new App<br>
![a01](https://cloud.githubusercontent.com/assets/13241336/26094915/eb49062a-3a45-11e7-9301-5fb7853a8c81.PNG)<br>
* tuliskan nama dan deskripsi aplikasi, tuliskan website aplikasi (jika ada) atau tuliskan alamat URL akun Twitter masing-masing<br>
![a02](https://cloud.githubusercontent.com/assets/13241336/26094917/eb6f85f2-3a45-11e7-84e3-8ac7be0c3904.PNG) <br>
* check Developer Agreement, dan klik Create your Twitter application<br>
![a03](https://cloud.githubusercontent.com/assets/13241336/26094916/eb5df760-3a45-11e7-8b8e-5ab83a152678.PNG) <br>
* setelah aplikasi dibuat, navigasikan ke tab Keys and Access Tokens
* akan terlihat 25-character Consumer Key dan 50-character Consumer Secret aplikasi yang baru dibuat<br>
![a04](https://cloud.githubusercontent.com/assets/13241336/26094918/eb81127c-3a45-11e7-87ad-129ccaa57bab.PNG) <br>
* scroll down dan klik create your new access token<br>
![a05](https://cloud.githubusercontent.com/assets/13241336/26094920/eb8e3236-3a45-11e7-9914-f0b46e0e7b5f.PNG)<br>
* akan terlihat 49-digit-dash-character Access Token dan 45-character Access Token Secret<br>
![a06](https://cloud.githubusercontent.com/assets/13241336/26094921/eb8f657a-3a45-11e7-96d4-d6dc7452b194.PNG) <br>
* buatlah sebuah file text dengan filename twitter4j.properties<br>
![a07](https://cloud.githubusercontent.com/assets/13241336/26094919/eb8dcd3c-3a45-11e7-8dab-1ac66ea75be8.PNG)<br>
* tuliskan Consumer Key, Consumer Secret, Access Token, and Access Token Secret ke dalam twitter4j.properties sebagai berikut<br>
![a08](https://cloud.githubusercontent.com/assets/13241336/26094922/eb9884ac-3a45-11e7-94c0-135f0cdb9f69.PNG) <br>
* twitter4j.properties telah terdaftar di dalam .gitignore, sehingga file twitter4j.properties tidak akan disinkronisasikan (push) ke repositori
* see more [here] (https://dev.twitter.com/oauth/overview/application-owner-access-tokens)


### 1. TwitterModel.java
* download library for Twitter API dari [Twitter4J] (http://twitter4j.org)
* temukan lib jar twitter4j-core-4.0.1.jar
* Buatlah sebuah project NetBeans
* Copy kan library twitter4j-core-4.0.1.jar dan twitter4j.properties pada folder project anda
* Tambahkan (add) seluruh library tersebut pada project NetBeans Anda
* Buatlah sebuah kelas dengan nama TwitterModel.java dengan spesifikasi sbb:<br>

![01](https://cloud.githubusercontent.com/assets/13241336/26094875/e9e65382-3a45-11e7-84ae-de47cc5a864d.PNG)<br>
* Tambahkan import twitter4j<br>
![02](https://cloud.githubusercontent.com/assets/13241336/26094878/e9f02ba0-3a45-11e7-9b3b-085560d27c93.PNG)<br>
* Terdapat sebuah variable private Twitter dengan nama twitter

* <b>a. Constructor TwitterModel </b>
 * Constructor akan menginstansiasi object twitter <br>
![03](https://cloud.githubusercontent.com/assets/13241336/26094874/e9e5a720-3a45-11e7-8569-a7f108056a0c.PNG)<br>

* <b>b. Method tweetStatus ( tweet : String ) </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan mengirimkan String tweet ke akun twitter<br>
![04](https://cloud.githubusercontent.com/assets/13241336/26094876/e9ea1cb0-3a45-11e7-85ce-f067047c45fc.PNG) <br>
 * Tampilkan pesan status berhasil diposting dengan <br>
![05](https://cloud.githubusercontent.com/assets/13241336/26094877/e9ee986c-3a45-11e7-9617-f5fa2881f6bd.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>
![06](https://cloud.githubusercontent.com/assets/13241336/26094879/e9f38200-3a45-11e7-975b-b66b137c80d3.PNG) <br>

* <b>c. Method getHomeTimeline() : String  </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan mengambil tweet yang ada pada home timeline dan mengembalikan isi String s<br>
![07](https://cloud.githubusercontent.com/assets/13241336/26094880/ea163020-3a45-11e7-8a95-66984970647c.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>![06](https://cloud.githubusercontent.com/assets/13241336/26094879/e9f38200-3a45-11e7-975b-b66b137c80d3.PNG)  <br>
 * jika terjadi error, method akan mengembalikan nilai null
 
* <b>d. Method followUser ( user : String ) </b>
 * lakukan syntax berikut di dalam blok <b> try-catch </b>
 * Method akan membuat akun memfollow sebuah akun twitter dengan syntax<br>
![08](https://cloud.githubusercontent.com/assets/13241336/26094881/ea180206-3a45-11e7-8497-a82cf7ec480a.PNG) <br>
 * tambahkan pesan di blok <b> catch </b> untuk menampilkan pesan error<br>![06](https://cloud.githubusercontent.com/assets/13241336/26094879/e9f38200-3a45-11e7-975b-b66b137c80d3.PNG) <br>

### 2. interface View.java
* terdapat method abstrak addListener<br>
![18](https://cloud.githubusercontent.com/assets/13241336/26094891/ea72b552-3a45-11e7-96a6-0185fc25308b.PNG) <br>

### 3. HomeTimeline.java
Buatlah class JFrame HomeTimeline.java dengan tampilan sebagai berikut <br>
![09](https://cloud.githubusercontent.com/assets/13241336/26094882/ea1bd4da-3a45-11e7-94cc-f66ac2f8a135.PNG) <br>
* terdapat komponen : 
 * JTextArea : txAreaTimeline, set Editable = false
 * JButton : btnCompose, btnFollow, btnRefresh, btnExit
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>
![10](https://cloud.githubusercontent.com/assets/13241336/26094884/ea25431c-3a45-11e7-9ecc-28e3f119cb8b.PNG)<br>
* tambahkan method setTimeline untuk mengeset String pada text area Timeline<br>
![11](https://cloud.githubusercontent.com/assets/13241336/26094883/ea1f41ec-3a45-11e7-99fd-43693349c0ff.PNG) <br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>
![12](https://cloud.githubusercontent.com/assets/13241336/26094885/ea26728c-3a45-11e7-9875-b3132271e3a4.PNG)<br>

### 4. ComposeTweet.java
Buatlah class JFrame ComposeTweet.java dengan tampilan sebagai berikut <br>
![13](https://cloud.githubusercontent.com/assets/13241336/26094887/ea4a0986-3a45-11e7-8114-101753a1dec7.PNG) <br>
* terdapat komponen : 
 * JTextArea : txAreaTweet
 * JButton : btnCancel, btnTweet
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>
![14](https://cloud.githubusercontent.com/assets/13241336/26094886/ea47d86e-3a45-11e7-9bd8-0956d54bdb53.PNG)<br>
* tambahkan method getTweet untuk mengambil String pada text area Tweet<br>
![15](https://cloud.githubusercontent.com/assets/13241336/26094889/ea607770-3a45-11e7-961a-6b3de6612053.PNG) <br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>
![17](https://cloud.githubusercontent.com/assets/13241336/26094893/ea7a94ac-3a45-11e7-8e7b-728e26590de4.PNG)<br>

### 5. FollowUser.java
Buatlah class JFrame FollowUser.java dengan tampilan sebagai berikut <br>
![19](https://cloud.githubusercontent.com/assets/13241336/26094892/ea7aafdc-3a45-11e7-9d53-8ca2d513a8cd.PNG)<br>
* terdapat komponen : 
 * JTextField : txFieldUser
 * JButton : btnCancel, btnFollow
* kelas mengimplementasikan interface View
* hapus main method (psvm) di dalam GUI
* tambahkan method getter objek untuk mengembalikan setiap objek button<br>
![20](https://cloud.githubusercontent.com/assets/13241336/26094894/ea8a6652-3a45-11e7-9486-ddb36ee77d0e.PNG)<br>
* tambahkan method getUser untuk mengambil String pada text area User<br>
![21](https://cloud.githubusercontent.com/assets/13241336/26094895/ea9395e2-3a45-11e7-81a1-abcf0d57d234.PNG)<br>
* tambahkan method setUser untuk mengeset String pada text area User<br>
![22](https://cloud.githubusercontent.com/assets/13241336/26094897/eaaa2bcc-3a45-11e7-9d59-e3c8bace715b.PNG)<br>
* tambahkan add listener pada setiap tombol dengan memanggil method addActionListener<br>
![23](https://cloud.githubusercontent.com/assets/13241336/26094896/eaa76392-3a45-11e7-9b27-2ca67c7a0938.PNG) <br>


### 6. Controller.java
Buatlah class Controller.java sesuai class diagram berikut <br>
![24](https://cloud.githubusercontent.com/assets/13241336/26094898/eaac9b46-3a45-11e7-8004-26c5b08f44a7.PNG) <br>
* kelas Controller <b> implements ActionListener </b>
* implementasikan method actionPerformed(ActionEvent ae)

#### a. Method goToHomeTimeline()
* method menginstansiasi gui HomeTimeline
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui HomeTimeline<br>
* method mengeset text area timeline dengan String yang diambil dari getHomeTimeline dari model<br>
![25](https://cloud.githubusercontent.com/assets/13241336/26094899/eaae39b0-3a45-11e7-8a2a-38d048686cb3.PNG)<br>

#### b. Method goToComposeTweet()
* method menginstansiasi gui ComposeTweet
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui ComposeTweet<br>
![26](https://cloud.githubusercontent.com/assets/13241336/26094900/eab9f3d6-3a45-11e7-8207-a33e54cd1190.PNG) <br>

#### c. Method goToFollowUser()
* method menginstansiasi gui FollowUser
* set visible view = true
* set lisener view dengan controller this
* set view = objek gui FollowUser<br>
![27](https://cloud.githubusercontent.com/assets/13241336/26094901/eac1fafe-3a45-11e7-994f-32676433f27e.PNG)<br>

#### d. Constructor Controller()
* Constructor menginstansiasi TwitterModel model
* Constructor memanggil method goToHomeTimeline<br>
![28](https://cloud.githubusercontent.com/assets/13241336/26094902/eada4ca8-3a45-11e7-9452-725060d191ca.PNG) <br>

#### e. Method actionPerformed(ActionEvent ae)
* get Object source action event<br>
![29](https://cloud.githubusercontent.com/assets/13241336/26094903/eade6766-3a45-11e7-98f8-c76b3c8a5be9.PNG)<br>
* cek current view
* jika view merupakan HomeTimeline : 
  * Downcast view<br>
![30](https://cloud.githubusercontent.com/assets/13241336/26094907/eafceee8-3a45-11e7-9a86-a4bc330c1503.PNG) <br>
  * cek source action event
  * jika event berasal dari btnCompose : 
    * panggil method goToComposeTweet()
    * dispose view home
    * ![31](https://cloud.githubusercontent.com/assets/13241336/26094904/eae01b9c-3a45-11e7-84e3-6f2ca0caa1ba.PNG)
  * jika event berasal dari btnFollow :
    * panggil method goToFollowUser()
    * dispose view home
    * ![32](https://cloud.githubusercontent.com/assets/13241336/26094906/eaf04a76-3a45-11e7-816a-eae036f848cf.PNG)
  * jika event berasal dari btnRefresh : 
    * set text area timeline dengan String yang diambil dari getHomeTimeline dari model
    * ![33](https://cloud.githubusercontent.com/assets/13241336/26094905/eaf0369e-3a45-11e7-8c70-4767ff8c1788.PNG)
  * jika event berasal dari btnExit :
    * tampilkan pesan
    * hentikan program
    * ![34](https://cloud.githubusercontent.com/assets/13241336/26094913/eb3e9f6e-3a45-11e7-9749-ef05b39da0e3.PNG)

* jika view merupakan ComposeTweet :
  * Downcast view<br>![35](https://cloud.githubusercontent.com/assets/13241336/26094908/eb0d0300-3a45-11e7-8c40-285073974821.PNG)<br>
  * cek source action event
  * jika event berasal dari btnCancel : 
    * panggil method goToHomeTimeline
    * dispose view compose 
    * ![36](https://cloud.githubusercontent.com/assets/13241336/26094909/eb157ff8-3a45-11e7-94a3-ce4845170b4e.PNG)

  * jika event berasal dari btnTweet :
    * ambil String status tweet dari text area tweet
    * post status tweet dengan memanggil method tweetStatus dari objek model
    * panggil method goToHomeTimeline
    * dispose view compose
    * ![37](https://cloud.githubusercontent.com/assets/13241336/26094910/eb21b1e2-3a45-11e7-9aac-0d29fb7224d9.PNG)
    
* jika view merupakan FollowUser :
  * Downcast view<br>![38](https://cloud.githubusercontent.com/assets/13241336/26094911/eb2484c6-3a45-11e7-93d2-392cab7c7034.PNG) <br>
  * cek source action event
  * jika event berasal dari btnCancel : 
    * panggil method goToHomeTimeline
    * dispose view follow
    * ![39](https://cloud.githubusercontent.com/assets/13241336/26094912/eb2e9196-3a45-11e7-801d-b4d14c83e679.PNG)

  * jika event berasal dari btnFollow : 
    * ambil String user dari text field user
    * follow user dengan memanggil method followUser dari objek model 
    * kosongkan text field user 
    * ![40](https://cloud.githubusercontent.com/assets/13241336/26094914/eb46ec5a-3a45-11e7-8797-9c26f6465f49.PNG)
	
### 7. Driver.java
* Buatlah class Driver.java yang memiliki main method (psvm)
* instansiasi objek Controller()
* cobalah aplikasi Java Twitter yang telah dibuat
