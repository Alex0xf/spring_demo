package com.javasm.book.factory;

import com.javasm.book.model.BookModel;

/**
 * 
 * ClassName: BookModelFactory 
 * @Description: 图书模型的工厂类
 * @author Alex
 * @date 2018年7月30日
 */
public class BookModelFactory {
	
	//工厂类的静态方法 负责制造对象
	public static BookModel creatStaticBookModel(){
		System.out.println("图书静态工厂方法被调用 创建了一个BookModel对象");
		return new BookModel();
	}
	
	public BookModel creatBookModel(){
		System.out.println("图书工厂方法被调用 创建了一个图书对象");
		return new BookModel();
	}
}
