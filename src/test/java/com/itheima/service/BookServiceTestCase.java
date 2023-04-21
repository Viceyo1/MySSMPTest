package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//MP提供的服务层方法的调用
@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(3));//查询单条数据
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        //修改一条数据
        Book book = new Book();
        book.setId(20);
        book.setType("测试数据1234567890-");
        book.setName("测试数据123rrrrrr");
        book.setDescription("测试数据123");
        bookService.updateById(book);
    }

    @Test
    void testDelete(){
        //删除一条数据
        bookService.removeById(17);
    }

    @Test
    void testGetPage(){
        //分页查询
        IPage<Book> page = new Page<>(2,5);
        bookService.page(page);
        System.out.println(page.getTotal());
    }

}
