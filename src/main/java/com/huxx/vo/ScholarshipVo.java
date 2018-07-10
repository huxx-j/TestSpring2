package com.huxx.vo;

public class ScholarshipVo {

    private int userScholarship_no;
    private int user_no;
    private String periodFr;
    private String periodTo;
    private String school;
    private String stat;
    private String location;
    private String degree;
    private String major;
    private String subMajor;

    public ScholarshipVo() {
    }

    public ScholarshipVo(int userScholarship_no, int user_no, String periodFr, String periodTo, String school, String stat, String location, String degree, String major, String subMajor) {
        this.userScholarship_no = userScholarship_no;
        this.user_no = user_no;
        this.periodFr = periodFr;
        this.periodTo = periodTo;
        this.school = school;
        this.stat = stat;
        this.location = location;
        this.degree = degree;
        this.major = major;
        this.subMajor = subMajor;
    }

    public int getUserScholarship_no() {
        return userScholarship_no;
    }

    public void setUserScholarship_no(int userScholarship_no) {
        this.userScholarship_no = userScholarship_no;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSubMajor() {
        return subMajor;
    }

    public void setSubMajor(String subMajor) {
        this.subMajor = subMajor;
    }

    @Override
    public String toString() {
        return "ScholarshipVo{" +
                "userScholarship_no=" + userScholarship_no +
                ", user_no=" + user_no +
                ", periodFr='" + periodFr + '\'' +
                ", periodTo='" + periodTo + '\'' +
                ", school='" + school + '\'' +
                ", stat='" + stat + '\'' +
                ", location='" + location + '\'' +
                ", degree='" + degree + '\'' +
                ", major='" + major + '\'' +
                ", subMajor='" + subMajor + '\'' +
                '}';
    }
}
