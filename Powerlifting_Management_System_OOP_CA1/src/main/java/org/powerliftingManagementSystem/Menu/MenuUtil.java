package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Result.Result;
import org.powerliftingManagementSystem.Leaderboard.sortLifterDots;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Result.LifterResultSort;

import java.util.ArrayList;

public class MenuUtil {
    public static void printLifterTable(ArrayList<Lifter> lifters) {


        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "ID", "Name", "Club Name", "Gender", "Body Weight", "",
                "Weight Class", "Date of Birth", "Age", "Age Class"
        );

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Lifter l : lifters) {
            System.out.printf(
                    "%-5d %-20s  %-35s  %-6c  %-6.2f %-8s  %-18s  %-15s  %-5d  %-12s %n",
                    l.getId(),
                    l.getName(),
                    l.getClubName(),
                    l.getGender(),
                    l.getBodyweight(), "KG",
                    l.getWeightClass(),
                    l.getDateOfBirth(),
                    l.getAge(),
                    l.getAgeClass()
                    //dots
                    //Arrays.toString(l.getEquipmentUsedType())
            );
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void mainMenu() {
        System.out.println("""
                +------------------------------------------------------+
                |                      MAIN MENU                       |
                +--------------------------+---------------------------+
                |      TYPE 1: SORTING     |     TYPE 2: SEARCHING     |
                +--------------------------+---------------------------+
                
                """);
    }

    public static void sortingMenu1() {
        System.out.println("""
                +------------------------------------------------------+
                |                   OPTIONS: SORTING                   |
                +--------------------------+---------------------------+
                |     TYPE 1: ASCENDING    |     TYPE 2: DESCENDING    |
                +--------------------------+---------------------------+
                """);
    }

    public static void sortingMenu2() {
        System.out.println("""
                +------------------------------------------------------+
                |                   OPTIONS: SORTING                   |
                +--------------------------+---------------------------+
                |      TYPE 1: NAME        |      TYPE 2: CLUB         | 
                +--------------------------+---------------------------+
                |      TYPE 3: AGE         |      TYPE 4: WEIGHT       |
                +--------------------------+---------------------------+
                """);
    }

    public static void search() {
        System.out.println("""
                +------------------------------------------------------+
                |                    OPTIONS: SEARCH                   |
                +--------------------------+---------------------------+
                |       TYPE 1: NAME       |        TYPE 2: CLUB       |
                +--------------------------+---------------------------+
                """);
    }

    public static void filteringMenuGender() {

    }

    public static void printCompetitionsTable(ArrayList<Competition> competitions) {
        for (Competition c : competitions) {
            System.out.printf(
                    "%-10d %-10s %-10s %-10s %-100s\n",
                    c.getId(),
                    c.getName(),
                    c.getLocation(),
                    c.getDate(),
                    c.getLifters());

        }
    }

    public static void printLiftersInCompTable(ArrayList<Competition> competitions, int selection) {
        for (Competition comp : competitions) {
            if (comp.getId() == selection) {
                System.out.println(comp.getName() + ", " + comp.getLocation());


            }
        }

    }

    public static void printLiftersInCompResults(ArrayList<Result> results) {

        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "ID", "Name", "Club Name", "Gender", "Body Weight", "",
                "Weight Class", "Date of Birth", "Age", "Age Class"
        );

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Result r : results) {
            System.out.printf(
                    "%-5d %-20s  %-35s  %-6c  %-6.2f %-8s  %-18s  %-15s  %-5d  %-12s %-25s %n",
                    r.getLifter().getId(),
                    r.getLifter().getName(),
                    r.getLifter().getClubName(),
                    r.getLifter().getGender(),
                    r.getLifter().getBodyweight(), "KG",
                    r.getLifter().getWeightClass(),
                    r.getLifter().getDateOfBirth(),
                    r.getLifter().getAge(),
                    r.getLifter().getAgeClass(),
                    r.calculateDots()
                    //Arrays.toString(l.getEquipmentUsedType())
            );
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void printTop3Dots(ArrayList<Result> results) {

        results.sort(new sortLifterDots());

// print top 3
        System.out.println("Top 3 Lifters by DOTS");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "DOTS"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            Result res = results.get(i);

            System.out.printf(
                    "%-6d %-20s %-20s %-6c %-10.2f %-10.2f%n",
                    res.getLifter().getId(),
                    res.getLifter().getName(),
                    res.getLifter().getClubName(),
                    res.getLifter().getGender(),
                    res.getLifter().getBodyweight(),
                    res.getDots()
            );
        }


    }

    public static void printTop3DeadLift(ArrayList<Result> results) {

        results.sort(LifterResultSort.byDeadliftOverall);

// print top 3
        System.out.println("Top 3 Lifters by DeadLift");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "Deadlift"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            Result res = results.get(i);

            System.out.printf(
                    "%-6d %-20s %-20s %-6c %-10.2f %-4.1f %-2s%n",
                    res.getLifter().getId(),
                    res.getLifter().getName(),
                    res.getLifter().getClubName(),
                    res.getLifter().getGender(),
                    res.getLifter().getBodyweight(),
                    res.getDeadlift(), "KG"
            );
        }


    }


}

