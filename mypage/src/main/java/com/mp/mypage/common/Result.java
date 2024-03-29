package com.mp.mypage.common;

import java.util.HashMap;

/**
 * @description 该类用于各种请求的信息返回
 * @author 刘鑫源
 * @time 2019/11/16
 * @lastUpdateMan 刘鑫源
 * @lastUpdateTime 2019/11/16
 * @version 1.0
 */
public class Result {
    private int code;
    private String description;
    private Object attribute;

    public Result(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getAttribute() {
        return attribute;
    }

    public Result setAttribute(Object attribute) {
        this.attribute = attribute;
        return this;
    }

    public Result addAttribute(Object attribute){
        return setAttribute(attribute);
    }

    public Result addAttribute(String key, Object attribute){

        if(this.attribute == null)
            this.attribute = new HashMap<String, Object>();
        ((HashMap<String, Object>) this.attribute).put(key, attribute);
        return this;
    }

    public Result addAttributes(HashMap<String, Object> map){
        this.attribute = map;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
