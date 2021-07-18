package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Level {
    @FXML
    private javafx.scene.control.Button button1;
    @FXML
    private javafx.scene.control.Button button2;
    @FXML
    private javafx.scene.control.Button button3;
    @FXML
    private javafx.scene.control.Button button4;
    @FXML
    private javafx.scene.control.Button button5;

    public void level1(ActionEvent actionEvent) {

        if(Main.LEVEL>=1) {
            Main.CURRENTLEVEL = 1;
        }
        else{
            String path = "D:\\images\\warn.wav";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setVolume(1);
            mediaPlayer.setCycleCount(1);
            MediaView mediaView = new MediaView(mediaPlayer);
            MainView.pane.getChildren().add(mediaView);
        }
    }

    public void level2(ActionEvent actionEvent) {
        if(Main.LEVEL>=2) {
            Main.CURRENTLEVEL = 2;
        }
        else{
            String path = "D:\\images\\warn.wav";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setVolume(1);
            mediaPlayer.setCycleCount(1);
            MediaView mediaView = new MediaView(mediaPlayer);
            MainView.pane.getChildren().add(mediaView);
        }
    }

    public void level3(ActionEvent actionEvent) {
        if(Main.LEVEL>=3) {
            Main.CURRENTLEVEL = 3;
        }
        else{
            String path = "D:\\images\\warn.wav";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setVolume(1);
            mediaPlayer.setCycleCount(1);
            MediaView mediaView = new MediaView(mediaPlayer);
            MainView.pane.getChildren().add(mediaView);
        }
    }

    public void level4(ActionEvent actionEvent) {
        if(Main.LEVEL>=4) {
            Main.CURRENTLEVEL = 4;
        }
        else{
            String path = "D:\\images\\warn.wav";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setVolume(1);
            mediaPlayer.setCycleCount(1);
            MediaView mediaView = new MediaView(mediaPlayer);
            MainView.pane.getChildren().add(mediaView);
        }
    }

    public void level5(ActionEvent actionEvent) {
        if(Main.LEVEL>=5) {
            Main.CURRENTLEVEL =5;
        }
        else{
            String path = "D:\\images\\warn.wav";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setVolume(1);
            mediaPlayer.setCycleCount(1);
            MediaView mediaView = new MediaView(mediaPlayer);
            MainView.pane.getChildren().add(mediaView);
        }
    }

    public void backPressed(MouseEvent mouseEvent) throws IOException {
        MainView.getMV().setScene("Menu.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
