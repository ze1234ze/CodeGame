package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.SoundCheck.SoundLoader;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Optional;

public class MainViewController {

    @FXML
    private BorderPane parent;
    public Menu menuButton;
    public Menu scoresButton;
    public Menu contactButton;
    public MenuItem darkMode;
    public static boolean darkM = true;
    public void darkModeOnClick(ActionEvent actionEvent) {
    darkM= !darkM;
    if(darkM){
        setLightMode();
    }else {
        setDarkMode();
    }
    }
   /* Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Exit Code?", ButtonType.CLOSE);
        alert.showAndWait();

        if(alert.getResult()== ButtonType.CLOSE){
        Platform.exit();
        System.exit(0);
    }*/

    private void setLightMode(){
        darkMode.setText("Dark Mode");
        parent.getStylesheets().remove("/CssNew/DarkMode.css");
        parent.getStylesheets().add("/CssNew/MyStyle.css");
    }
    private void setDarkMode(){
        darkMode.setText("Light Mode");
        parent.getStylesheets().remove("/CssNew/MyStyle.css");
        parent.getStylesheets().add("/CssNew/DarkMode.css");

    }

    public void exitOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.loadWarning();
        SoundLoader.play(SoundLoader.sound);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Exit Code?", ButtonType.CLOSE, ButtonType.CANCEL);
        alert.setTitle("CONFIRM YOUR CHOICE");
        alert.setHeaderText("A YOU SURE YOU WANT TO QUIT?");
        alert.setContentText("THINK ABOUT THIS ONE MORE TIME!");
        Optional<ButtonType> result = alert.showAndWait();
        if (alert.getResult()== ButtonType.CLOSE){
            SoundLoader.load();
            SoundLoader.play(SoundLoader.sound);
            Platform.exit();
            System.exit(0);
        } else {
            SoundLoader.loadStart();
            SoundLoader.play(SoundLoader.sound);
            CodeGame.instance.loadScene("StartView.fxml");
        }

    }

    public void showAllScoresOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("ScoresView.fxml");
    }

    public void jobsOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("JobsView.fxml");
    }

    public void aboutUsOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("AboutUsView.fxml");
    }

    public void backToStartOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadScene("StartView.fxml");
    }
}
