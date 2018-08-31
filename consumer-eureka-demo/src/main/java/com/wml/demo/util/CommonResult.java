package com.wml.demo.util;

public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CommonResult success(String code, String message, Object data) {
        return new CommonResult(code, message, data);
    }

    public CommonResult() {

    }

    public static CommonResult fail(String code, String message) {
        return new CommonResult(code, message);
    }
}
