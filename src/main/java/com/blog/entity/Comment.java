package com.blog.entity;

import java.util.Date;

public class Comment {

    private int id;

    private int userId;

    private String comment;

    private int blogId;

    private Date createTime;

    public Comment() {
    }

    public Comment(int id, int userId, String comment, int blogId) {
        this.id = id;
        this.userId = userId;
        this.comment = comment;
        this.blogId = blogId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", comment='" + comment + '\'' +
                ", blogId=" + blogId +
                '}';
    }
}
