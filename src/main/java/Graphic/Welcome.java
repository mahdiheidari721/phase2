package Graphic;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class Welcome {

    @FXML
    private Button button;

    @FXML
    void go(ActionEvent event) throws IOException {
        MainView.getMV().setScene("Startt.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    public void go(javafx.event.ActionEvent actionEvent) throws Exception {
        DataBase.run();
        MainView.getMV().setScene("Startt.fxml");
//        String path = "D:\\images\\MainMenu.mp3";
//        Media media = new Media(new File(path).toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setAutoPlay(true);
//        mediaPlayer.setCycleCount(-1);
//        MediaView mediaView = new MediaView(mediaPlayer);
//        MainView.pane.getChildren().add(mediaView);
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
