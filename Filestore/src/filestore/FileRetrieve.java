/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestore;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Aiswarya
 */
public class FileRetrieve {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Example","root","");
            PreparedStatement ps=con.prepareStatement("select * from filetable");
            ResultSet rs=ps.executeQuery();
            rs.next();
            Blob c=rs.getBlob(2);
            InputStream r=c.getBinaryStream();
            FileWriter fw=new FileWriter("G:\\Java\\JDBC\\newstory.txt");
            int i;
            while((i=r.read())!=-1)
                fw.write((char)i);
            fw.close();
            con.close();
            System.out.println("Successful");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
