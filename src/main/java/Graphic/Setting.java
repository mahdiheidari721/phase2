package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;

public class Setting {
    static int MUSIC=1;
//    static  String path="D:\\images\\Africa.mp3";
//    static Media media = new Media(new File(path).toURI().toString());
//   static MediaPlayer mediaPlayer = new MediaPlayer(media);
//    static MediaView mediaView = new MediaView(mediaPlayer);
    static  String path1="D:\\images\\Africa.mp3";
    static Media media1 = new Media(new File(path1).toURI().toString());
    static MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
    static MediaView mediaView1 = new MediaView(mediaPlayer1);
    static  String path2="D:\\images\\america.mp3";
    static Media media2 = new Media(new File(path2).toURI().toString());
    static MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
    static MediaView mediaView2 = new MediaView(mediaPlayer2);
    static  String path3="D:\\images\\pr.mp3";
    static Media media3 = new Media(new File(path3).toURI().toString());
    static MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
    static MediaView mediaView3 = new MediaView(mediaPlayer3);
    static  String path4="D:\\images\\antar.mp3";
    static Media media4 = new Media(new File(path4).toURI().toString());
    static MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
    static MediaView mediaView4 = new MediaView(mediaPlayer4);
    static  String path5="D:\\images\\russia.mp3";
    static Media media5 = new Media(new File(path5).toURI().toString());
    static MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
    static MediaView mediaView5 = new MediaView(mediaPlayer5);
    @FXML
    private Button game;

    @FXML
    private Button menu;
    @FXML
    private TextField t1;

    @FXML
    private TextField t2;
    @FXML
    private Button back;

    @FXML
    void backs(ActionEvent event) throws IOException {
        MainView.getMV().setScene("Menu.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
    @FXML
    void games(ActionEvent event) {
        double a=Double.parseDouble(t1.getText());
        if(MUSIC==1){
            mediaPlayer1.setAutoPlay(true);
            mediaPlayer1.setVolume(a);
            mediaPlayer1.setCycleCount(-1);
        }
        if(MUSIC==2){
            mediaPlayer2.setAutoPlay(true);
            mediaPlayer2.setVolume(a);
            mediaPlayer2.setCycleCount(-1);
        }
        if(MUSIC==3){
            mediaPlayer3.setAutoPlay(true);
            mediaPlayer3.setVolume(a);
            mediaPlayer3.setCycleCount(-1);
        }
        if(MUSIC==4){
            mediaPlayer4.setAutoPlay(true);
            mediaPlayer4.setVolume(a);
            mediaPlayer4.setCycleCount(-1);
        }
        if(MUSIC==5){
            mediaPlayer5.setAutoPlay(true);
            mediaPlayer5.setVolume(a);
            mediaPlayer5.setCycleCount(-1);
        }

    }

    @FXML
    void menus(ActionEvent event) {
        double a=Double.parseDouble(t2.getText());
        Main.mediaPlayer.setAutoPlay(true);
        Main.mediaPlayer.setVolume(a);
        Main.mediaPlayer.setCycleCount(-1);
    }
    @FXML
    private Button AFRICA;

    @FXML
    private Button PR;

    @FXML
    private Button ANTARCTICA;

    @FXML
    private Button RUSSIA;

    @FXML
    private Button AMERICA;

    @FXML
    void africa(ActionEvent event) {

        MUSIC=1;
    }

    @FXML
    void america(ActionEvent event) {

        MUSIC=2;
    }

    @FXML
    void antarctica(ActionEvent event) {
        MUSIC=4;
    }



    @FXML
    void pr(ActionEvent event) {
        MUSIC=3;
    }

    @FXML
    void russia(ActionEvent event) {
        MUSIC=5;
    }
}
