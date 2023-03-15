
package newpackage;

import java.sql.*;

public class connection {
    public static Connection getcon(){
        try{
            Class.forName("conn.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SY","root","");
            System.out.print("connected");
            return conn;
        }
        catch(Exception e){return null;}
    } 
    
}
