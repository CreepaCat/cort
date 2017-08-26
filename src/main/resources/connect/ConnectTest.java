package connect;

//import java.sql.SQLException;

public class ConnectTest {
    public ConnectTest(){
        SQLConnector conn = new SQLConnector();
        try{
            conn.getConnect();
            System.out.println("连接成功");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConnectTest ct = new ConnectTest();
    }
}
