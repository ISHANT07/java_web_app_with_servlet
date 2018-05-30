/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.*;
public class Logindao {
    
  public int checkUser(String username,String password)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","root");
            PreparedStatement ps=con.prepareStatement("select * from Login where username=?");
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
              return 1;
                
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
        
     return 0;
    }

    
}
