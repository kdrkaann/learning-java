import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException{
        Connection dbConnection = null;
        try{
            dbConnection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connected to MySQL server.");
        }
        catch(SQLException exception){
            System.out.println("Error: " + exception.getMessage());
            System.out.println("Error code: " + exception.getErrorCode());
        }
        finally{
            dbConnection.close();
        }
    }
}