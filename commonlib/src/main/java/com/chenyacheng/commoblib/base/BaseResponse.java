package com.chenyacheng.commoblib.base;

/**
 * 服务端返回的数据格式
 *
 * @author chenyacheng
 * @date 2019/01/17
 */
public class BaseResponse {

    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}