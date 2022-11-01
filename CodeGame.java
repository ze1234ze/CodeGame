package CodeGame;

import CodeGame.Controller.MainViewController;
import CodeGame.Controller.StartViewController;
import CodeGame.Model.CodeDB;
import CodeGame.Model.CodeGameDataDB;
import CodeGame.Model.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class CodeGame extends Application {

    public static CodeGame instance;
    //Instancevariable
    Stage primaryStage;
    BorderPane borderPane;
    public static void run(String[] args){

    }




    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        instance = this;

        CodeDB.connect();
        CodeGameDataDB.connect();

        primaryStage.setTitle("O D E");
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.setResizable(false);

        //Create and show Scene

        initializeMain();
        loadScene("StartView.fxml");
        SetIcon();


        /*CodeGameDataDB.connect();
        CodeGameDataDB.showGameData(1);*/

        primaryStage.show();


    }


    public void SetIcon(){

        InputStream iconStream = getClass().getResourceAsStream("/Images/CodeLogo.jpg");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

    }


    public void initializeMain() throws IOException{

        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("/CodeGame/View/MainView.fxml"));
        borderPane = load.load();
        Scene primaryScene = new Scene(borderPane);
        primaryStage.setScene(primaryScene);

    }


    public void loadScene(String sceneToLoad) throws IOException{

        borderPane.getChildren().remove(borderPane.getCenter());

        String pfad = "/CodeGame/View/" + sceneToLoad;
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource(pfad));
        Pane pane = load.load();
        borderPane.setCenter(pane);

    }

    public void loadSceneWindow(String sceneToLoad) throws IOException{
      try {




        String pfad = "/CodeGame/View/" + sceneToLoad;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(pfad));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        InputStream iconStream = getClass().getResourceAsStream("/Images/CodeLogo.jpg");
        Image image = new Image(iconStream);
        stage.getIcons().add(image);
        stage.show();

    } catch(Exception e) {
        e.printStackTrace();
    }
    }



}
