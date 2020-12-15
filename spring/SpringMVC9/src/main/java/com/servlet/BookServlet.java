package com.servlet;

import com.pojo.Book;

import java.util.List;

public interface BookServlet {
    int addBook(Book book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Book books);
    //根据id查询,返回一个Book
    Book queryBookById(int id);
    //查询全部Book,返回list集合
    List<Book> queryAllBook();
    //查询特定Book,返回list集合
    List<Book> queryBookByName(String name);
}
