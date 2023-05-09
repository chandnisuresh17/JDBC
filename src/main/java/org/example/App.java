package org.example;


import javax.xml.transform.Result;
import java.sql.*;

/**
 * Hello world!
 *
 */


import java.sql.*;
public class App
{
    public static void main( String[] args ) throws Exception{
        String url = "jdbc:mysql://localhost:3306/store";
        String uname = "root";
        String pass = " pass@word1";
        String query = " select username from student where userid=3";



        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement s = con.createStatement();
        Result rs = (Result) s.executeQuery(query);

//        rs.next();
        String name = rs.getString("username");
        System.out.println(uname);
        s.close();
        con.close();
    }
}
