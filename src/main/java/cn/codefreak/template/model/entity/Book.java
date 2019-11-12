package cn.codefreak.template.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private final static long serialVersionUID = 1L;
    private String isbn;
    private String bookName;
    private String price;
}
