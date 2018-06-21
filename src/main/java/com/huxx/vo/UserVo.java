package com.huxx.vo;

public class UserVo {

    private int num;
    private String id;
    private String pw;
    private String name;
    private String regDate;

    public UserVo() {
    }

    public UserVo(int num, String id, String pw, String name, String regDate) {
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "num=" + num +
                ", id='" + id + '\'' +
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
