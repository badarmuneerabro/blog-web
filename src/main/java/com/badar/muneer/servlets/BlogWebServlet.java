package com.badar.muneer.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.badar.muneer.helper.Connect;
import com.badar.muneer.model.Category;
import com.badar.muneer.model.User;

@WebServlet("/blog")
public class BlogWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		boolean isForwarded = false;
		if(request.getSession().getAttribute("user") != null)
		{
			forwardToProfilePage(request, response);
			isForwarded = true;
			return;
		}
		
		System.out.println(isForwarded);
		String action = request.getParameter("action");
		if (action == null)
			action = "home";
		switch (action) {
		case "home":
			forwardToHomePage(request, response);
			break;
		case "login":
			forwardToLoginPage(request, response);
			break;
		case "register":
			forwardToRegistrationPage(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String check = request.getParameter("check");
		// If the user agreed to terms and conditions
		if (check != null) 
		{
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String gender = request.getParameter("gender");
			String about = request.getParameter("about");
			
			User user = new User(username, email, password, gender, about);
			
			Session session = Connect.getFactory().openSession();
			
			session.beginTransaction();
			
			session.save(user);
			session.getTransaction().commit();
			session.close();
			
			response.sendRedirect("blog?action=login");
			return;
		}
		
		else
		{
			request.setAttribute("boxChecked", false);
			request.getRequestDispatcher("/WEB-INF/jsp/view/commons/sign-up.jsp").forward(request, response);
		}
	}

	public void forwardToHomePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/view/commons/home.jsp").forward(request, response);
	}

	public void forwardToLoginPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("loginFailed", false); // no login has not failed.
		request.getRequestDispatcher("/WEB-INF/jsp/view/commons/login.jsp").forward(request, response);
	}

	public void forwardToRegistrationPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("boxChecked", true); // yes box is checked, just ignore this
		request.getRequestDispatcher("/WEB-INF/jsp/view/commons/sign-up.jsp").forward(request, response);
	}
	
	private void forwardToProfilePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Session session = Connect.getFactory().openSession();
		session.beginTransaction();
		
		List<Category> categories = (List<Category>) session.createQuery("from Category").list();
		
		session.getTransaction().commit();
		session.close();
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("/WEB-INF/jsp/view/user/profile.jsp").forward(request, response);
	}

}
