package CodeGame.Controller;

import CodeGame.CodeGame;
import CodeGame.Model.CodeDB;
import CodeGame.Model.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.sql.SQLException;

public class ScoresViewController {
    @FXML
    private TableView<Player> scoreTable;

    @FXML
    private TableColumn<Player,String> playername;
    @FXML
    private TableColumn<Player, Integer> score;
    //ObservableList<Player> playerList = FXCollections.observableArrayList(new Player("Scroller", 20));
    ObservableList<Player> playerList = FXCollections.observableArrayList();

    public void initialize() throws SQLException{

        System.out.println("Table with players initialized");
        playername.setCellValueFactory(new PropertyValueFactory<Player, String>("playername"));
        score.setCellValueFactory(new PropertyValueFactory<Player, Integer>("score"));
        playerList = CodeDB.getAll();
        scoreTable.setItems(playerList);

    }


    public void resetScoreOnClick(ActionEvent actionEvent) throws SQLException, IOException {

        CodeDB.connect();
        CodeDB.deleteScores();
        CodeGame.instance.loadScene("ScoresView.fxml");

    }
}
