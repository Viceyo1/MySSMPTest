package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * -------------------------数据层/位置：dao/BookDao-------------------------------------------
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {
}


/**
 * -----------------------------------------------------------------------------------
 */
//@Mapper
//public interface BookDao extends BaseMapper<Book> {
//}