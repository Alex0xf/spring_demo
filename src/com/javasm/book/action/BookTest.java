package com.javasm.book.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javasm.book.model.BookModel;
import com.javasm.book.service.IBookService;

public class BookTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		IBookService bookService=context.getBean(IBookService.class);//=new BookServiceImpl();
		bookService.findAll();
	}

	public static void test01() {
		// 存入BookModel对象 存入值 输出
		// BookModel book = new BookMo del();

		// 从spring中拿值 没有new而是spring new了 还是单例
		// BookModel book = context.getBean(BookModel.class);
		// 静态
		// BookModel book = (BookModel)
		// context.getBean("bookmodel_static_factory");
		// 非静态
		// BookModel book = (BookModel)
		// context.getBean("bookmodel_factory_method");
		BookModel book = (BookModel) context.getBean("bookmodel_setter");
		/*
		 * book.setBid(12); book.setBookName("java编程思想"); book.setPrice(120.5);
		 */
		System.out.println(book);

	}
}
