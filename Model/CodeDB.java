package CodeGame.Model;

import CodeGame.Classes.PlayerScore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

public class CodeDB {
    private static String url = "jdbc:mysql://localhost:3306/code";
    private static String user = "root";
    private static String password = "";
    public static Connection connection;


    public static void connect() throws SQLException {

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        }catch (SQLException a){
            System.out.println(a.getMessage());

        }
    }

    public static void insertPlayer(String playername){

        try {
            String sql = "INSERT INTO player(playername) VALUES (?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, playername);
            preparedStatement.execute();
            System.out.println("Player added!");
        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

    }

    //WHERE id = LAST_INSERT_ID()
    public static void updateScore(int score) {
        try {
            String sql = "UPDATE player SET score = ? WHERE id = LAST_INSERT_ID();";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, score);
            preparedStatement.execute();
            System.out.println("Player score updated!");

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

    }
    public static void insertPlayerScore(int score){

        try {
            String sql = "INSERT INTO player(score) VALUES (?) WHERE IDENT_CURRENT(playername);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, score);
            preparedStatement.execute();
            System.out.println("Score added!");
        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

    }

    public static void deleteScores() {
        try {
            String sql = "DELETE FROM player;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            System.out.println("All scores deleted");

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }


    }
    public static ObservableList<Player> getAll() throws SQLException {

        ObservableList<Player> playerListe = FXCollections.observableArrayList();
        String sql = "SELECT * FROM player;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){

            String playername = resultSet.getString("playername");
            int playerscore = resultSet.getInt("score");
            Player player = new Player(playername, playerscore);
            playerListe.add(player);

        }
        return playerListe;

    }


}
