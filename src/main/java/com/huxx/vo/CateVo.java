package com.huxx.vo;

public class CateVo {
    private int num;
    private String title;
    private int cateorder;
    private String enroll;

    public CateVo() {
    }

    public CateVo(int num, String title, int cateorder, String enroll) {
        this.num = num;
        this.title = title;
        this.cateorder = cateorder;
        this.enroll = enroll;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    @Override
    public String toString() {
        return "CateVo{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", cateorder=" + cateorder +
                ", enroll='" + enroll + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCateorder() {
        return cateorder;
    }

    public void setCateorder(int cateorder) {
        this.cateorder = cateorder;
    }
}
