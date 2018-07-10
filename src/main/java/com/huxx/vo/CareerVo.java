package com.huxx.vo;

public class CareerVo {
    private int userCareer_no;
    private int user_no;
    private String periodFr;
    private String periodTo;
    private String oragan;
    private String devPart;
    private String role;

    public CareerVo() {
    }

    public CareerVo(int userCareer_no, int user_no, String periodFr, String periodTo, String oragan, String devPart, String role) {
        this.userCareer_no = userCareer_no;
        this.user_no = user_no;
        this.periodFr = periodFr;
        this.periodTo = periodTo;
        this.oragan = oragan;
        this.devPart = devPart;
        this.role = role;
    }

    public int getUserCareer_no() {
        return userCareer_no;
    }

    public void setUserCareer_no(int userCareer_no) {
        this.userCareer_no = userCareer_no;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getPeriodFr() {
        return periodFr;
    }

    public void setPeriodFr(String periodFr) {
        this.periodFr = periodFr;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    public String getOragan() {
        return oragan;
    }

    public void setOragan(String oragan) {
        this.oragan = oragan;
    }

    public String getDevPart() {
        return devPart;
    }

    public void setDevPart(String devPart) {
        this.devPart = devPart;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "CareerVo{" +
                "userCareer_no=" + userCareer_no +
                ", user_no=" + user_no +
                ", periodFr='" + periodFr + '\'' +
                ", periodTo='" + periodTo + '\'' +
                ", oragan='" + oragan + '\'' +
                ", devPart='" + devPart + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
