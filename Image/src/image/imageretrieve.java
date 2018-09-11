/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Aiswarya
 */
public class imageretrieve {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement ps=con.prepareStatement("select * from imgtable");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                Blob b=rs.getBlob(2);
                byte barr[]=b.getBytes(1, (int)b.length());
                FileOutputStream fo=new FileOutputStream("G:\\Java\\JDBC\\violetflower.jpg");
                fo.write(barr);
                fo.close();
            }
            System.out.println("ok");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
