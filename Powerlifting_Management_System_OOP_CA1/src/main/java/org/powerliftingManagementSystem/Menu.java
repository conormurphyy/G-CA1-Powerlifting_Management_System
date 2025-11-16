package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.lifter.Lifter;
import org.powerliftingManagementSystem.lifter.LifterSortingFilterBackwards;
import org.powerliftingManagementSystem.lifter.LifterSortingFiltering;

import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.MenuUtil.printLifterTable;

public class Menu {

    public static void menuOptions(ArrayList<Lifter> lifters) {
        Scanner scanner =  new Scanner(System.in);
        MenuUtil.sortingMenu1();
        int choice =  scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sort Lifters Acc");
                MenuUtil.sortingMenu2();
                int choice1 =  scanner.nextInt();
                lifters.sort(new LifterSortingFiltering(choice1));
                printLifterTable(lifters);
                break;
            case 2:
                System.out.println("Sort Lifters Dec");
                MenuUtil.sortingMenu2();
                int choice2 =  scanner.nextInt();
                lifters.sort(new LifterSortingFilterBackwards(choice2));
                printLifterTable(lifters);
                break;
        }
    }

}
