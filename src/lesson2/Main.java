package lesson2;
import java.sql.*;
public class Main {
    // static final String DRIVER  = "com.mysql.jdbc.Driver";
    // static final String DB = "jdbc:mysql://localhost:3306/mysql";
    // static final String USER  = "root";
    // static final String PASSWORD = "1Nokian82";


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Statement statement = null;
        statement = Singleton.getConnection().createStatement();
        try {

            final String insertSQL = "INSERT INTO users (login, password, nick)" +
                    " + VALUES ('killer', 'killer', 'killer')";
            statement.executeUpdate("INSERT INTO users (login, password, nick) VALUE (123, 123, 324)");
            System.out.println(insertSQL);
      } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                if (statement!=null){
                    statement.close();
                }
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}