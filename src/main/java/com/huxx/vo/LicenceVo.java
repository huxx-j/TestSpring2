package com.huxx.vo;

public class LicenceVo {
    private int licence_no;
    private int user_no;
    private String liceName;
    private String acquirDate;
    private String issueOrgan;
    private String score;

    public LicenceVo() {
    }

    public LicenceVo(int licence_no, int user_no, String liceName, String acquirDate, String issueOrgan, String score) {
        this.licence_no = licence_no;
        this.user_no = user_no;
        this.liceName = liceName;
        this.acquirDate = acquirDate;
        this.issueOrgan = issueOrgan;
        this.score = score;
    }

    public int getLicence_no() {
        return licence_no;
    }

    public void setLicence_no(int licence_no) {
        this.licence_no = licence_no;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getLiceName() {
        return liceName;
    }

    public void setLiceName(String liceName) {
        this.liceName = liceName;
    }

    public String getAcquirDate() {
        return acquirDate;
    }

    public void setAcquirDate(String acquirDate) {
        this.acquirDate = acquirDate;
    }

    public String getIssueOrgan() {
        return issueOrgan;
    }

    public void setIssueOrgan(String issueOrgan) {
        this.issueOrgan = issueOrgan;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "LicenceVo{" +
                "licence_no=" + licence_no +
                ", user_no=" + user_no +
                ", liceName='" + liceName + '\'' +
                ", acquirDate='" + acquirDate + '\'' +
                ", issueOrgan='" + issueOrgan + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}

