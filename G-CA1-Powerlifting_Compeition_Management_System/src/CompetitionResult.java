import Lifter.Lifter;

public class CompetitionResult {
    //#region Fields
    private Lifter lifter;
    private Competition competition;
    private double squat;
    private double bench;
    private double deadlift;
    //endregion
    //#region Constructor
    public CompetitionResult(Lifter lifter, Competition competition, double squat, double bench, double deadlift) {
        this.lifter = lifter;
        this.competition = competition;
        this.squat = squat;
        this.bench = bench;
        this.deadlift = deadlift;
    }
    //#endregion
    //#region Getters
    public Lifter getLifter() {
        return lifter;
    }

    public Competition getCompetition() {
        return competition;
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

    public void setCompetition(Competition competition) {
        this.competition = competition;
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
    public double getTotal() {
        return squat + bench + deadlift;
    }

    // Calculate Dots
    public double calculateDots() {
        double bodyweight = lifter.getBodyweight();
        double total = getTotal();
        double dots = total * 500 / bodyweight;
        return dots;
    }
}
