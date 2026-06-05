package travel.management.system;

import java.sql.DriverManager;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3307/travelmanagementsystem?characterEncoding=utf-8","root","");
            s=c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
