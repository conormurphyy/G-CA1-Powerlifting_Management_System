package org.powerliftingManagementSystem.competition;

import org.powerliftingManagementSystem.lifter.Lifter;

public class CompetitionResult {
    //#region Fields
    private static Lifter lifter;
    private int id;
    private static double squat;
    private static double bench;
    private static double deadlift;
    //endregion
    //#region Constructor
    public CompetitionResult(Lifter lifter, double squat, double bench, double deadlift) {
        this.lifter = lifter;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
    }

    public CompetitionResult(int id, double squat, double bench, double deadlift) {
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
    //#endregion
    //#region Setters
    public void setLifter(Lifter lifter) {
        this.lifter = lifter;
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

    // Calculate Total
    public static double getTotal() {
        return squat + bench + deadlift;
    }

    // Calculate Dots
    public static double calculateDots() {
        double bodyweight = lifter.getBodyweight();
        double total = getTotal();
        double dots = total * 500 / bodyweight;
        return dots;
    }
}
