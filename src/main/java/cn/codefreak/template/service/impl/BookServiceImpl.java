package cn.codefreak.template.service.impl;

import cn.codefreak.template.dao.AccountDAO;
import cn.codefreak.template.dao.BookDAO;
import cn.codefreak.template.dao.BookStockDAO;
import cn.codefreak.template.exception.PurchaseException;
import cn.codefreak.template.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
public class BookServiceImpl implements BookService, Serializable {
    private final static long serialVersionUID = 1L;

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookStockDAO bookStockDAO;

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    @Override
    public void purchase(String username, String isbn, Integer num) {
        int stock = bookStockDAO.getBookStock(isbn);
        if(stock <= 0 || stock - num < 0){
            throw new PurchaseException("库存不够");
        }
        bookStockDAO.reduceBookStock(isbn, num);

        int bookPrice = bookDAO.findBookPriceByIsbn(isbn);
        int accountBalance = accountDAO.getAccountBalance(username);
        if(accountBalance <= 0 || accountBalance - bookPrice*num < 0){
            throw new PurchaseException("用户余额不够");
        }
        accountDAO.reduceAccountBalance(username, bookPrice*num);
    }
}
