/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestore;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Aiswarya
 */
public class Filestore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement ps=con.prepareStatement("insert into filetable values(?,?)");
            File f=new File("G:\\Java\\JDBC\\story.txt");
            FileReader fr=new FileReader(f);
            ps.setInt(1, 101);
            ps.setCharacterStream(2, fr, (int)f.length());
            int i=ps.executeUpdate();
            System.out.println(i+" records affected");
            con.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
