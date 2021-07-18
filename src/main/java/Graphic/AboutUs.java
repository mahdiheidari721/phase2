package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class AboutUs {
    @FXML
    private Button back;

    @FXML
    void backs(ActionEvent event) throws IOException {
        MainView.getMV().setScene("Menu.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
