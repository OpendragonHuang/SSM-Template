package cn.codefreak.template.exception;

import java.io.Serializable;

public class PurchaseException extends RuntimeException implements Serializable {
    private final static long serialVersionUID = 1L;

    public PurchaseException(String message) {
        super(message);
    }
}
