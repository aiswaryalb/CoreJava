/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Aiswarya
 */
public class PreparedStatement3 {
    
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement stmt=con.prepareStatement("delete from details where number=?");
            stmt.setInt(1,46790);
           
            int i=stmt.executeUpdate();
            System.out.println(i+" records updated");
            
        }
        catch(Exception e){System.out.println(e);}
    }
}
