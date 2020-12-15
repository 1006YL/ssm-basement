package com;

import javafx.scene.layout.Priority;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Student {
    private String name;
    @Autowired
    private Address address;
    private String[] bookName;
    private Map<String,String> bookMap;
    private List<String> bookList;
    private Set<String> bookSet;
    private Properties bookPriorities;
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBookName() {
        return bookName;
    }

    public void setBookName(String[] bookName) {
        this.bookName = bookName;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public Properties getBookPriorities() {
        return bookPriorities;
    }

    public void setBookPriorities(Properties bookPriorities) {
        this.bookPriorities = bookPriorities;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public Set<String> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<String> bookSet) {
        this.bookSet = bookSet;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", bookName=" + Arrays.toString(bookName) +
                ", bookMap=" + bookMap +
                ", bookList=" + bookList +
                '}';
    }
}
