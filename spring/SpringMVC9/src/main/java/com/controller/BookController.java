package com.controller;

import com.pojo.Book;
import com.servlet.BookServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServletImpl")
    private BookServlet bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Book book) {
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Book book = bookService.queryBookById(id);
        System.out.println(book);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Book book) {
        System.out.println(book);
        bookService.updateBook(book);
        Book books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/query")
    public String queryBookByName(Model model, String name, WebRequest request) {
        List<Book> list1 = bookService.queryBookByName(name);
        if (list1 == null) {
            List<Book> list2 = bookService.queryAllBook();
            model.addAttribute("err", "未查到");
            model.addAttribute("list", list2);
        } else {
            request.removeAttribute("err", WebRequest.SCOPE_SESSION);
            model.addAttribute("list", list1);
        }
        return "allBook";
    }
}