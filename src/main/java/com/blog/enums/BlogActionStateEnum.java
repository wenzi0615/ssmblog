package com.blog.enums;

public enum BlogActionStateEnum {

    ADD_SUCCESS(1,"增加成功"),
    DELETE_SUCCESS(2,"删除成功"),
    MODIFY_SUCCESS(3,"修改成功"),
    ADD_ERROR(-1,"增加异常"),
    DELETE_ERROR(-2,"删除异常"),
    MODIFY_ERROR(-3,"修改异常");

    private  int state;

    private String stateInfo;

    BlogActionStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }
}
