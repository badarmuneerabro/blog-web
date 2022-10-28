package com.badar.muneer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 200, nullable = false)
	private String username;
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 10, nullable = false)
	private String gender;
	@Column(length = 1000)
	private String about;
	private Date date;
	
	private String profile;
	public User() {

	}

	public User(int id, String username, String email, String password, String gender, String about, String profile) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.about = about;
		this.profile = profile;
		this.date = new Date();
	}

	public User(String username, String email, String password, String gender, String about) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.about = about;
		this.date = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	public void setProfile(String profile)
	{
		this.profile = profile;
	}
	public String getProfile()
	{
		return profile;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
