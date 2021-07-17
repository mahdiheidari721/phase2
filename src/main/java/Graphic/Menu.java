package Graphic;
        import javafx.fxml.FXML;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.image.ImageView;
        import javafx.scene.input.MouseEvent;

        import java.io.IOException;

public class Menu {

    @FXML
    private Label play;

    @FXML
    private Label setting;

    @FXML
    private Label Level;

    @FXML
    private Label exit;

    @FXML
    void Levelpressed(MouseEvent event) throws IOException {
        MainView.getMV().setScene("Level.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    @FXML
    void exitpressed(MouseEvent event) throws IOException {
        MainView.getMV().setScene("Bye.fxml");
        Scene scene =new Scene(MainView.pane);
        MainView.getMV().getMainStage().setScene(scene);
    }

    @FXML
    void playpressed(MouseEvent event) {

    }

    @FXML
    void settingPressed(MouseEvent event) {

    }

}