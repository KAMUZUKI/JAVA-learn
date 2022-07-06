package com.mu.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author MUZUKI
 */
@Data
public class BaseResult implements Serializable {
    private Integer code;
    private String msg;
    private transient Object data;
    public static BaseResult success(Integer code, String msg, Object data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(code);
        baseResult.setData(data);
        baseResult.setMsg(msg);
        return baseResult;
    }
}
