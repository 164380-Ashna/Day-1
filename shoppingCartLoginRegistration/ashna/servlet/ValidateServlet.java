package com.ashna.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashna.sql.ConnectionFactory;
import com.ashna.util.User;
import com.ashna.util.UserDao;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidateServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String userName, password, confirmpassword, email, sex, country, securityquestion, securityanswer;
		int id;

		userName = request.getParameter("username");
		password = request.getParameter("password");
		confirmpassword = request.getParameter("confirmpassword");
		email = request.getParameter("email");
		sex = request.getParameter("sex");
		country = request.getParameter("country");
		securityquestion = request.getParameter("securityquestion");
		securityanswer = request.getParameter("securityanswer");

		// Password verification
		if (password.equals(confirmpassword)) {
			UserDao.save(new User(userName, password, confirmpassword, email,
					sex, country, securityquestion, securityanswer));
		} else {
			out.println("The password and confirm password does not match!! ");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	public static void ValidateCredentials(String userName, String password) {

	}

}
