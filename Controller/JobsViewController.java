package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.Model.Contacts;
import CodeGame.Model.JobsDB;
import CodeGame.SoundCheck.SoundLoader;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JobsViewController implements Initializable {
    public TextArea jobsText1;
    public TextArea jobsText2;
    public TextArea jobsText3;
    public TextArea jobsText4;
    public Label jobsTitel1;
    public Label jobsTitel2;
    public Label jobsTitel4;
    public Label jobsTitel3;



    @Override
    public void initialize(URL location, ResourceBundle resources) {


        try {
            JobsDB.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //for(int i = 1; i <= 4; i++){
        JobsDB.showJobs(1);
        jobsTitel1.setText(JobsDB.newJob.getJobTitel());
        jobsText1.setText(JobsDB.newJob.getJobText());
        JobsDB.showJobs(2);
        jobsTitel2.setText(JobsDB.newJob.getJobTitel());
        jobsText2.setText(JobsDB.newJob.getJobText());
        JobsDB.showJobs(3);
        jobsTitel3.setText(JobsDB.newJob.getJobTitel());
        jobsText3.setText(JobsDB.newJob.getJobText());
        JobsDB.showJobs(4);
        jobsTitel4.setText(JobsDB.newJob.getJobTitel());
        jobsText4.setText(JobsDB.newJob.getJobText());

        }


    public void jobsButton1OnClick(ActionEvent actionEvent) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        Contacts.position = jobsTitel1.getText();
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);

        CodeGame.instance.loadSceneWindow("JobsMessageView.fxml");
    }

    public void jobsButton2OnClick(ActionEvent actionEvent) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Contacts.position = jobsTitel2.getText();
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadSceneWindow("JobsMessageView.fxml");
    }

    public void jobsButton3OnClick(ActionEvent actionEvent) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Contacts.position = jobsTitel3.getText();
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadSceneWindow("JobsMessageView.fxml");
    }

    public void jobsButton4OnClick(ActionEvent actionEvent) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Contacts.position = jobsTitel4.getText();
        SoundLoader.load();
        SoundLoader.play(SoundLoader.sound);
        CodeGame.instance.loadSceneWindow("JobsMessageView.fxml");
    }


}
