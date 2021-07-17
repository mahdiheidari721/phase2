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
        MainView.getMV().setScene("Start.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }


}
