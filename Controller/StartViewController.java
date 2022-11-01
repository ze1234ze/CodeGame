package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.Model.CodeDB;
import CodeGame.SoundCheck.SoundLoader;
import CodeGame.SoundCheck.TestSound;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class StartViewController implements Initializable {


    @FXML
    public TextField enteredName;
    @FXML
    public ImageView welcomeC;
    @FXML
    public ImageView welcomeO;
    @FXML
    public ImageView welcomeD;
    @FXML
    public ImageView welcomeE;

    public void letsPlayOnClick(ActionEvent actionEvent) throws IOException, SQLException, UnsupportedAudioFileException, LineUnavailableException {

        String name = enteredName.getText();
        if(name.isBlank() == false) {
            CodeDB.insertPlayer(name);
            CodeGame.instance.loadScene("GameView.fxml");
            SoundLoader.load();
            SoundLoader.play(SoundLoader.sound);
        }
        else{
            SoundLoader.loadWarning();
            SoundLoader.play(SoundLoader.sound);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Exit Code?", ButtonType.CLOSE);
            alert.setTitle("WE NEED TO TALK!");
            alert.setHeaderText("YOU NEED TO ENTER YOUR NAME TO PLAY!");
            alert.setContentText("DO IT RIGHT NOW!");
            Optional<ButtonType> result = alert.showAndWait();
            if (alert.getResult()== ButtonType.CLOSE){
                CodeGame.instance.loadScene("StartView.fxml");
            } else {
                System.out.println("Bitte namen eingeben");
            }

        }

    }

    public void initialize(URL url, ResourceBundle rb){
        SoundLoader.loadStart();
        try {
            SoundLoader.play(SoundLoader.sound);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Image imageC = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/NewCOhneB.png")));
        welcomeC.setImage(imageC);
        Image imageO = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/NewOOhneB.png")));
        welcomeO.setImage(imageO);
        Image imageD = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/NewDOhneB.png")));
        welcomeD.setImage(imageD);
        Image imageE = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/NewEOhneB.png")));
        welcomeE.setImage(imageE);

        TranslateTransition translateC = new TranslateTransition();
        translateC.setDuration(Duration.millis(1000));
        translateC.setNode(welcomeC);
        translateC.setByX(-550);
        translateC.setByY(-470);
        translateC.play();

        TranslateTransition translateO = new TranslateTransition();
        translateO.setDuration(Duration.millis(1250));
        translateO.setNode(welcomeO);
        translateO.setByX(-380);
        translateO.setByY(-470);
        translateO.play();

        TranslateTransition translateD = new TranslateTransition();
        translateD.setDuration(Duration.millis(1500));
        translateD.setNode(welcomeD);
        translateD.setByX(-220);
        translateD.setByY(-470);
        translateD.play();

        TranslateTransition translateE = new TranslateTransition();
        translateE.setDuration(Duration.millis(1750));
        translateE.setNode(welcomeE);
        translateE.setByX(-50);
        translateE.setByY(-470);
        translateE.play();

    }

    //public final EventHandler<? super KeyEvent> getOnKeyPressed()
    public void textWithEnter(KeyEvent keyEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        KeyCode keycode = keyEvent.getCode();
        //if(keycode == KeyCode.ENTER){ CodeGame.instance.loadScene("GameView.fxml");}
        if(keycode == KeyCode.ENTER){ String name = enteredName.getText();
            if(name.isBlank() == false) {
                CodeDB.insertPlayer(name);
                CodeGame.instance.loadScene("GameView.fxml");

                SoundLoader.load();
                SoundLoader.play(SoundLoader.sound);
            }
            else{
                SoundLoader.loadWarning();
                SoundLoader.play(SoundLoader.sound);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Exit Code?", ButtonType.CLOSE);
                alert.setTitle("WE NEED TO TALK!");
                alert.setHeaderText("YOU NEED TO ENTER YOUR NAME TO PLAY!");
                alert.setContentText("DO IT RIGHT NOW!");
                Optional<ButtonType> result = alert.showAndWait();
                if (alert.getResult()== ButtonType.CLOSE){
                    CodeGame.instance.loadScene("StartView.fxml");
                } else {
                    System.out.println("Bitte namen eingeben");
                }

            }
        }
        //KeyCode.ENTER =
    }


}
