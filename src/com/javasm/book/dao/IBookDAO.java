package com.javasm.book.dao;

import java.util.List;

import com.javasm.book.model.BookModel;

public interface IBookDAO {
	List<BookModel> findAll();
}
