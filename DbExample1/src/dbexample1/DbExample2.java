/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbexample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aiswarya
 */
public class DbExample2 {
    
    public static void main(String[] args) {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from info");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"  "+rs.getString(2));
                
            }
            int i=stmt.executeUpdate("update info set house='Sreehari',district='Pathanamthitta' where id=10 ");
            System.out.println(i+"records updated");
        
        con.close();
    }
        catch(Exception e){System.out.println(e);}
    
}
}