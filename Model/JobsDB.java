package CodeGame.Model;

import java.sql.*;

public class JobsDB {

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


    public static void insertKandidate(String kandidateposition,String kandidatename,String kandidatesurname,
                                       String kandidateemail,String kandidatemessage,String kandidatecv) {
        try {
            String sql = "INSERT INTO jobskandidate(kandidateposition, kandidatename, kandidatesurname, kandidateemail,kandidatemessage,kandidatecv)" +
                    " VALUES (?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kandidateposition);
            preparedStatement.setString(2, kandidatename);
            preparedStatement.setString(3, kandidatesurname);
            preparedStatement.setString(4, kandidateemail);
            preparedStatement.setString(5, kandidatemessage);
            preparedStatement.setString(6, kandidatecv);

            preparedStatement.execute();
            System.out.println("Kandidate added!");
        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }
    }
    public static Jobs newJob = new Jobs();
    public static void showJobs(int id) {

        if(connection == null){
            System.out.println("No connection to jobs");
            return;
        }

        try {
            String sql = "SELECT * FROM jobs WHERE id=" + id + ";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);



            while (resultSet.next()) {
                String jobname = resultSet.getString("jobname");
                String jobinfo = resultSet.getString("jobinfo");

                newJob.setJobTitel(jobname);
                newJob.setJobText(jobinfo);

            }

        } catch (SQLException a) {
            System.out.println(a.getMessage());
        }

    }

}
