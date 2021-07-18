package Graphic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Winning {
    @FXML
    private Button exit;

    @FXML
    void exitss(ActionEvent event) throws Exception {

            DataBase.write();
            MainView.getMV().setScene("Bye.fxml");

        Menu.mediaPlayer.stop();
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
