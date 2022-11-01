package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.SoundCheck.SoundLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AboutUsViewController implements Initializable {
    public ImageView imageAboutUs;

    public void contactUsOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadSceneWindow("ContactUsView.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image imageC = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/office.png")));
        imageAboutUs.setImage(imageC);
    }
}
