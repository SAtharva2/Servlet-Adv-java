

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
        Cookie cArr[]=request.getCookies();
		
		String sessionId=cArr[0].getValue();  //12345
		String userName=cArr[1].getValue();  //atharva
		
		
		Cookie c2=new Cookie("name",userName);
		
		response.addCookie(c2);
		
		   response.setContentType("text/html");
		     
		PrintWriter out=response.getWriter();
		
          
          out.println(" session id=" + sessionId);
  		
		out.println(userName+" Welcome to second servlet" );
		
		out.println("<html>");
		out.println("<body bgcolor='aqua'>");
		out.println("<br><br><br>");
		out.println("<i>****Hello" +userName + "****</i><br><br>");
		out.println("Welcome to Our Application");
		
		out.println("<a href='./LogOut'>Logout</a>");
		
		
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
