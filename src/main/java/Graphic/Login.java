package Graphic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;

public class Login {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    private Label wrongLogin;

    @FXML
    void userLogin(ActionEvent event) throws IOException {
      checkLogin();
    }
    @FXML
    void userSignUp(ActionEvent event) throws IOException {
     SignUp();
    }
    private void checkLogin() throws IOException {
     if(Sign.HasAccount(username.getText(),password.getText()))
     {
         wrongLogin.setText("Your password or your username is correct");
         MainView.getMV().setScene("Menu.fxml");
//         String path = "D:\\images\\MainMenu.mp3";
//         Media media = new Media(new File(path).toURI().toString());
//         MediaPlayer mediaPlayer = new MediaPlayer(media);
//         mediaPlayer.setAutoPlay(true);
//         mediaPlayer.setCycleCount(-1);
//         MediaView mediaView = new MediaView(mediaPlayer);
//         MainView.pane.getChildren().add(mediaView);
         Scene scene =new Scene(MainView.pane);
         MainView.getMV().getMainStage().setScene(scene);
     }
     else
         wrongLogin.setText("Your password or your username is wrong");
    }
    private void SignUp() throws IOException {
        MainView.getMV().setScene("SignUp.fxml");
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
