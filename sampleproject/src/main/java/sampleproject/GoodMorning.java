package sampleproject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	List<String> idlist = new ArrayList<>();
	List<String> itemlist = new ArrayList<>();
	List<Integer> pricelist = new ArrayList<>();
	String name = null;
	Connection con = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	String sql = "select * from item";
	
	try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb", "root", "YamaShin5032");
		st = con.prepareStatement(sql);
		rs = st.executeQuery();
		while (rs.next()) {
//			name = rs.getString("item_name");
			idlist.add(rs.getString("itemid"));
			itemlist.add(rs.getString("item_name"));
			pricelist.add(rs.getInt("price"));
//			request.setAttribute("item", itemlist);
//			System.out.println(itemname);
			request.setAttribute("id", idlist);
			request.setAttribute("item", itemlist);
			request.setAttribute("price", pricelist);
			
		}
//		st.close();
//		con.close();
	}  catch (SQLException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
	}  catch (ClassNotFoundException e) {
		// TODO 自動生成された catch ブロック
		System.out.println("ダメでした。");
	} 
	
//	request.setAttribute("number",num*10);
	request.setAttribute("number",num);
	RequestDispatcher dispatcher = request.getRequestDispatcher(view);	
	dispatcher.forward(request, response);
  }
}