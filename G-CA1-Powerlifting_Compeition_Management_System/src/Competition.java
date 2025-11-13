import Lifter.Lifter;

import java.util.ArrayList;

public class Competition {
    //#region Fields
    private int id;
    private String name;
    private String location;
    private String date;
    private ArrayList<Lifter> lifters;
    //#endregion
    //#region Constructor
    public Competition(int id, String name, String location, String date, Lifter [] lifters) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.lifters = new ArrayList<>();
    }
    //#endregion

    //#region Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<Lifter> getLifters() {
        return lifters;
    }
    //#endregion
    //#region Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Lifter> setLifters() {
        return lifters;
    }
    //#endregion
}
