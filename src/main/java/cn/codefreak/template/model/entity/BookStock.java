package cn.codefreak.template.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookStock implements Serializable {
    private final static long serialVersionUID = 1L;
    private Integer id;
    private String isbn;
    private Integer stock;
}
