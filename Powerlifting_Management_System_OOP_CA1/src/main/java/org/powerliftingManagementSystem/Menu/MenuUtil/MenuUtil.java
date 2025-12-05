package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.lang.reflect.Array;
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

    public static void sortingAscDec() {
        System.out.println("""
        ++=========================================================================++
        ||                                SORTING MENU                             ||
        ++-------------------------------------------------------------------------++
        ||                      Select one of the following options:               ||
        ++-------------------------------------+-----------------------------------++
        ||           Sort Ascending: "1"       |         Sort Descending: "2"      ||
        ++-------------------------------------+-----------------------------------++
        ||                                Exit : "0"                               ||
        ++=========================================================================++
        """);
    }














}

