package CodeGame.Controller;

import CodeGame.CodeGame;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class GameView5Controller implements Initializable {
    public ImageView fifthQImage;
    public TextField answerFifth;

    public void initialize(URL url, ResourceBundle rb){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Aufgabe2White.png")));
        fifthQImage.setImage(image);
    }
    public void nextButtonFifthQOnClick(ActionEvent actionEvent) throws IOException {
        CodeGame.instance.loadScene("GameViewEnd.fxml");
    }
}
