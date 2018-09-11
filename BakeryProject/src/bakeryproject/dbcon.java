/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakeryproject;

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
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");
        }
        catch(Exception e){
         e.printStackTrace();
        }
        return con;
        
        
        
    }
   
    
}
