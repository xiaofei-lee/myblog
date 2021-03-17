package com.xiaofei.blog.common.result;

import lombok.Data;

/**
 * api接口返回封装
 *
 * @author xiaofei
 */
@Data
public class ResultResponse {
    private Integer code;
    private String message;
    private Object data;

    /**
     * 无参构造函数
     */
    public ResultResponse() {
    }

    /**
     * 全参构造函数
     *
     * @param code
     * @param message
     * @param data
     */
    public ResultResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
