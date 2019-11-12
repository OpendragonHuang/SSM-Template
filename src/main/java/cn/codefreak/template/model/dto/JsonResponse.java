package cn.codefreak.template.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

@Data
public class JsonResponse implements Serializable {
    private final static long serialVersionUID = 1L;
    private Integer code;
    private String message;
    private HashMap<String, Object> data = new HashMap<>();

    public JsonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static JsonResponse ok(){
        return new JsonResponse(0, "success");
    }

    public static JsonResponse error(String message){
        return new JsonResponse(-1, message);
    }
}
