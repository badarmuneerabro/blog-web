package com.badar.muneer.helper;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.badar.muneer.model.Category;
import com.badar.muneer.model.Post;

public class Connect 
{
	private static Connect connect;
	private static SessionFactory factory;
	private Connect()
	{
		
	}
	
	public static SessionFactory getFactory()
	{
		return (factory == null ? new Configuration().configure().buildSessionFactory() : factory);
	}
	
	public static List<Post> getAllPosts()
	{
		List<Post> posts = null;
		Session session = getFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Post");
		posts = (List<Post>) query.getResultList();
		session.getTransaction().commit();
		session.close();
		return posts;
	}
	
	public static List<Post> getAllPostsById(int id)
	{
		List<Post> posts = null;
		
		Session session = getFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Post where category_id=:id order by date asc");
		query.setParameter("id", id);
		posts = (List<Post>) query.getResultList();
		session.getTransaction().commit();
		session.close();
		return posts;
	}
	
	public static List<Category> getAllCategories()
	{
		Session session = getFactory().openSession();
		session.beginTransaction();
		
		List<Category> categories = (List<Category>) session.createQuery("from Category").list();
		
		session.getTransaction().commit();
		session.close();
		
		return categories;
	}
	
}
