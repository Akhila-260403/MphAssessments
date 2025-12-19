package com.mph.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mph.dao.UserDao;
import com.mph.model.User;
//for registering user.
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"); //gettinh parameters from user
		String password=request.getParameter("password");
		String name= request.getParameter("name");
		
		User user = new User(); //setting parameter by creating a new user object
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setRole("USER");
		
		UserDao userDao = new UserDao();			
		boolean success = userDao.registerUser(user);
		
		if(success) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("register.jsp");
		}
	}
}
