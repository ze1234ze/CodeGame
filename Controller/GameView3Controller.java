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

public class GameView3Controller implements Initializable {
    public ImageView thirdQImage;
    public TextField answerThird;

    public void initialize(URL url, ResourceBundle rb){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Aufgabe3White.png")));
        thirdQImage.setImage(image);
    }

    public void nextButtonThirdQOnClick(ActionEvent actionEvent) throws IOException {
        CodeGame.instance.loadScene("GameView4.fxml");
    }
}
