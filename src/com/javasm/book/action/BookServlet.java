package com.javasm.book.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.javasm.book.service.IBookService;

public class BookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Autowired
	IBookService bookService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		bookService.findAll();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
