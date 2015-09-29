package applicationgsb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectBDD {

    public static Connection con = null;
    public static void ConnectBDD() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/gsb", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
