package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import java.awt.*;
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
    }

    public void level2(ActionEvent actionEvent) {
    }

    public void level3(ActionEvent actionEvent) {
    }

    public void level4(ActionEvent actionEvent) {
    }

    public void level5(ActionEvent actionEvent) {
    }

    public void backPressed(MouseEvent mouseEvent) throws IOException {
        MainView.getMV().setScene("Menu.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
