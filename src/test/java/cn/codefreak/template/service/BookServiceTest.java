package cn.codefreak.template.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-context-config.xml", "classpath:springMVC-config.xml"})
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void purchase() {
        bookService.purchase("codefreak", "0001", 2);
    }
}