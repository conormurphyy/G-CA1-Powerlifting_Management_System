package org.powerliftingManagementSystem.menu;

import org.powerliftingManagementSystem.competition.Competition;
import org.powerliftingManagementSystem.lifter.Lifter;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuUtil {
    public static void printLifterTable(ArrayList<Lifter> lifters) {

        System.out.println("Lifter Table");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                "ID","Name", "Club Name", "Gender", "Body Weight", "",
                "Weight Class", "Date of Birth", "Age", "Age Class"
        );

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Lifter l : lifters) {
            System.out.printf(
                    "%-5d %-20s  %-35s  %-6c  %-6.2f %-8s  %-18s  %-15s  %-5d  %-12s %-25s %n",
                    l.getId(),
                    l.getName(),
                    l.getClubName(),
                    l.getGender(),
                    l.getBodyweight(),"KG",
                    l.getWeightClass(),
                    l.getDateOfBirth(),
                    l.getAge(),
                    l.getAgeClass(),
                    Arrays.toString(l.getEquipmentUsedType())
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

    public static void sortingMenu1 () {
        System.out.println("""
        +------------------------------------------------------+
        |                   OPTIONS: SORTING                   |
        +--------------------------+---------------------------+
        |     TYPE 1: ASCENDING    |     TYPE 2: DESCENDING    |
        +--------------------------+---------------------------+
        """);
    }

    public static void sortingMenu2 () {
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

    public static void search () {
        System.out.println("""
        +------------------------------------------------------+
        |                    OPTIONS: SEARCH                   |
        +--------------------------+---------------------------+
        |       TYPE 1: NAME       |        TYPE 2: CLUB       |
        +--------------------------+---------------------------+
        """);
    }

    public static void filteringMenuGender () {

    }

    public static void printCompetitionsTable(ArrayList<Competition> competitions) {
        for (Competition c : competitions) {
            System.out.printf(
                              "%-10d %-10s %-10s %-10s",
                    c.getId(),
                    c.getName(),
                    c.getLocation(),
                    c.getDate());
        }
    }


}

