package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Onlineauctiondatabase;

public class Online_auctionDao {
	public void registerPerson(Onlineauctiondatabase person) throws ClassNotFoundException, SQLException {
      
		String url="jdbc:mysql://localhost:3306/online_auction";
		String username="root";
		String password="tihcra**##1421";
		String str = "insert into persondetails values (?,?,?,?,?,?)";

		Class.forName("com.mysql.jdbc.Driver");
		
		try {		
			    Connection connection1 =DriverManager.getConnection(url,username,password);
			    
			    PreparedStatement preparedStatement1 =connection1.prepareStatement(str);
				preparedStatement1.setString(1, person.getItem_id());
				preparedStatement1.setString(2,person.getItem_name());
				preparedStatement1.setString(3,person.getName());
				preparedStatement1.setString(4,person.getEmail_address());
				preparedStatement1.setString(5,person.getAmount_bid());
				preparedStatement1.setString(6,person.getAuto_increment());
				
			
			   int result1 = preparedStatement1.executeUpdate();
			   System.out.println("rows: " + result1);
			   preparedStatement1.close();
			   connection1.close();
			   }catch(Exception ex) {
				   ex.printStackTrace();
		}
		

	}
}	
