package org.powerliftingManagementSystem.Equiptment;

public class Equipment {
    //#region Fields
    private int id; //Must match lifter id
    private String belt;
    private String singlet;
    private String compTee;
    private String wristWraps;
    private String kneeSleeves;
    private String socks;
    private String deadliftSocks;
    private String shoes;

    public Equipment(int id, String belt, String singlet, String compTee, String wristWraps, String kneeSleeves, String socks, String deadliftSocks, String shoes) {
        this.id = id;
        this.belt = belt;
        this.singlet = singlet;
        this.compTee = compTee;
        this.wristWraps = wristWraps;
        this.kneeSleeves = kneeSleeves;
        this.socks = socks;
        this.deadliftSocks = deadliftSocks;
        this.shoes = shoes;
    }

    public int getId() {
        return id;
    }

    public String getBelt() {
        return belt;
    }

    public String getSinglet() {
        return singlet;
    }

    public String getCompTee() {
        return compTee;
    }

    public String getWristWraps() {
        return wristWraps;
    }

    public String getKneeSleeves() {
        return kneeSleeves;
    }

    public String getSocks() {
        return socks;
    }

    public String getDeadliftSocks() {
        return deadliftSocks;
    }

    public String getShoes() {
        return shoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public void setSinglet(String singlet) {
        this.singlet = singlet;
    }

    public void setCompTee(String compTee) {
        this.compTee = compTee;
    }

    public void setWristWraps(String wristWraps) {
        this.wristWraps = wristWraps;
    }

    public void setKneeSleeves(String kneeSleeves) {
        this.kneeSleeves = kneeSleeves;
    }

    public void setSocks(String socks) {
        this.socks = socks;
    }

    public void setDeadliftSocks(String deadliftSocks) {
        this.deadliftSocks = deadliftSocks;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    //private boolean isApproved;
    //#endregion
}
