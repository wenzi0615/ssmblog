package com.blog.enums;

public enum OperStateEnum {

    BLOG_ADD_SUCCESS(11,"博客添加成功"),
    BLOG_DELETE_SUCCESS(12,"博客删除成功"),
    BLOG_MODIFY_SUCCESS(13,"博客修改成功"),
    BLOG_ADD_ERROR(-11,"博客添加异常"),
    BLOG_DELETE_ERROR(-12,"博客删除异常"),
    BLOG_MODIFY_ERROR(-13,"博客修改异常"),

    CATEGORY_ADD_SUCCESS(21,"博客类别增加成功"),
    CATEGORY_DELETE_SUCCESS(22,"博客类别删除成功"),
    CATEGORY_MODIFY_SUCCESS(23,"博客类别修改成功"),
    CATEGORY_ADD_ERROR(-21,"博客类别增加异常"),
    CATEGORY_DELETE_ERROR(-22,"博客类别删除异常"),
    CATEGORY_MODIFY_ERROR(-23,"博客类别修改异常"),

    COMMENT_ADD_SUCCESS(31,"评论增加成功"),
    COMMENT_DELETE_SUCCESS(32,"评论删除成功"),
    COMMENT_ADD_ERROR(-31,"评论增加异常"),
    COMMENT_DELETE_ERROR(-32,"评论删除异常"),

    USER_ADD_SUCCESS(41,"用户增加成功"),
    USER_DELETE_SUCCESS(42,"用户删除成功"),
    USER_MODIFY_SUCCESS(43,"用户修改成功"),
    USER_ADD_ERROR(-41,"用户增加异常"),
    USER_DELETE_ERROR(-42,"用户删除异常"),
    USER_MODIFY_ERROR(-43,"用户修改异常");

    private int state;

    private String stateInfo;

    OperStateEnum(int state, String stateInfo) {
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
