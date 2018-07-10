package com.huxx.vo;

public class BitVo {
private int studID;
private String loginID;
private String nameHan;
private String handphone;

    public BitVo() {
    }

    public BitVo(int studID, String loginID, String nameHan, String handphone) {
        this.studID = studID;
        this.loginID = loginID;
        this.nameHan = nameHan;
        this.handphone = handphone;
    }

    @Override
    public String toString() {
        return "BitVo{" +
                "studID=" + studID +
                ", loginID='" + loginID + '\'' +
                ", nameHan='" + nameHan + '\'' +
                ", handphone='" + handphone + '\'' +
                '}';
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getNameHan() {
        return nameHan;
    }

    public void setNameHan(String nameHan) {
        this.nameHan = nameHan;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }
}
