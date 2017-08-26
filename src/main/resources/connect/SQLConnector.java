package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnector {
    Connection conn = null;
    public  SQLConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cart?characterEncoding=UTF-8",
                    "root", "123");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Connection getConnect(){
        return conn;
    }
}
