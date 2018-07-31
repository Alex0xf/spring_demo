package com.javasm.book.model;
/**
 * 
 * ClassName: AuthorModel 
 * @Description: 作者类
 * @author Alex
 * @date 2018年7月30日
 */
public class AuthorModel {
	private String authorName;
	private String address;
	
	
	@Override
	public String toString() {
		return "AuthorModel [authorName=" + authorName + ", address=" + address + "]";
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
