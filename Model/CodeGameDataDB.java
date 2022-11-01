package CodeGame.Model;

import java.sql.*;
import java.util.ArrayList;

public class CodeGameDataDB {

    private static String url = "jdbc:mysql://localhost:3306/codegame";
    private static String user = "root";
    private static String password = "";
    public static Connection connection;


    public static void connect() throws SQLException {

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException a) {
            System.out.println(a.getMessage());

        }
    }

    public static void showGameData(int id) {

        if(connection == null){
            System.out.println("Es gibt keine Connection. #Bitte SQL Server checken...");
            return;
        }

        try {
            String sql = "SELECT * FROM codegamedata WHERE id=" + id + ";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            Game game = new Game();

            while (resultSet.next()) {

                String codelabel = resultSet.getString("codelabel");
                String codeimage = resultSet.getString("codeimage");
                String codequestion = resultSet.getString("codequestion");
                String codekey = resultSet.getString("codekey");

                game.setCodelabel(codelabel);
                game.setCodeimage(codeimage);
                game.setCodequestion(codequestion);
                game.setCodekey(codekey);


            }

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

    }

    public static ArrayList<Game> getAllQuestions(){

        ArrayList<Game> gameArrayList = new ArrayList<>();

        if(connection == null){
            System.out.println("Es gibt keine Connection. #Bitte SQL Server checken...");
            return null;
        }

        try {
            String sql = "SELECT * FROM codegamedata;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                String codelabel = resultSet.getString("codelabel");
                String codeimage = resultSet.getString("codeimage");
                String codequestion = resultSet.getString("codequestion");
                String codekey = resultSet.getString("codekey");

                Game game = new Game(codelabel,codeimage,codequestion,codekey);
                gameArrayList.add(game);
            }

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

        return gameArrayList;

    }

    public static ArrayList<GameD> getAllQuestionsD(){

        ArrayList<GameD> gameArrayList = new ArrayList<>();

        if(connection == null){
            System.out.println("Es gibt keine Connection. #Bitte SQL Server checken...");
            return null;
        }

        try {
            String sql = "SELECT * FROM codegamedata;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                String codelabel = resultSet.getString("codelabel");
                String codeimageD = resultSet.getString("codeimageD");
                String codequestion = resultSet.getString("codequestion");
                String codekey = resultSet.getString("codekey");

                GameD gameD = new GameD(codelabel,codeimageD,codequestion,codekey);
                gameArrayList.add(gameD);
            }

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

        return gameArrayList;

    }


}

