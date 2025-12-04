package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.util.ArrayList;

public class LifterResultMenuUtil {
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
    public static void printLiftersInCompResults(ArrayList<LifterResult> results) {

        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-4s %-30s %-35s %-7s %-20s %-15s %10s %10s %10s %10s %10s%n",
                "ID", "Name", "Club", "Gender", "Weight Class", "Age Class", "Squat", "Bench", "Deadlift", "Total", "DOTS"
        );

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

        for (LifterResult r : results) {
            System.out.printf(
                    "%-4d %-30s %-35s %-7c %-20s %-15s %10.1f %10.1f %10.1f %10.1f %10.2f%n",
                    r.getLifter().getId(),
                    r.getLifter().getName(),
                    r.getLifter().getClubName(),
                    r.getLifter().getGender(),
                    r.getLifter().getWeightClass(),
                    r.getLifter().getAgeClass(),
                    r.getSquat(),
                    r.getBench(),
                    r.getDeadlift(),
                    r.getTotal(),
                    r.calculateDots()
            );
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
