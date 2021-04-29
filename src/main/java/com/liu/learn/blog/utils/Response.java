package com.liu.learn.blog.utils;

import java.util.HashMap;

public class Response extends HashMap<String,Object> {

    private static final String RESULT = "result";
    private static final String RES_STATUS = "status";
    private static final String RES_ERROR = "error";
    private static final String RES_SUCCESS = "success";
    private static final String RES_MESSAGE = "message";

    public Response(){

    }

    public Response success(){
        this.put(RES_STATUS, RES_SUCCESS);
        return this;
    }

    public Response error(String message){
        this.put(RES_STATUS, RES_ERROR);
        this.put(RES_MESSAGE, message);
        return this;
    }

    public Response addResult(Object result){
        this.put(RESULT, result);
        return this;
    }

}
