package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Lifter.LifterSortingDescending;
import org.powerliftingManagementSystem.Lifter.LifterSortingAscending;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil.printLifterTable;

public class MainMenu {

    public static void menuOptions(ArrayList<Lifter> lifters) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            MenuUtil.mainMenu();

            System.out.print("Enter main menu choice: ");
            int mainMenuChoice = -1;

            try {
                mainMenuChoice = scanner.nextInt();
                scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (mainMenuChoice) {
                case 1:
                    MenuUtil.sortingMenu1();
                    System.out.print("Enter sort option: ");

                    int sortChoice = -1;
                    try {
                        sortChoice = scanner.nextInt();
                        scanner.nextLine();
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    switch (sortChoice) {
                        case 1:
                            MenuUtil.sortingMenu2();
                            int sortChoiceIn = -1;
                            try {
                                sortChoiceIn = scanner.nextInt();
                                scanner.nextLine();
                            }
                            catch (InputMismatchException e) {
                                System.out.println("Invalid input! Please enter a number.");
                                scanner.nextLine();
                                break;
                            }
                            lifters.sort(new LifterSortingAscending(sortChoiceIn));
                            printLifterTable(lifters);
                            break;
                        case 2:
                            MenuUtil.sortingMenu2();
                            int sortChoiceIn2 = -1;
                            try {
                                sortChoiceIn2 = scanner.nextInt();
                                scanner.nextLine();
                            }
                            catch (InputMismatchException e) {
                                System.out.println("Invalid input! Please enter a number.");
                                scanner.nextLine();
                                break;
                            }
                            lifters.sort(new LifterSortingDescending(sortChoiceIn2));
                            printLifterTable(lifters);
                            break;

                        default:
                            System.out.println("Invalid sort choice!");
                    }
                    break;

                case 2:

                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid main menu choice!");
            }
        }
    }
}
