package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Setting {
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
        Menu.mediaPlayer.setAutoPlay(true);
        Menu.mediaPlayer.setVolume(a);
        Menu.mediaPlayer.setCycleCount(-1);
    }

    @FXML
    void menus(ActionEvent event) {
        double a=Double.parseDouble(t2.getText());
        Main.mediaPlayer.setAutoPlay(true);
        Main.mediaPlayer.setVolume(a);
        Main.mediaPlayer.setCycleCount(-1);
    }
}
