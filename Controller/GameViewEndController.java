package CodeGame.Controller;

import CodeGame.Classes.PlayerScore;
import CodeGame.CodeGame;
import CodeGame.Model.CodeDB;
import CodeGame.SoundCheck.SoundLoader;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class GameViewEndController implements Initializable {
    public TextField resultTextField;

    public void initialize(URL url, ResourceBundle rb){
        SoundLoader.loadEnd();
        try {
            SoundLoader.play(SoundLoader.sound);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        resultTextField.setText(String.valueOf(PlayerScore.score));
        CodeDB.updateScore(PlayerScore.score);
        PlayerScore.score = 0;
    }

    public void letsPlayAgainOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.loadStart();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("StartView.fxml");
    }

    public void scoresButtonEndOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("ScoresView.fxml");
    }

}
