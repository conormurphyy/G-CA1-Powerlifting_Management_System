package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.Competition.Competition;

import java.util.ArrayList;

public class CompetitionMenuUtil {
    public static void printLiftersInCompTable(ArrayList<Competition> competitions, int selection) {
        for (Competition comp : competitions) {
            if (comp.getId() == selection) {
                System.out.println(comp.getName() + ", " + comp.getLocation());


            }
        }

    }
    public static void printCompetitionsTable(ArrayList<Competition> competitions) {
        System.out.printf("%-10s %-18s %-20s %-12s \n",
                "ID", "Name", "Location", "Date ");
        for (Competition c : competitions) {
            System.out.printf(
                    "%-10d %-18s %-20s %-12s \n",
                    c.getId(),
                    c.getName(),
                    c.getLocation(),
                    c.getDate()
            );
        }
    }
}
