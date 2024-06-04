package com.bean;

public class BookBean {

	private String title;
	private String category; 
	
	private AuthorBean author;

	public BookBean(AuthorBean author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public AuthorBean getAuthor() {
		return author;
	}

	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	
	
	
}



//BookBean -> dep -> AuthorBean 

//Author -> dep -> BookBean 


//Servlet --> dbConnection 