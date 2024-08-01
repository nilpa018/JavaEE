package DAO.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public Connection conn;

    public void connect() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/javamaven";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(jdbcUrl, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Problème de connexion !");
            } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
