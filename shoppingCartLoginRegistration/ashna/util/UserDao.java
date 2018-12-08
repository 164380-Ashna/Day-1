package com.ashna.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.ashna.sql.ConnectionFactory;
import com.ashna.util.User;

public class UserDao {
	
	 
	public static void save(User u){  
	    int status=0;  
	    try{  
	    	
	        Connection con=ConnectionFactory.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into UserList(name,password,confirmpassword,email,sex,country,securityquestion,securityanswer) values(?,?,?,?,?,?,?,?)");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getPassword());    
	        ps.setString(3,u.getConfirmpassword());
	        ps.setString(4,u.getEmail());  
	        ps.setString(5,u.getSex());  
	        ps.setString(6,u.getCountry()); 
	        ps.setString(7,u.getSecurityquestion()); 
	        ps.setString(8,u.getSecurityanswer()); 
	       
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    //return status;  
	}  
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static List<User> getAllRecords(){  
	    List<User> list=new ArrayList<User>();  
	    User u=new User();
	      
	    try{  
	        Connection con=ConnectionFactory.getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from userlist");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	              
	           
	            u.setName(rs.getString("username"));  
	            u.setPassword(rs.getString("password")); 
	            u.setName(rs.getString("email"));  
	            u.setName(rs.getString("sex"));  
	            u.setName(rs.getString("country")); 
	            u.setName(rs.getString("securityquestion")); 
	            u.setName(rs.getString("securityanswer")); 
	          
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	
	*/

	/*public String Login(String userName, String password) {

		Connection connection = ConnectionFactory.getConnection();
		
		
		
		
		
		try {

			PreparedStatement statement = connection
					.prepareStatement("select * from LoginUser where userName=? and password=?");

			statement.setString(1, userName);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				if (set.getString("userName").equals(userName)
						&& set.getString("password").equals(password)) {
					return set.getString("userType");
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
*/
}
