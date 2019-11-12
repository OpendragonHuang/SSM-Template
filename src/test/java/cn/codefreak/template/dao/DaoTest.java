package cn.codefreak.template.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-context-config.xml", "classpath:springMVC-config.xml"})
public class DaoTest {
    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookStockDAO bookStockDAO;

    @Autowired
    private AccountDAO accountDAO;

    @Test
    public void bookDaoTest(){
        int price = bookDAO.findBookPriceByIsbn("0001");
        System.out.println(price);

        System.out.println(bookStockDAO.getBookStock("0001"));
        bookStockDAO.reduceBookStock("0001", 5);
        System.out.println(bookStockDAO.getBookStock("0001"));

        System.out.println(accountDAO.getAccountBalance("codefreak"));
        accountDAO.reduceAccountBalance("codefreak", 20);
        System.out.println(accountDAO.getAccountBalance("codefreak"));
    }
}
