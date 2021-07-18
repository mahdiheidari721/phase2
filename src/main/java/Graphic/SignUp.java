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

public class SignUp {

    @FXML
    private TextField username;

    @FXML
    private TextField Password;

    @FXML
    private Button button;

    @FXML
    void Register(ActionEvent event) throws IOException {
        Sign user=new Sign(Password.getText(),username.getText(),1);
        Sign.Users.add(user);
        Sign.SignUp(username.getText(),Password.getText(),"1");
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
