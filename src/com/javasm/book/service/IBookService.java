package com.javasm.book.service;

import java.util.List;

import com.javasm.book.model.BookModel;

public interface IBookService {
	List<BookModel> findAll();
}
