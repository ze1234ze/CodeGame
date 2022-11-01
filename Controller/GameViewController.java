package CodeGame.Controller;

import CodeGame.Classes.PlayerScore;
import CodeGame.CodeGame;
import CodeGame.Model.CodeGameDataDB;
import CodeGame.Model.Game;
import CodeGame.Model.GameD;
import CodeGame.Model.Result;
import CodeGame.SoundCheck.SoundLoader;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class GameViewController implements Initializable {

    public ImageView firstQImage;
    public Label questionLabel;
    public TextField answerInput;
    public Label questionField;
    Result temp = new Result();
    ArrayList<Game> gameArrayList = new ArrayList<>();
    ArrayList<GameD> gameArrayListD = new ArrayList<>();

    public int i = 0;


    public void initialize(URL url, ResourceBundle rb) {

        if (MainViewController.darkM) {
            ShowQuestion();
        } else {
            ShowQuestionD();
        }

    }

    void ShowQuestion() {

        gameArrayList = CodeGameDataDB.getAllQuestions();
        //System.out.println( gameArrayList.get(0).getCodeimage());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameArrayList.get(i).getCodeimage())));
        firstQImage.setImage(image);

        rotation();

        questionLabel.setText(gameArrayList.get(i).getCodelabel());
        questionField.setText(gameArrayList.get(i).getCodequestion());
        temp.setResultFromSql(gameArrayList.get(i).getCodekey());
        PlayerScore.score += 10;
        //temp.setTempresult(temp.getTempresult() + 10);
    }

    void ShowQuestionD() {

        gameArrayListD = CodeGameDataDB.getAllQuestionsD();
        //System.out.println( gameArrayList.get(0).getCodeimage());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameArrayListD.get(i).getCodeimageD())));
        firstQImage.setImage(image);

        rotation();

        questionLabel.setText(gameArrayListD.get(i).getCodelabel());
        questionField.setText(gameArrayListD.get(i).getCodequestion());
        temp.setResultFromSql(gameArrayListD.get(i).getCodekey());
        PlayerScore.score += 10;
        //temp.setTempresult(temp.getTempresult() + 10);
    }


    //Ich brauche version 2 ohne Animation wenn ich question wiederhole
    void ShowQuestion2() {
        gameArrayList = CodeGameDataDB.getAllQuestions();
        //System.out.println( gameArrayList.get(0).getCodeimage());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameArrayList.get(i).getCodeimage())));
        firstQImage.setImage(image);
        questionLabel.setText(gameArrayList.get(i).getCodelabel());
        questionField.setText(gameArrayList.get(i).getCodequestion());
        temp.setResultFromSql(gameArrayList.get(i).getCodekey());
        PlayerScore.score += 10;

    }

    void ShowQuestion2D() {
        gameArrayListD = CodeGameDataDB.getAllQuestionsD();
        //System.out.println( gameArrayList.get(0).getCodeimage());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameArrayListD.get(i).getCodeimageD())));
        firstQImage.setImage(image);
        questionLabel.setText(gameArrayListD.get(i).getCodelabel());
        questionField.setText(gameArrayListD.get(i).getCodequestion());
        temp.setResultFromSql(gameArrayListD.get(i).getCodekey());
        PlayerScore.score += 10;

    }

    public void textWithEnter(KeyEvent keyEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        KeyCode keycode = keyEvent.getCode();
        //if(keycode == KeyCode.ENTER){ CodeGame.instance.loadScene("GameView.fxml");}
        if (keycode == KeyCode.ENTER) {
            SoundLoader.load();
            SoundLoader.play(SoundLoader.sound);
            if (Objects.equals(answerInput.getText(), temp.getResultFromSql()) && i <= 3) {
                i++;
                answerInput.setText("");
                if (MainViewController.darkM) {
                    ShowQuestion();
                } else {
                    ShowQuestionD();
                }
            } else if (i == 4) {
                CodeGame.instance.loadScene("GameViewEnd.fxml");
            } else {
                SoundLoader.loadWarning();
                SoundLoader.play(SoundLoader.sound);
                PlayerScore.score = PlayerScore.score - 10;
                //temp.setTempresult(temp.getTempresult() - 10);
                System.out.println("Falsch");
                Alert feedback = new Alert(Alert.AlertType.CONFIRMATION, "Exit Code?", ButtonType.CLOSE, ButtonType.CANCEL);
                feedback.setTitle(" YOU LOST <_10_> POINTS ! ! !");
                feedback.setHeaderText("WHATS WRONG WITH YOU?");
                feedback.setContentText("THINK ABOUT THIS ONE MORE TIME OR GO HOME!");
                Optional<ButtonType> result = feedback.showAndWait();
                if (feedback.getResult() == ButtonType.CLOSE) {

                    CodeGame.instance.loadScene("GameViewEnd.fxml");
                    PlayerScore.score = PlayerScore.score - 10;
                    //Platform.exit();
                    //System.exit(0);
                } else {
                    SoundLoader.load();
                    SoundLoader.play(SoundLoader.sound);
                    if (MainViewController.darkM) {
                        ShowQuestion();
                    } else {
                        ShowQuestionD();
                    }

                    PlayerScore.score = PlayerScore.score - 10;
                    //CodeGame.instance.loadScene("GameViewEnd.fxml");
                }
            }
        }
    }

    public void rotation() {
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(firstQImage);
        rotate.setDuration(Duration.millis(1000));
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.play();

    }


    public void nextButtonFirstQOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {


        if (Objects.equals(answerInput.getText(), temp.getResultFromSql()) && i <= 3) {
            i++;
            answerInput.setText("");
            SoundLoader.load();
            SoundLoader.play(SoundLoader.sound);
            if (MainViewController.darkM) {
                ShowQuestion();
            } else {
                ShowQuestionD();
            }

        } else if (i == 4) {

            CodeGame.instance.loadScene("GameViewEnd.fxml");
        } else {
            PlayerScore.score = PlayerScore.score - 10;
            //temp.setTempresult(temp.getTempresult() - 10);
            System.out.println("Falsch");
            SoundLoader.loadWarning();
            SoundLoader.play(SoundLoader.sound);
            Alert feedback = new Alert(Alert.AlertType.CONFIRMATION, "Exit Code?", ButtonType.CLOSE, ButtonType.CANCEL);
            feedback.setTitle(" YOU LOST <_10_> POINTS ! ! !");
            feedback.setHeaderText("WHATS WRONG WITH YOU?");
            feedback.setContentText("THINK ABOUT THIS ONE MORE TIME OR GO HOME!");
            Optional<ButtonType> result = feedback.showAndWait();
            if (feedback.getResult() == ButtonType.CLOSE) {

                CodeGame.instance.loadScene("GameViewEnd.fxml");
                PlayerScore.score = PlayerScore.score - 10;
                //Platform.exit();
                //System.exit(0);
            } else {
                if (MainViewController.darkM) {
                    ShowQuestion();
                } else {
                    ShowQuestionD();
                }

                PlayerScore.score = PlayerScore.score - 10;
                //CodeGame.instance.loadScene("GameViewEnd.fxml");
            }
        }
    }

}
