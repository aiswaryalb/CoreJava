/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Aiswarya
 */
public class Image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
            ps.setString(1, "flower");
            FileInputStream fin =new FileInputStream("G:\\Java\\JDBC\\flower.jpg");
            ps.setBinaryStream(2, fin,fin.available());
            int i=ps.executeUpdate();
            System.out.println(i+" records updated");
            con.close();
            
            
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
