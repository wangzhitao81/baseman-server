package com.ecologydata.baseman.common;

/**
 *
 * @param <T>
 */
public class RestResult<T> {
    private String msg;

    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
