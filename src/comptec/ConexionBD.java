
package comptec;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionBD {

    Connection conect = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/comptec", "root", "1234");
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Conexión fallida" + e.getMessage());
        }
        return conect;

    }
}

