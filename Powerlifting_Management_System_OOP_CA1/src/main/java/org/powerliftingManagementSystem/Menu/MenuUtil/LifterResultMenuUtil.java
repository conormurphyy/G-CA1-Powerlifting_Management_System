package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.util.ArrayList;

public class LifterResultMenuUtil {
    //#region Lifter Result Tables

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
    //#endregion

    public static void lifterResultMenu() {
        System.out.println("""
        ++=========================================================================++
        ||                            LIFTER RESULT MENU                           ||
        ++-------------------------------------------------------------------------++
        ||                      Select one of the following options:               ||
        ++-------------------------------------+-----------------------------------++
        ||       Sort by Dots Score: "1"       |        Sort by Total: "2"         ||
        ++-------------------------------------+-----------------------------------++
        ||         Sort by Squat: "3"          |         Sort by Bench: "4"        ||
        ++-------------------------------------+-----------------------------------++
        ||         Sort by Deadlift: "5"       |         Search by Name: "6"       ||
        ++-------------------------------------+-----------------------------------++
        ||       Search by ClubName: "7"       |    Exit Lifter Result Menu: "0"   ||
        ++=========================================================================++
        """);
    }

    public static void exitToLifterResultMenu() {
        System.out.println("""
        ++=========================================================================++
        ||                  Exiting to Lifter Result Menu...                       ||
        ++=========================================================================++
        """);
    }
}
