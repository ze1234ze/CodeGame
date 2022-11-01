package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.Model.CodeDB;
import CodeGame.Model.CodeDBContacts;
import CodeGame.SoundCheck.SoundLoader;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;

public class ContactUsViewController implements Initializable {

    public TextField textNameContact;
    public TextField textSurnameContact;
    public TextField textEmailContact;
    public TextArea textMessageContact;
    public AnchorPane parent;

    public void initialize(URL url, ResourceBundle rb) {

        if (MainViewController.darkM) {
            parent.getStylesheets().remove("/CssNew/DarkMode.css");
            parent.getStylesheets().add("/CssNew/MyStyle.css");
        } else {
            parent.getStylesheets().remove("/CssNew/MyStyle.css");
            parent.getStylesheets().add("/CssNew/DarkMode.css");
        }

    }

    public void readyButtonOnClick(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException, SQLException {

        String name = textNameContact.getText();
        String surname = textSurnameContact.getText();
        String email = textEmailContact.getText();
        String message = textMessageContact.getText();

        if(name.isBlank() == false && surname.isBlank() == false && email.isBlank() == false && message.isBlank() == false) {
            CodeDBContacts.connect();
            CodeDBContacts.insertContact(name, surname,email,message);
            CodeGame.instance.loadScene("StartView.fxml");
            final Node source = (Node) actionEvent.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        }

        else{
            SoundLoader.loadWarning();
            SoundLoader.play(SoundLoader.sound);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"?", ButtonType.CLOSE);
            alert.setTitle("CONTACT INFO!");
            alert.setHeaderText("YOU NEED TO ENTER ALL THE INFO ABOUT YOU!");
            alert.setContentText("DO IT RIGHT NOW!");
            Optional<ButtonType> result = alert.showAndWait();
            if (alert.getResult()== ButtonType.CLOSE){
                CodeGame.instance.loadScene("AboutUsView.fxml");
            } else {
                System.out.println("Bitte namen eingeben");
            }

        }

    }
}
