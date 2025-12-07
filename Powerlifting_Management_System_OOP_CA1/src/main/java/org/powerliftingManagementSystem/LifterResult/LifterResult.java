package org.powerliftingManagementSystem.LifterResult;

import org.powerliftingManagementSystem.Lifter.Lifter;

import java.util.Objects;

public class LifterResult {
    //#region Fields
    private Lifter lifter;
    private int id;
    private double squat;
    private double bench;
    private double deadlift;
    private double total;
    private double dots;
    private int placement;
    //endregion
    //#region Constructor
    public LifterResult(Lifter lifter, double squat, double bench, double deadlift, double total, double dots) {
        this.lifter = lifter;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
        this.total = squat + bench + deadlift;
        this.dots = calculateDots();
    }

    public LifterResult (int id) {
        this.id = id;
    }

    public LifterResult(int id, double squat, double bench, double deadlift) {
        this.id = id;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
    }

    public LifterResult(int id, double squat, double bench, double deadlift, double dots, double total) {
        this.id = id;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
        this.total = squat + bench + deadlift;
        this.dots = 0;
    }

    public LifterResult(Lifter newLifter, double squat, double bench, double deadlift) {
        this.lifter = newLifter;
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

    public int getPlacement() {return placement;}
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

    public void setPlacement(int placement) {
        this.placement = placement;
    }
    //#endregion

    // Calculate Dots
    public double calculateDots() {
        //IPF dots calculation taken from https://www.powerlifting.sport/fileadmin/ipf/data/ipf-formula/Models_Evaluation-I-2020.pdf PAGE 13
        double bw = lifter.getBodyweight();
        double total = getTotal();
        double a = 0,b = 0,c = 0 ,d = 0,e = 0;
        if (lifter.getGender() == 'M') {
            a = 0.000001093;
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

        double denom = a*Math.pow(bw,4) + b*Math.pow(bw,3) + c*Math.pow(bw,2) + d*bw + e;
        return total * (500/ denom);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LifterResult other)) return false;
        return this.id == other.id;
    }
}
