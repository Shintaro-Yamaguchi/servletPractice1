package sampleproject;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
	String view = "/WEB-INF/view/index.jsp";
	request.setAttribute("hello", "HelloWorld");
	request.setAttribute("hello2", "Hello2");
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);	
	dispatcher.forward(request, response);
//    response.setContentType("text/html; charset=UTF-8");
//    PrintWriter out = response.getWriter();
//    out.println("<html>");
//    out.println("<head>");
//    out.println("<title>Hello World!</title>");
//    out.println("</head>");
//    out.println("<body>");
//    out.println("<h1>Hello World!</h1>");
//    out.println("<a href=http://localhost:8080/sampleproject/servlet/morning>リンク</a>");
//    out.println("</body>");
//    out.println("</html>");
  }
}