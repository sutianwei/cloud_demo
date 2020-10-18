package com.awei.cloud.common;

import java.text.MessageFormat;


public class StarException extends RuntimeException {

    //错误代码
    ResultCode resultCode;

    public StarException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public StarException(ResultCode resultCode, Object... args) {
        super(resultCode.getMsg());
        String message = MessageFormat.format(resultCode.getMsg(), args);
        resultCode.setMsg(message);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
