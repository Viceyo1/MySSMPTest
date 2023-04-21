package com.itheima.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;


/**
 * -------------------------服务层/位置：service-------------------------------------------
 */


public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}


/**
 * --------------------------------------------------------------------------------------------
 */

//public interface IBookService extends IService<Book> {
//
//    IPage<Book> getPage(int currentPage, int pageSize);
//
//    IPage<Book> getPage(int currentPage, int pageSize, Book book);
//}