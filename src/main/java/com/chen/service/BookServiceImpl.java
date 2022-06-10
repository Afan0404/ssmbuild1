package com.chen.service;

import com.chen.dao.BookMapper;
import com.chen.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Books> getBooks() {
        return bookMapper.getBooks();
    }
    public Books getBookById(int id) {
        return bookMapper.getBookById(id);
    }
    public List<Books> getBookByName(String bookName){
        return bookMapper.getBookByName(bookName);
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

}
