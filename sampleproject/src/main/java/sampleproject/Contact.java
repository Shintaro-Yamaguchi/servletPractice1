package sampleproject;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contact extends HttpServlet {
private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
	
	String view = "/WEB-INF/view/contact.jsp";
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);	
	dispatcher.forward(request, response);
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException 
  {
	request.setCharacterEncoding("UTF-8");
	String value = request.getParameter("username");
	System.out.println(value);
	
	String value2 = request.getParameter("gender");
	System.out.println(value2);
	
	String value3 = request.getParameter("message");
	System.out.println(value3);
	
	String value4 = request.getParameter("file");
	System.out.println(value4);
	
	doGet(request, response);
  }
}
