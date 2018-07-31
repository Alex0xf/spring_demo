package com.javasm.book.model;

import java.util.List;

public class BookModel {
	private int bid;
	private String bookName;
	private double price;
	private AuthorModel author;//每本图书都对应一个作者
	//章节列表
	private List<String> chapters;
	//Set、Map、Properties
	private List<AuthorModel> authorList;

	public BookModel() {
		System.out.println("无参构造被调用");
	}
	
	public BookModel(int bid, String bookName, double price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookModel [bid=" + bid + ", bookName=" + bookName + ", price=" + price + ", author=" + author
				+ ", chapters=" + chapters + ", authorList=" + authorList + "]";
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public AuthorModel getAuthor() {
		return author;
	}

	public void setAuthor(AuthorModel author) {
		this.author = author;
	}

	public List<String> getChapters() {
		return chapters;
	}

	public void setChapters(List<String> chapters) {
		this.chapters = chapters;
	}

	public List<AuthorModel> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<AuthorModel> authorList) {
		this.authorList = authorList;
	}
	public void book_init(){
		System.out.println("图书类被初始化时调用");
	}
	
	public void book_destroy(){
		System.out.println("图书类被销毁时调用");
	}
	
	
}
