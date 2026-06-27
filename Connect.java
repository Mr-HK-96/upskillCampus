import java.sql.*;
import javax.swing.*;

public class Connect {
    Connection con = null;

    public static Connection ConnectDB() {
        try {
            // ✅ Updated driver for MySQL 8.x and Connector 9.x
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hms_db?useSSL=false&serverTimezone=UTC",
                "root",
                "H@rsh107860"
            );
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}