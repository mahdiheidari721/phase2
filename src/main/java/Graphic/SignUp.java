package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        Sign user=new Sign(Password.getText(),username.getText());
        Sign.Users.add(user);
        Sign.SignUp(username.getText(),Password.getText());
        MainView.getMV().setScene("Startt.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }


}
