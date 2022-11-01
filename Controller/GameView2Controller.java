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

public class GameView2Controller implements Initializable {


    public ImageView secondQImage;
    public TextField answerSecond;


    public void initialize(URL url, ResourceBundle rb){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Aufgabe2White.png")));
        secondQImage.setImage(image);
    }

    public void nextButtonSecondQOnClick(ActionEvent actionEvent) throws IOException {
        CodeGame.instance.loadScene("GameView3.fxml");
    }
}