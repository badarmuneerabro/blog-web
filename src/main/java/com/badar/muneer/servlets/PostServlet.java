package com.badar.muneer.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.badar.muneer.helper.Connect;
import com.badar.muneer.model.Category;
import com.badar.muneer.model.Post;
import com.badar.muneer.model.User;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter("action");
		
		System.out.println("action=" + action);
		switch(action)
		{
		case "categoryId":
			displayBlogCategory(request, response);
			break;
		case "read":
			forwardToBlogPage(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User user = (User) request.getSession().getAttribute("user");
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String code = request.getParameter("code");
		
		Post post = new Post();
		post.setTitle(title);
		post.setContent(content);
		post.setCode(code);
		post.setUser(user);
		Session session = Connect.getFactory().openSession();
		session.beginTransaction();
		
		Category category = session.get(Category.class, categoryId);
		post.setCategory(category);
		
		session.save(post);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Post saved...");
		
	}
	
	public void displayBlogCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int id = Integer.parseInt(request.getParameter("categoryId"));
		if(id == 0)
		{
			response.sendRedirect("blog");
			return;
		}
		request.setAttribute("posts", Connect.getAllPostsById(id));
		request.setAttribute("categories", Connect.getAllCategories());
		request.getRequestDispatcher("/WEB-INF/jsp/view/user/profile.jsp").forward(request, response);
	}
	
	public void forwardToBlogPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int id = Integer.parseInt(request.getParameter("categoryId"));
		Session session = Connect.getFactory().openSession();
		session.beginTransaction();
		
		Post post = session.get(Post.class, id);
		
		session.getTransaction().commit();
		session.close();
		request.setAttribute("post", post);
		request.getRequestDispatcher("/WEB-INF/jsp/view/user/blog-page.jsp").forward(request, response);
	}

}
