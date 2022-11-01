package CodeGame.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class CodeDBContacts {

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
    public static void insertContact(String name,String surname,String email,String message) {
        try {
            String sql = "INSERT INTO contacts(contactname, contactsurname, contactemail, contacttext) VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, message);


            preparedStatement.execute();
            System.out.println("Contact added!");
        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }
    }


}
