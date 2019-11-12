package cn.codefreak.template.controller;

import cn.codefreak.template.exception.PurchaseException;
import cn.codefreak.template.model.dto.JsonResponse;
import cn.codefreak.template.model.params.PurchaseParam;
import cn.codefreak.template.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@Controller
public class PortalController implements Serializable {
    private final static long serialVersionUID = 1L;

    @Autowired
    private BookService bookService;

    @GetMapping({"/", "/index"})
    public String index(){
        return "portal/index";
    }

    @PostMapping("/purchase")
    @ResponseBody
    public JsonResponse purchase(@RequestBody PurchaseParam purchaseParam){
        bookService.purchase(purchaseParam.getUsername(), purchaseParam.getIsbn(), purchaseParam.getNum());
        return JsonResponse.ok();
    }

    @ExceptionHandler(PurchaseException.class)
    @ResponseBody
    public JsonResponse PurchaseExceptionHandler(PurchaseException ex){
        return JsonResponse.error(ex.getMessage());
    }
}
