/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingproject1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Aiswarya
 */
public class dbcon {
    
    Connection con;
    PreparedStatement stat;
    ResultSet rs;
    
    public Connection getcon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swingproj","root","");
        }
        catch(Exception e){
         e.printStackTrace();
        }
        return con;
        
        
        
    }
    public void retrieve()throws SQLException
    {
        Statement stmt=con.createStatement();

        String query="select uname from loginpage";
        rs=stmt.executeQuery(query);
        System.out.println("Retrieved successfully");
    }
    
}
