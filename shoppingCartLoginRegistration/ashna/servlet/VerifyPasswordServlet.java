package com.ashna.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashna.sql.ConnectionFactory;
import com.ashna.util.User;

@WebServlet("/verifypassword")
public class VerifyPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VerifyPasswordServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		Connection connection = ConnectionFactory.getConnection();

		try {
			PreparedStatement ps = connection
					.prepareStatement("select name,password from userlist where name=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String Password = rs.getString(2);
				if (name.equals(userName) && Password.equals(password)) {
					out.println("You are logged in");
				} else {
					out.println("You are not logged in");
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
