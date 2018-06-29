package com.huxx.vo;

public class UserVo {

    private int num;
    private String UserId;
    private String pw;
    private String name;
    private String regDate;

    public UserVo() {
    }

    public UserVo(int num, String userId, String pw, String name, String regDate) {
        this.num = num;
        UserId = userId;
        this.pw = pw;
        this.name = name;
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "num=" + num +
                ", UserId='" + UserId + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}