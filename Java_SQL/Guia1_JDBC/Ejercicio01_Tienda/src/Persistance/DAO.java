package Persistance;

import javax.xml.transform.Result;
import java.sql.*;

public abstract class DAO {

    protected Connection connection = null;
    protected Statement statement = null;
    protected ResultSet resultSet = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";

    protected void connectDatabase() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE;
            connection = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Pasé la conexión a base.");
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void disconnectDatabase() throws SQLException {

        try {

            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }

            System.out.println("Pasé la desconexión.");
        } catch (SQLException e) {
            throw e;
        }

    }

    protected void insertUpdateErase(String sqlStatement) throws SQLException {
        try {
            connectDatabase();
            statement = connection.createStatement();
            statement.executeUpdate(sqlStatement);
            System.out.println("Pasé insertar.");
        } catch (SQLException e) {
            throw e;
        } finally {
            disconnectDatabase();
        }
    }

    protected void checkDatabase(String sqlStatement) throws SQLException {
        try {
            connectDatabase();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
        } catch (SQLException e) {
            throw e;
        }
    }

}
