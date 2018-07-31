package com.javasm.book.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javasm.book.dao.IBookDAO;
import com.javasm.book.model.BookModel;
/**
 * 
 * ClassName: BookDAOImpl 
 * @Description: 实现类
 * @author Alex
 * @date 2018年7月30日
 */
//把当前的类注入到Spring中
//spring运行时扫描，扫描时发现这个注解会自动new一个单例类
@Repository
public class BookDAOImpl implements IBookDAO{

	@Override
	public List<BookModel> findAll() {
		System.out.println("IBookDAO的findAll方法被调用");
		return null;
	}
	
}
