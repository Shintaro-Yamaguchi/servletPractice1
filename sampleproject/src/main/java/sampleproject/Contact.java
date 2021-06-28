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
  
//  public void doPost(HttpServletRequest request, HttpServletResponse response) 
//  throws ServletException, IOException 
//  {
//	request.setCharacterEncoding("UTF-8");
//	
//	String sql = "INSERT INTO contact(username,gender,message,file) values(?,?,?,?)";
//	String value = request.getParameter("username");
//	System.out.println(value);
//	
//	String value2 = request.getParameter("gender");
//	System.out.println(value2);
//	
//	String value3 = request.getParameter("message");
//	System.out.println(value3);
//	
//	String value4 = request.getParameter("file");
//	System.out.println(value4);
//	
//	List<Integer> idlist = new ArrayList<>();
//	List<String> usernamelist = new ArrayList<>();
//	List<Integer> genderlist = new ArrayList<>();
//	List<String> messagelist = new ArrayList<>();
////	List<Long> filelist = new ArrayList<>();
//	
//	String sql2 = "select * from contact";
//	
//	try {
//		// コネクション取得
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","YamaShin5032");
//		PreparedStatement st = con.prepareStatement(sql);		
//		st.setString(1,value);
//		st.setString(2,value2);
//		st.setString(3,value3);
//		st.setString(4,value4);
//		
//		// SQL文送信	
//		int num = st.executeUpdate();
//		// インサート文用
//		
//		ResultSet rs = st.executeQuery();
//		while (rs.next()) {
//			idlist.add(rs.getInt("id"));
//			usernamelist.add(rs.getString("username"));
//			genderlist.add(rs.getInt("gender"));
//			messagelist.add(rs.getString("message"));
////			filelist.add(rs.getLong("file"));
//			
//			request.setAttribute("id", idlist);
//			request.setAttribute("username", usernamelist);
//			request.setAttribute("gender", genderlist);
//			request.setAttribute("message", messagelist);
//			
//		}
//		
//		st.close();
//		con.close();
//		
//	} catch (Exception e) {
//		// 接続・SQL文エラー
//		e.printStackTrace();
//		
//	} // try
//	
//	
//	
//	doGet(request, response);
//  }
}
