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
        System.out.println("1. Sort Lifters by A to Z");
        System.out.println("2. Sort Lifters by Z to A");
        int choice =  scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sort Lifters A-z");
                System.out.println("Sort Name, Sort Club, Sort Age, Sort Bodyweight");
                int choice1 =  scanner.nextInt();
                lifters.sort(new LifterSortingFiltering(choice1));
                printLifterTable(lifters);
                break;
            case 2:
                System.out.println("Sort Lifters");
                int  choice2 =  scanner.nextInt();
                lifters.sort(new LifterSortingFilterBackwards(choice2));
                printLifterTable(lifters);
                break;
        }
    }


    public static void printLifterTable(ArrayList<Lifter> lifters) {

        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "ID","Name", "Club Name", "Gender", "Body Weight", "",
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
