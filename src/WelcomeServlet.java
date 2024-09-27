

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet
{
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		
	String nm=request.getParameter("t1"); 
	
	Cookie c1=new Cookie("sid","144654188");
	Cookie c2=new Cookie("name",nm);
	
	  response.addCookie(c1);
	  response.addCookie(c2);
	
	 PrintWriter out=response.getWriter();
	 
	 out.println("<html><body bgcolor=aqua>");
	 out.println("<h1>Welcome"+ nm + " to out Web Site</h1>");
	 out.print("<a href='./ProductServlet'>View Product</a>");
	 out.println("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
