

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		Cookie cArr[]=request.getCookies();
		
		String userName=cArr[1].getValue();  //atharva

		   response.setContentType("text/html");
		     
	  
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body bgcolor='aqua'>");
	
	out.println(userName+" logout successfullyt");
	
	out.println("</body>");
	out.println("</html>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
