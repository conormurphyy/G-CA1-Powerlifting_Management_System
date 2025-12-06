package org.powerliftingManagementSystem.Leaderboard;

import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.util.ArrayList;

public class Leaderboard {
    public static void printTop3DeadLift(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.byDeadliftDesc);

// print top 3
        System.out.println("Top 3 Lifters by DeadLift");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "Deadlift"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            LifterResult res = results.get(i);

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
    public static void printTop3Bench(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.byDotsDesc);

// print top 3
        System.out.println("Top 3 Lifters by Bench");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "Bench"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            LifterResult res = results.get(i);

            System.out.printf(
                    "%-6d %-20s %-20s %-6c %-10.2f %-10.2f %-2s%n",
                    res.getLifter().getId(),
                    res.getLifter().getName(),
                    res.getLifter().getClubName(),
                    res.getLifter().getGender(),
                    res.getLifter().getBodyweight(),
                    res.getBench(), "KG"
            );
        }


    }
    public static void printTop3Squat(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.bySquatDesc);

// print top 3
        System.out.println("Top 3 Lifters by Squat");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "Squat"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            LifterResult res = results.get(i);

            System.out.printf(
                    "%-6d %-20s %-20s %-6c %-10.2f %-4.1f %-2s%n",
                    res.getLifter().getId(),
                    res.getLifter().getName(),
                    res.getLifter().getClubName(),
                    res.getLifter().getGender(),
                    res.getLifter().getBodyweight(),
                    res.getSquat(), "KG"
            );
        }


    }
    public static void printTop3Total(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.byTotalDesc);

// print top 3
        System.out.println("Top 3 Lifters by Total");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "Total"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            LifterResult res = results.get(i);

            System.out.printf(
                    "%-6d %-20s %-20s %-6c %-10.2f %-4.1f %-2s%n",
                    res.getLifter().getId(),
                    res.getLifter().getName(),
                    res.getLifter().getClubName(),
                    res.getLifter().getGender(),
                    res.getLifter().getBodyweight(),
                    res.getTotal(), "KG"
            );
        }


    }
    public static void printTop3Dots(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.byDotsDesc);

// print top 3
        System.out.println("Top 3 Lifters by DOTS");
        System.out.printf(
                "%-6s %-20s %-20s %-6s %-10s %-10s%n",
                "ID", "Name", "Club", "Gender", "Weight", "DOTS"
        );
        for (int i = 0; i < results.size() && i < 3; i++) {
            LifterResult res = results.get(i);

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
}
