package com.ssh.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssh.entity.BooksEntity;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class BookDaoImplTest {

    @Autowired
    BookDaoImpl bookDaoImpl;

    @Test
    public void getBookNames() {
        List<String> list = bookDaoImpl.getBookNames();
        for (String name : list) {
            System.out.println(name);
        }

    }

    @Test
    public void getBookNameAndAuthor() {
        List<Object[]> list =bookDaoImpl.getBookNameAndAuthor();
        for (Object[] object :list){
            System.out.println(object[0]+":"+object[1]);
        }
    }

    @Test
    public void getBookList() {
        List<BooksEntity> list=bookDaoImpl.getBookList();
        for (BooksEntity booksEntity :list){
            System.out.println(booksEntity);
        }
    }



    @Test
    public void getBookListById() {
        List<BooksEntity> list=bookDaoImpl.getBookListById();
        for (BooksEntity booksEntity :list){
            System.out.println(booksEntity);
        }
    }

    @Test
    public void getBooksByPage() {
        List<BooksEntity> list=bookDaoImpl.getBooksByPage();
        for (BooksEntity booksEntity :list){
            System.out.println(booksEntity);
        }
    }

    @Test
    public void getBookCount() {
        Number number=bookDaoImpl.getBookCount();
        System.out.println(number);
    }

    @Test
    public void getBookCountperCategoryList() {
        List<Object[]> list=bookDaoImpl.getBookCountperCategoryList();
        for (Object[] object : list){
            System.out.println(object[0]+"--"+object[1]);
        }
    }

    @Test
    public void getBookListByCategoryName() {
        List<BooksEntity> list =bookDaoImpl.getBookListByCategoryName();
        for (BooksEntity booksEntity : list) {
            System.out.println(booksEntity);
        }
    }

    @Test
    public void getBookCategory() {
        List<Object[]> list =bookDaoImpl.getBookCategory();
        for (Object[] object:list){
            System.out.println(object[0]+"--"+object[1]);
        }
    }
}