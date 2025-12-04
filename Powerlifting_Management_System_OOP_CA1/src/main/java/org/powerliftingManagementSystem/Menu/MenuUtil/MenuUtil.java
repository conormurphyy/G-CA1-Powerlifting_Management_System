package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;

import java.util.ArrayList;

public class MenuUtil {


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














}

