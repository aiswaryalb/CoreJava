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
public class PreparedStatement2 {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement stmt=con.prepareStatement("update emp set ename=? where eid=?");
            stmt.setString(1,"Ramesh");
            stmt.setInt(2, 20012);
            int i=stmt.executeUpdate();
            System.out.println(i+" records updated");
            
        }
        catch(Exception e){System.out.println(e);}
    }
}
