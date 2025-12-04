package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.util.ArrayList;

public class LifterResultMenuUtil {
    public static void printTop3DeadLift(ArrayList<LifterResult> results) {

        results.sort(LifterResultSort.byDeadliftOverall);

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

        results.sort(LifterResultSort.byDotsOverall);

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
                "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "ID", "Name", "Club Name", "Gender", "Body Weight", "",
                "Weight Class", "Date of Birth", "Age", "Age Class"
        );

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (LifterResult r : results) {
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
}
