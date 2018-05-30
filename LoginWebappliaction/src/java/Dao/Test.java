/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test  {
    
  public void checkUser(String username,String password)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","root");
    for(int i=0;i<100000;i++)
    {
        PreparedStatement ps=con.prepareStatement("insert into Login values(?,?)");
ps.setString(1,"yhdsgfdh");
ps.setString(2, "password");
ps.executeUpdate();
    }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.checkUser("username", "password");
    }
    
}
