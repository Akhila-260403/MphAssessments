package com.mph.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mph.dao.UserDao;
import com.mph.model.User;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
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
		String email = request.getParameter("email");
		String password=  request.getParameter("password"); //get parameters from user 
		
		UserDao userDao = new UserDao();
		User user = userDao.getUserByEmail(email);
		
		if ((user !=null && user.getPassword().equals(password)) && "ADMIN".equals(user.getRole())) { //validate credentials
			HttpSession session = request.getSession();
			
			session.setAttribute("loggedAdmin", user);
			
			response.sendRedirect(request.getContextPath() + "/admin/dashboard");
		} else { //invalid login 
			response.sendRedirect("admin-login.jsp");
		}
	}

}
