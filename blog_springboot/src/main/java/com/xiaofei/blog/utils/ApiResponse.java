package com.xiaofei.blog.utils;

import lombok.Data;

@Data
public class ApiResponse {
    private Integer code; // 状态码
    private String message; // 返回描述
    private Object data; // 返回数据

    /**
     * 无参构造函数
     */
    public ApiResponse() {
    }

    /**
     * 全参构造函数
     *
     * @param code
     * @param message
     * @param data
     */
    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
