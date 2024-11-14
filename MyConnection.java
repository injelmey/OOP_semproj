
package MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {
    private static Connection connect;
    private static MyConnection DBconn;
   
    private static String url = "jdbc:mysql://localhost:3306/semprojdb";
    private static String user = "root";
    private static String password = "";

   /* // Getter for connection
    public static Connection getConnect() {
        return connect;
    }

    // Setter for connection (though you don't seem to use this)
    public static void setConnect(Connection connect) {
        MyConnection.connect = connect;
    }

    // Getter for DBconn (MyConnection instance)
    public static MyConnection getMyConnection() {
        return DBconn;
    }

    // Setter for DBconn (though you don't seem to use this)
    public static void setMyConnection(MyConnection dbconnect) {
        MyConnection.DBconn = dbconnect;
    }*/
    
    // Constructor for MyConnection
    public MyConnection() {
        connect = null;
        try {
            connect = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            // Log error if connection fails
            JOptionPane.showMessageDialog(null, "Connection failed: " + e.getMessage(), 
                                          "Database Error", JOptionPane.ERROR_MESSAGE);
            //e.printStackTrace(); // Optional: print stack trace for debugging
        }
    }

    // Singleton pattern for getting the MyConnection instance
    public static MyConnection getMyConnection() {
        if (DBconn == null) {
            synchronized (MyConnection.class) {
                if (DBconn == null) {
                    DBconn = new MyConnection();
                }
            }
        }
        return DBconn;
    }
    public static void main(String[] args) {
        //System.out.println("Hello World!");
    }
    
    // Returns the current connection object
    public static Connection getConnection() {
        return connect;
    }
}


/*package MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {
    private static Connection connect;
    private static MyConnection DBconn;
   
    private static String url= "jdbc:mysql://localhost:3306/semprojdb";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnect() {
        return connect;
    }

    public static void setConnect(Connection connect) {
        MyConnection.connect = connect;
    }

    public static MyConnection getMyConnection() {
        return DBconn;
    }

    public static void setMyConnection(MyConnection dbconnect) {
        MyConnection.DBconn = dbconnect;
    }
    
    public MyConnection(){
        connect = null;
        try {
         connect = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e) {
           
        }
    } 
        public static MyConnection getDBConnect(){
            if(DBconn == null){
                DBconn = new MyConnection();
            }
            return DBconn;
        }
        
        public static Connection getConnection(){
            return connect;
        }
    
}*/
