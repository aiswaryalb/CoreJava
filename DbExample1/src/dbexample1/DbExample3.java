/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbexample1;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Aiswarya
 */
public class DbExample3 {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            Statement stmt=con.createStatement();
            System.out.println("Before deletion");
            ResultSet rs=stmt.executeQuery("select * from info");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
            
            int i=stmt.executeUpdate("delete from info where id<10");
            System.out.println(i+" records deleted");
            System.out.println("After deletion");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
            con.close();
        
        }
        catch(Exception e){System.out.println(e);}
    }
    
}
