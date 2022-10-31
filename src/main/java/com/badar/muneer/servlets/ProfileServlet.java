package com.badar.muneer.servlets;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.hibernate.Session;

import com.badar.muneer.helper.Connect;
import com.badar.muneer.model.User;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profile")

@MultipartConfig()
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Getting update parameters
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String about = request.getParameter("about");
		Part filePart = request.getPart("image");
		String profile = filePart.getSubmittedFileName();
		
		// Update user fields.
		User user = (User) request.getSession().getAttribute("user");
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setAbout(about);
		//user.setProfile(profile);
		
		// Create Hibernate session
		Session session = Connect.getFactory().openSession();
		session.beginTransaction();
		
		session.update(user); // update the user
		
		session.getTransaction().commit(); // commit changes.
		
		//saveFile(filePart);
		
		System.out.println("Details updated...");
		
		response.sendRedirect("blog");
	}
	
	private void saveFile(Part filePart) throws IOException
	{
		InputStream inputStream = filePart.getInputStream();
		OutputStream output = new FileOutputStream(new File("/blog-web/src/main/webapp/images/" + filePart.getSubmittedFileName()));
        final byte[] bytes = new byte[inputStream.available()];
        
        output.write(bytes);
	}
}
