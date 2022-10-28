package com.badar.muneer.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
	
}
