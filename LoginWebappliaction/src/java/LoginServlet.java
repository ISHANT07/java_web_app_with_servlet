

import Dao.Logindao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
       
    String username=    request.getParameter("Username");
      String password=   request.getParameter("Password");
        
      Logindao d=new Logindao();
    int result=  d.checkUser(username,password);
    if(result==1)
            {
            out.println("login succesfull");
                    
            }
            else
            {
                    out.println("wrong username password");
                    }
        
    }

   
}
