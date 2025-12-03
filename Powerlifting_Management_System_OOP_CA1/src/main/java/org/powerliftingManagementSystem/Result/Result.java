package org.powerliftingManagementSystem.Result;

import org.powerliftingManagementSystem.Lifter.Lifter;

public class Result {
    //#region Fields
    private Lifter lifter;
    private int id;
    private double squat;
    private double bench;
    private double deadlift;
    private double total;
    private double dots;
    //endregion
    //#region Constructor
    public Result(Lifter lifter, double squat, double bench, double deadlift, double total, double dots) {
        this.lifter = lifter;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
        this.total = squat + bench + deadlift;
        this.dots = 0;
    }

    public Result(int id, double squat, double bench, double deadlift) {
        this.id = id;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
    }


    //#endregion
    //#region Getters
    public Lifter getLifter() {
        return lifter;
    }

    public int getId() {
        return id;
    }

    public double getSquat() {
        return squat;
    }

    public double getBench() {
        return bench;
    }

    public double getDeadlift() {
        return deadlift;
    }

    public double getTotal() {return total;}

    public double getDots() {return dots;}
    //#endregion
    //#region Setters
    public void setLifter(Lifter lifter) {
        this.lifter = lifter;
        this.total = squat + bench + deadlift;
        this.dots = calculateDots();
    }

    public void setSquat(double squat) {
        this.squat = squat;
    }

    public void setBench(double bench) {
        this.bench = bench;
    }

    public void setDeadlift(double deadlift) {
        this.deadlift = deadlift;
    }
    //#endregion

    // Calculate Dots
    public double calculateDots() {
        //IPF dots calculation taken from https://www.powerlifting.sport/fileadmin/ipf/data/ipf-formula/Models_Evaluation-I-2020.pdf PAGE 13
        double dots = 0;
        double bw = lifter.getBodyweight();
        double total = getTotal();
        double a = 0,b = 0,c = 0 ,d = 0,e = 0;
        if (lifter.getGender() == 'M') {
            a = 0.00000109;
            b = 0.0007391293;
            c = 0.1918759221;
            d = 24.0900756;
            e = 307.75076;
        }
        else if (lifter.getGender() == 'F') {
             a = -0.0000010706;
             b = 0.0005158568;
             c = -0.1126655495;
             d = 13.6175032;
             e = -57.96288;
        }

        dots = total * 500/ (a*Math.pow(bw,4) + b*Math.pow(bw,3) + c * Math.pow(bw,2) + d * bw + e);

        return dots;

    }
}
