package cn.codefreak.template.dao;

import org.apache.ibatis.annotations.Param;

public interface BookStockDAO{
    void reduceBookStock(@Param("isbn")String isbn, @Param("stock") Integer stock);
    int getBookStock(String isbn);
}
