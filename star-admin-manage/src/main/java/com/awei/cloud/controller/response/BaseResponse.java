package com.awei.cloud.controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Response", description = "返回对象")
public class BaseResponse<T> {

    @ApiModelProperty(value = "是否成功")
    private boolean success;

    @ApiModelProperty(value = "状态编码")
    private String code;

    @ApiModelProperty(value = "处理结果描述")
    private String msg;

    @ApiModelProperty(value = "返回的对象信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)//该注解是不参与序列化，为null的时候不传递给前台
    private T data;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String isCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 处理成功返回
     *
     * @return
     */
    public static <T> BaseResponse<T> success() {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(true);
        response.setMsg("success");
        response.setData(null);
        return response;
    }

    /**
     * 处理成功返回
     *
     * @return
     */
    public static <T> BaseResponse<T> success(String msg) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(true);
        response.setMsg(msg);
        response.setData(null);
        return response;
    }

    /**
     * 处理成功返回
     *
     * @return
     */
    public static <T> BaseResponse<T> success(T obj) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(true);
        response.setMsg("success");
        response.setData(obj);
        return response;
    }

    /**
     * 处理成功返回
     *
     * @return
     */
    public static <T> BaseResponse<T> success(T obj, String msg) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(true);
        response.setMsg(msg);
        response.setData(obj);
        return response;
    }

    /**
     * 处理成功返回
     *
     * @return
     */
    public static <T> BaseResponse<T> error(T obj, String msg) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(false);
        response.setMsg(msg);
        response.setData(obj);
        return response;
    }

    /**
     * 处理异常返回
     *
     * @param msg
     * @return
     */
    public static <T> BaseResponse<T> error(String msg) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(false);
        response.setMsg(msg);
        response.setData(null);
        return response;
    }

    /**
     * 处理警告返回
     *
     * @param msg
     * @return
     */
    public static <T> BaseResponse<T> warn(String msg) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(false);
        response.setCode("warn");
        response.setMsg(msg);
        response.setData(null);
        return response;
    }
}
