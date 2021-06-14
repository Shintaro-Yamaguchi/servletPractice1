package sampleproject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodMorning extends HttpServlet {
private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
	String view = "/WEB-INF/view/goodmorning.jsp";
	request.setAttribute("morning", "GoodMorning");
//	int num = Integer.parseInt(request.getParameter("num"));
	String num = request.getParameter("num");
	String msg="";
	try {
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      msg = "ドライバのロードに成功しました";
	    }catch (ClassNotFoundException e){
	      msg = "ドライバのロードに失敗しました";
	    }catch (Exception e){
	      msg = "ドライバのロードに失敗しました";
	    }
	System.out.println(msg);
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","YamaShin5032");
		String sql = "select itemid, item_name, price from item";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("itemid"));
		}
		st.close();
		con.close();
	} catch (SQLException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
	}
//	request.setAttribute("number",num*10);
	request.setAttribute("number",num);
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);	
	dispatcher.forward(request, response);
  }
}