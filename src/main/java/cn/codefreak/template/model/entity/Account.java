package cn.codefreak.template.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    private final static long serialVersionUID = 1L;
    private String username;
    private String balance;
}
