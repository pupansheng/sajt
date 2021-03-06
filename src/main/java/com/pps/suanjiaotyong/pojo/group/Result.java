package com.pps.suanjiaotyong.pojo.group;

/**
 * @Classname Result
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/17 10:01
 * @Vestion 1.0
 **/
public class Result {

    private  Object data;
    private  String message;
    private  boolean status;

    public  Result(){

    }
    public Result(String message, boolean status) {
        this.message = message;
        this.status = status;
    }


    public Result(Object data, String message, boolean status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
