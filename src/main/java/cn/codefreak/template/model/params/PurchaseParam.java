package cn.codefreak.template.model.params;

import lombok.Data;

import java.io.Serializable;

@Data
public class PurchaseParam implements Serializable {
    private final static long serialVersionUID = 1L;
    private String username;
    private String isbn;
    private Integer num;
}
