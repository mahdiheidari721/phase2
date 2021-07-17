package Graphic;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
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

    public void go(javafx.event.ActionEvent actionEvent) throws IOException {
        MainView.getMV().setScene("Startt.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
