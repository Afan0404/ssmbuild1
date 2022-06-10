package com.chen.controller;

import com.chen.pojo.Books;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.getBooks();
        model.addAttribute("list", list);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books book){
        System.out.println("添加书籍："+book);
        bookService.addBook(book);
        return "addBook";
    }
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books ibook = bookService.getBookById(id);
        model.addAttribute("Ibook",ibook);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books book,Model model){
        System.out.println("修改书籍："+book);
        bookService.updateBook(book);
        Books ibook = bookService.getBookById(book.getBookID());
        model.addAttribute("book", book);
        return "redirect:/book/allBook";
        /*return "allBook";*/
    }
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/getBookByName")
    public String getBookByName(String bookName,Model model){
        List<Books> books = bookService.getBookByName(bookName);
        if (books.size()==0){
            books=bookService.getBooks();
            model.addAttribute("error","查无此书");
        }
        model.addAttribute("list",books);
        return "allBook";
    }

}
