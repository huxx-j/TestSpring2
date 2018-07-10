package com.huxx.vo;

public class TrainingVo {
    private int userTraining_no;
    private int user_no;
    private String periodFr;
    private String periodTo;
    private String oragan;
    private String course;
    private String content;

    public TrainingVo() {
    }

    public TrainingVo(int userTraining_no, int user_no, String periodFr, String periodTo, String oragan, String course, String content) {
        this.userTraining_no = userTraining_no;
        this.user_no = user_no;
        this.periodFr = periodFr;
        this.periodTo = periodTo;
        this.oragan = oragan;
        this.course = course;
        this.content = content;
    }

    public int getUserTraining_no() {
        return userTraining_no;
    }

    public void setUserTraining_no(int userTraining_no) {
        this.userTraining_no = userTraining_no;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TrainingVo{" +
                "userTraining_no=" + userTraining_no +
                ", user_no=" + user_no +
                ", periodFr='" + periodFr + '\'' +
                ", periodTo='" + periodTo + '\'' +
                ", oragan='" + oragan + '\'' +
                ", course='" + course + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
