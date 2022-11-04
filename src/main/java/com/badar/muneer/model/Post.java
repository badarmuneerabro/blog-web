package com.badar.muneer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Post 
{
	@Id
	@GeneratedValue
	@Column(name = "POST_ID")
	private int id;
	@OneToOne
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	@Column(name = "TITLE", length = 100)
	private String title;
	@Column(name = "CONTENT", columnDefinition = "text")
	private String content;
	@Column(name = "CODE", columnDefinition = "text")
	private String code;
	@Column(name = "DATE")
	private Date date;
	
	public Post()
	{
		date = new Date();
	}
	public Post(int id, Category category, String title, String content, String code) {
		super();
		this.id = id;
		this.category = category;
		this.title = title;
		this.content = content;
		this.code = code;
		this.date = new Date();
	}
	public Post(Category category, String title, String content, String code, String pic) {
		super();
		this.category = category;
		this.title = title;
		this.content = content;
		this.code = code;
		this.date = new Date();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
