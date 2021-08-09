package sampleproject;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet {
private static final long serialVersionUID = 1L;

  String value1;
  String value2 = null;
  String value3;
  String value4 = null;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
	String view = "/WEB-INF/view/delete.jsp";
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);
//	String sql = "select * from contact";
	
//	List<String> idlist = new ArrayList<>();
//	List<String> usernamelist = new ArrayList<>();
//	List<String> genderlist = new ArrayList<>();
//	List<String> messagelist = new ArrayList<>();
	
//	idlist.add(value1);
//	usernamelist.add(value2);
//	genderlist.add(value3);
//	messagelist.add(value4);
	
//	System.out.println(idlist);
//	System.out.println(usernamelist);
//	System.out.println(genderlist);
//	System.out.println(messagelist);
	
	request.setAttribute("id", value1);
	request.setAttribute("username", value2);
	request.setAttribute("gender", value3);
	request.setAttribute("message", value4);
	
	dispatcher.forward(request, response);
	
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException 
  {
	request.setCharacterEncoding("UTF-8");
	
	value1 = request.getParameter("id");
	value2 = request.getParameter("username");
	value3 = request.getParameter("gender");
	value4 = request.getParameter("message");
	
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	
//	System.out.println("データ更新");
	
	doGet(request, response);
  }
  
}