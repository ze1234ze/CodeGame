package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.Model.CodeDBContacts;
import CodeGame.Model.Contacts;
import CodeGame.Model.JobsDB;
import CodeGame.SoundCheck.SoundLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.text.Position;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;

public class JobsMessageViewController implements Initializable {
    public TextField textNameJobs;
    public TextField textSurnameJobs;
    public TextArea textMessageJobs;
    public TextField textEmailEmail;
    public Button loadCV;
    @FXML
    private AnchorPane parent;

   String cvPath = "";

    public void initialize(URL url, ResourceBundle rb) {

        if (MainViewController.darkM) {
            parent.getStylesheets().remove("/CssNew/DarkMode.css");
            parent.getStylesheets().add("/CssNew/MyStyle.css");
        } else {
            parent.getStylesheets().remove("/CssNew/MyStyle.css");
            parent.getStylesheets().add("/CssNew/DarkMode.css");
        }

    }


    public void readyButtonJobsOnClick(ActionEvent actionEvent) throws SQLException, IOException, UnsupportedAudioFileException, LineUnavailableException {
            String position = Contacts.getPosition();
            String name = textNameJobs.getText();
            String surname = textSurnameJobs.getText();
            String email = textMessageJobs.getText();
            String message = textEmailEmail.getText();


            if(name.isBlank() == false && surname.isBlank() == false && email.isBlank() == false && message.isBlank() == false) {
                JobsDB.connect();
                JobsDB.insertKandidate(position, name, surname, email, message, cvPath);

                SoundLoader.load();
                SoundLoader.play(SoundLoader.sound);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"?", ButtonType.CLOSE);
                alert.setTitle("WE WILL CONTACT YOU!");
                alert.setHeaderText("ALL RIGHT, WAIT FOR A CALL! ");
                alert.setContentText("SEE YOU!");
                Optional<ButtonType> result = alert.showAndWait();
                if (alert.getResult()== ButtonType.CLOSE){
                CodeGame.instance.loadScene("StartView.fxml");
                final Node source = (Node) actionEvent.getSource();
                final Stage stage = (Stage) source.getScene().getWindow();
                stage.close();
                }
            }else{
                SoundLoader.loadWarning();
                SoundLoader.play(SoundLoader.sound);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"?", ButtonType.CLOSE);
                alert.setTitle("ADD CANDIDATE INFO!");
                alert.setHeaderText("YOU NEED TO ENTER ALL THE INFO ABOUT YOURSELF FIRST!");
                alert.setContentText("DO IT RIGHT NOW!");
                Optional<ButtonType> result = alert.showAndWait();
                if (alert.getResult()== ButtonType.CLOSE){
                    CodeGame.instance.loadScene("JobsView.fxml");
                } else {
                    System.out.println("Bitte namen eingeben");
                }

            }

        }

FileChooser fileChooser = new FileChooser();
    public void loadCVButtonOnClick(ActionEvent actionEvent) {

        Window stage = loadCV.getScene().getWindow();
        fileChooser.setTitle("Save your CV");

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("pdf", "*.pdf"));
        try {
            File file = fileChooser.showOpenDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
            cvPath = file.getAbsolutePath();
           // System.out.println("Path to file: " + file.getAbsolutePath());

        } catch (Exception ex) {

        }
    }









}
