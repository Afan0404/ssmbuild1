package com.chen.dao;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //查询所有书籍信息
    List<Books> getBooks();
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookID") int id);
    //修改
    int updateBook(Books books);
    //id查询
    Books getBookById(@Param("bookID") int id);
    //name查询
    List<Books> getBookByName(@Param("bookName") String bookName);
}
