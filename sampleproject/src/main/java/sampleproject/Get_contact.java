package sampleproject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Get_contact extends HttpServlet {
private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
	String view = "/WEB-INF/view/get_contact.jsp";
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);	
	System.out.println(view);
	dispatcher.forward(request, response);
	
	List<Integer> idlist = new ArrayList<>();
	List<String> usernamelist = new ArrayList<>();
	List<Integer> genderlist = new ArrayList<>();
	List<String> messagelist = new ArrayList<>();
	String sql = "select * from contact";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","YamaShin5032");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			idlist.add(rs.getInt("id"));
			usernamelist.add(rs.getString("username"));
			genderlist.add(rs.getInt("gender"));
			messagelist.add(rs.getString("message"));
	//		filelist.add(rs.getLong("file"));
			
			request.setAttribute("id", idlist);
			request.setAttribute("username", usernamelist);
			request.setAttribute("gender", genderlist);
			request.setAttribute("message", messagelist);
	//		request.setAttribute("file", filelist);
			
		}
	} catch (Exception e) {
		// 接続・SQL文エラー
		e.printStackTrace();
		
	}
	
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException 
  {
	request.setCharacterEncoding("UTF-8");
	
	String sql = "INSERT INTO contact(username,gender,message,file) values(?,?,?,?)";
	String value = request.getParameter("username");
	System.out.println(value);
	
	String value2 = request.getParameter("gender");
	System.out.println(value2);
	
	String value3 = request.getParameter("message");
	System.out.println(value3);
	
	String value4 = request.getParameter("file");
	System.out.println(value4);
	
	try {
		// コネクション取得
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","YamaShin5032");
		PreparedStatement st = con.prepareStatement(sql);		
		st.setString(1,value);
		st.setString(2,value2);
		st.setString(3,value3);
		st.setString(4,value4);
		
		// SQL文送信	
		int num = st.executeUpdate();
		// インサート文用
		
		st.close();
		con.close();
		
	} catch (Exception e) {
		// 接続・SQL文エラー
		e.printStackTrace();
		
	} // try
	
	System.out.println("text");
	doGet(request, response);
  }
}