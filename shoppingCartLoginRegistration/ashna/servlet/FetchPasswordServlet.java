package com.ashna.servlet;

import java.io.IOException;

import com.ashna.util.*;

import java.io.PrintWriter;

import com.ashna.servlet.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashna.util.*;
import com.ashna.sql.ConnectionFactory;


@WebServlet("/fetchpassword")
public class FetchPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FetchPasswordServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		String  userName = null, securityquestion = null,securityanswer = null;
		User u=new User(userName,securityquestion,securityanswer);
	
		userName = request.getParameter("username"); 
		securityquestion=request.getParameter("securityquestion");
		securityanswer=request.getParameter("securityanswer");
		
        Connection con=ConnectionFactory.getConnection();  
       
        PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(  
					"select securityquestion, securityanswer, password from userlist where name=? ");
			ps.setString(1,userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			String question=rs.getString(1);
			String answer=rs.getString(2);
			String password=rs.getString(3);
			
			if(securityquestion.equals(question) && securityanswer.equals(answer)){
				
				out.println(password);
				
			}
			else {out.println("The security question and security answer does not match!! ");
		}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  
		
		
		
		
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
	
}
