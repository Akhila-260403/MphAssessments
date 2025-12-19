package com.mph.controller;
import com.mph.dao.QuestionDao;
import com.mph.model.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class AddQuestionServlet
 */
@WebServlet("/addQuestion")
public class AddQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddQuestionServlet() {
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
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("logedAdmin") == null) {
			response.sendRedirect("admin-login.jsp");
			return;
		}
		
		String questionText = request.getParameter("questionText"); // read form data
		String optionA = request.getParameter("optionA");
		String optionB = request.getParameter("optionB");
		String optionC = request.getParameter("optionC");
		String optionD = request.getParameter("optionD");
		String correctOption = request.getParameter("correctOption");
		
		Question  question = new Question(); //create question object and set the correct options
		question.setQuestionText(questionText);
		question.setOptionA(optionA);
		question.setOptionB(optionB);
		question.setOptionC(optionC);
		question.setOptionD(optionD);
		question.setCorrectOption(correctOption);
		
		QuestionDao questionDao = new QuestionDao();		//save in db
		boolean success = questionDao.addQuestion(question);
		
		if (success) {
			response.sendRedirect("admin/dashboard");
		} else {
			response.sendRedirect("admin/dashboard");
		}
		
	}

}
