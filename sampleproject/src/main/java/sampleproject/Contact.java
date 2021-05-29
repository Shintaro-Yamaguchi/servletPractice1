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
}
