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
        if(Setting.MUSIC==1){Setting.mediaPlayer1.stop();}
        if(Setting.MUSIC==2){Setting.mediaPlayer2.stop();}
        if(Setting.MUSIC==3){Setting.mediaPlayer3.stop();}
        if(Setting.MUSIC==4){Setting.mediaPlayer4.stop();}
        if(Setting.MUSIC==5){Setting.mediaPlayer5.stop();}

        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }
}
