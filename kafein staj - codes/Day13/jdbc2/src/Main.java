import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region from country");
            int count = 0;
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name") + " " + resultSet.getString("Code"));
                count++;
            }
            System.out.println("-- " + count + " countries printed --");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
        }
    }
}