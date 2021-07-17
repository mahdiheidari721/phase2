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
     if(username.getText().toString().equalsIgnoreCase("Mahdi")&&
        password.getText().toString().equals("1380"))
     {
         wrongLogin.setText("Your password or your username is not wrong");
         MainView.getMV().setScene("Menu.fxml");
         Scene scene =new Scene(MainView.pane);
         MainView.getMV().getMainStage().setScene(scene);
     }
     else
         wrongLogin.setText("Your password or your username is wrong");
    }
    private void SignUp() throws IOException {
        MainView.getMV().setScene("SignUp.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

}
