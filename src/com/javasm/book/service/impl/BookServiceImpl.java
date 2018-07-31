package com.javasm.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasm.book.dao.IBookDAO;
import com.javasm.book.model.BookModel;
import com.javasm.book.service.IBookService;

@Service//把当前的类注入到Spring容器中
public class BookServiceImpl implements IBookService{
	//以IBookDAO去spring中寻找对应类型的bean
	@Autowired
	IBookDAO bookDao;//=new BookDAOImpl();
	
	@Override
	public List<BookModel> findAll() {
		
		return bookDao.findAll();
	}

}
