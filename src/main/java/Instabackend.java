

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class Instabackend extends GenericServlet {
	
		String driver;
		public void init(ServletConfig sc) throws ServletException
		{
			ServletContext ctxt=sc.getServletContext();
			driver=ctxt.getInitParameter("driver");
		}
	
	
		public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			String f=request.getParameter("f");
			String l=request.getParameter("l");
			String user=request.getParameter("user");
			String pass=request.getParameter("pass");
			String rpass=request.getParameter("rpass");
			
			PrintWriter out=response.getWriter();
			
			if(pass.equals(rpass))
			{
				out.println("WELCOME TO INSTAGRAM");
				
				out.println("Driver class name:	"+driver);
			}
			else
			{
				out.println("Invalid");
			}
			
		}

		public void destroy()
		{
			
		}
}
