package com.ssh.dao;

import ssh.entity.BooksEntity;

import java.util.List;

public interface BookDao {
    public List<String> getBookNames();

    public List<Object[]> getBookNameAndAuthor();

    public List<BooksEntity> getBookList();

    public List<BooksEntity> getBookListById();

    public List<BooksEntity> getBooksByPage();

    public Number getBookCount();

    public List<Object[]> getBookCountperCategoryList();

    public List<BooksEntity> getBookListByCategoryName();

    public  List<Object[]> getBookCategory();
}
