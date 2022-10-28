package com.badar.muneer.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.badar.muneer.helper.Connect;
import com.badar.muneer.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(request.getParameter("logout") != null)
    	{
    		request.getSession().invalidate();
    		response.sendRedirect("blog");
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Session session = Connect.getFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from User where email=:email AND password=:pass");
		query.setParameter("email", email);
		query.setParameter("pass", password);
		List<User> userList = (List<User>) query.getResultList();
		session.getTransaction().commit();
		session.close();
		System.out.println(userList);
		if(userList.size() > 0)
		{
			User user = userList.get(0);
			HttpSession hSession = request.getSession();
			hSession.setAttribute("user", user);
			System.out.println(user);
			request.changeSessionId();
			response.sendRedirect("blog");
			return;
		}
		else {
			request.setAttribute("loginFailed", true); // yes login has failed.
			request.getRequestDispatcher("/WEB-INF/jsp/view/commons/login.jsp").forward(request, response);
		}
		
	}

}
