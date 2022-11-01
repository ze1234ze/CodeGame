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

public class GameView4Controller implements Initializable {
    public ImageView fourthQImage;
    public TextField answerFourth;

    public void initialize(URL url, ResourceBundle rb){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Aufgabe2White.png")));
        fourthQImage.setImage(image);
    }
    public void nextButtonFourthQOnClick(ActionEvent actionEvent) throws IOException {
        CodeGame.instance.loadScene("GameView5.fxml");
    }
}
