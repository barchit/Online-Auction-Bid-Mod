package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Online_auctionDao;
import model.Onlineauctiondatabase;



public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       Online_auctionDao online_auctionDao= new Online_auctionDao();
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item_id=request.getParameter("item_id");
		String item_name=request.getParameter("item_name");
		String name=request.getParameter("name");
		String email_address=request.getParameter("em");
		String amount_bid=request.getParameter("amount_bid");
		String auto_increment=request.getParameter("auto_increment");
		
		Onlineauctiondatabase person=new Onlineauctiondatabase();
		 person.setItem_id( item_id);
		 person.setItem_name(item_name);
		 person.setName(name);
		 person.setEmail_address(email_address);
		 person.setAmount_bid(amount_bid);
		 person.setAuto_increment( auto_increment);
		 
		 if(auto_increment.equals("on"))
			 auto_increment="true";
		 else
			 auto_increment="false";
		 
		 request.setAttribute("item_i", item_id);
		 request.setAttribute("item_n", item_name);
		 request.setAttribute("n", name);
		 request.setAttribute("email",email_address);
	         request.setAttribute("amt", amount_bid);
		 request.setAttribute("auto",auto_increment);
		 
		 RequestDispatcher rd= request.getRequestDispatcher("detail.jsp");
		 rd.forward(request, response);
		 try {
		online_auctionDao.registerPerson(person);
	} catch (Exception e) {
		
			e.printStackTrace();
	}
		 
	
	
			
	}

}
