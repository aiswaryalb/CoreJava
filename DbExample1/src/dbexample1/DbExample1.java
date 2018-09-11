/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbexample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Aiswarya
 */
public class DbExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into details values('female',46790)");
            stmt.executeUpdate("insert into details values('male',45677)");
            ResultSet rs=stmt.executeQuery("select * from details");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            
            
            con.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    
}
