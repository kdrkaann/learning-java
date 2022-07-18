import java.sql.*;
import java.util.ArrayList;

public class Main {
    //main method is example method for delete
    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        PreparedStatement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.prepareStatement("DELETE from city WHERE id = ?");
            statement.setInt(1, 4087);
            statement.executeUpdate();
            System.out.println("Deleted successfully.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();;
        }
    }
    //below is the example method for update
    public static  void update() throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        PreparedStatement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.prepareStatement("UPDATE city set Population = ? WHERE id = ?");
            statement.setInt(1,400000);
            statement.setInt(2,4087);
            statement.executeUpdate();
            System.out.println("Updated successfully.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();;
        }
    }
    //below is the example method for insert with dynamic values
    public static  void dynamicInsert() throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        PreparedStatement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.prepareStatement(
                    "INSERT INTO city(Name, CountryCode, District, Population) VALUES(?,?,?,?)");
            statement.setString(1,"Düzce");
            statement.setString(2,"TUR");
            statement.setString(3,"Düzce");
            statement.setInt(4,800000);
            statement.executeUpdate();
            System.out.println("Added to database.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();;
        }
    }
    //below is the example method for insert with non-dynamic values
    public static void staticInsert() throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        Statement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO city(Name, CountryCode, District, Population) values('Düzce','TUR','Düzce','500000')");
            System.out.println("Added to database.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();
        }
    }
    //below is the example method for storing the country data in an arraylist
    public static void dataToObject() throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<Country>();
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region from country");
            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size() + " countries added to the ArrayList.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
        }
    }
}