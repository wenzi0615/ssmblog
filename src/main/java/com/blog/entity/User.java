package com.blog.entity;

import java.util.Date;

public class User {


    private int id;

    private String username;

    private String password;

    private UserStatus status;

    private UserPermission permission;

    private Date createTime;

    public enum UserStatus{active, frozen}

    public enum UserPermission{admin, user, guest}

    public User() {
    }

    public User(int id, String username, String password, UserStatus status, UserPermission permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserPermission getPermission() {
        return permission;
    }

    public void setPermission(UserPermission permission) {
        this.permission = permission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", permission=" + permission +
                '}';
    }
}
