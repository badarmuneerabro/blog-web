package com.badar.muneer.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/blog")
public class BlogWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter("action");
		if(action == null)
			action = "home";
		
		switch(action)
		{
		case "home":
			forwardToHomePage(request, response);
			break;
		case "login":
			forwardToLoginPage(request, response);
		case "register":
			forwardToRegistrationPage(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	
	public void forwardToHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/home.jsp").forward(request, response);
	}
	public void forwardToLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp").forward(request, response);
	}
	
	public void forwardToRegistrationPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/sign-up.jsp").forward(request, response);
	}

}
