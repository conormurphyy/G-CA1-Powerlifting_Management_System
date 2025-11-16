package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.lifter.Lifter;
import org.powerliftingManagementSystem.lifter.LifterSortingFilterBackwards;
import org.powerliftingManagementSystem.lifter.LifterSortingFiltering;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menuOptions(ArrayList<Lifter> lifters) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("org.example.Menu");
        System.out.println("1. Sort Lifters by top to bottom");
        System.out.println("2. Sort Lifters by bottom to top");
        int choice =  scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sort Lifters");
                lifters.sort(new LifterSortingFiltering());
                printLifterTable(lifters);
            case 2:
                System.out.println("Sort Lifters");
                lifters.sort(new LifterSortingFilterBackwards());
                printLifterTable(lifters);

        }
    }


    public static void printLifterTable(ArrayList<Lifter> lifters) {

        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "Name", "Club Name", "Gender", "Body Weight", "",
                "Weight Class", "Date of Birth", "Age", "Age Class"
        );

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Lifter l : lifters) {
            System.out.printf(
                    "%-5d %-20s  %-35s  %-6c  %-6.2f %-8s  %-18s  %-15s  %-5d  %-12s %n",
                    l.getId(),
                    l.getName(),
                    l.getClubName(),
                    l.getGender(),
                    l.getBodyweight(),"KG",
                    l.getWeightClass(),
                    l.getDateOfBirth(),
                    l.getAge(),
                    l.getAgeClass()
            );
        }

        // BOTTOM BORDER
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
