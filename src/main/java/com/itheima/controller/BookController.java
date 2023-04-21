package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public Result getAll(){
        return new Result(true,bookService.list());
    }

    /**
     * -------------------------添加功能/位置：controller/BookController类中的方法-------------------------------------------
     */

    @PostMapping
    public Result save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new Result(flag, flag ? "添加成功" : "添加失败");
    }

    /**
     * -----------------------------------------------------------------------------------------------
     */


//    @PostMapping
//    public Result save(@RequestBody Book book){
//        boolean flag = bookService.save(book);
//        return new Result(flag, flag ? "添加成功" : "添加失败");
//    }

    /**
     * -------------------------添加功能/位置：controller/BookController类中的方法-------------------------------------------
     */


    /**
     * -------------------------修改编辑功能/位置：controller/BookController类中的方法-------------------------------------------
     */

    @PutMapping
    public Result update(@RequestBody Book book){

        return new Result(bookService.updateById(book));
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        return new Result(true, bookService.getById(id));
    }
    /**
     * -----------------------------------------------------------------------------------------------
     */
//    @PutMapping
//    public Result update(@RequestBody Book book){
//
//        return new Result(bookService.updateById(book));
//    }



//    @GetMapping("{id}")
//    public Result getById(@PathVariable Integer id){
//        return new Result(true, bookService.getById(id));
//    }


    /**
     * -------------------------修改编辑功能/位置：controller/BookController类中的方法-------------------------------------------
     */


    /**
     * -------------------------删除功能/位置：controller/BookController类中的方法-------------------------------------------
     */

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(bookService.removeById(id));
    }



    /**
     * -----------------------------------------------------------------------------------------------
     */
//    @DeleteMapping("{id}")
//    public Result delete(@PathVariable Integer id){
//        return new Result(bookService.removeById(id));
//    }


    /**
     * -------------------------删除功能/位置：controller/BookController类中的方法-------------------------------------------
     */












    /**
     * -------------------------条件分页功能/位置：controller/BookController类中的方法-------------------------------------------
     */

//    @Autowired
//    private IBookService bookService;


//    @GetMapping("{currentPage}/{pageSize}")
//    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page = bookService.getPage(currentPage,pageSize);
//        if (currentPage > page.getPages()){
//            page = bookService.getPage((int)page.getPages(),pageSize);
//        }
//
//        return new Result(true,page);
//    }

        @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize, Book book){

        IPage<Book> page = bookService.getPage(currentPage,pageSize,book);
        if (currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(),pageSize,book);
        }

        return new Result(true,page);
    }

    /**
     * -----------------------------------------------------------------------------------------------
     */

//    @GetMapping("{currentPage}/{pageSize}")
//    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize, Book book){
//
//        IPage<Book> page = bookService.getPage(currentPage,pageSize,book);
//        if (currentPage > page.getPages()){
//            page = bookService.getPage((int)page.getPages(),pageSize,book);
//        }
//
//        return new Result(true,page);
//    }

    /**
     * -------------------------条件分页功能/位置：controller/BookController类中的方法-------------------------------------------
     */


}
