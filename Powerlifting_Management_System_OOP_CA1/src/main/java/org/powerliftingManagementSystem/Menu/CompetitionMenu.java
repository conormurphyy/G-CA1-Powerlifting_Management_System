package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Competition.CompetitionSort;
import org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readCompetitionsData;

public class CompetitionMenu {
    public static void run() throws FileNotFoundException {
        new CompetitionMenu().start();
    }

    private void start() throws FileNotFoundException {
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");
        CompetitionMenuUtil.printCompetitionsTable(competitions);

        Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            try {
                CompetitionMenuUtil.competitionsMenu();
                System.out.print("Enter Option: ");
                int input = keyboard.nextInt();

                switch (input) {
                    case 1:
                        boolean ascDescMenu = true;
                        while (ascDescMenu) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                handleID(competitions, inputName);
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                                keyboard.nextLine();
                            }

                        }
                        break;
                    case 2:
                        boolean ascDescMenu2 = true;
                        while (ascDescMenu2) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                handleName(competitions, inputName);
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                                keyboard.nextLine();
                            }

                        }
                        break;
                    case 3:
                        boolean ascDescMenu3 = true;
                        while (ascDescMenu3) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                handleDate(competitions, inputName);
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                                keyboard.nextLine();
                            }
                            break;
                        }

                    case 0:
                        System.out.println("Exit");
                        isRunning = false;

                    default:
                        System.out.println("Invalid Input");
                }
            } catch (Exception e) {
                System.out.println("Error");
                keyboard.nextLine();
            }
        }
    }

    private void handleID(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortIdAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortIdDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }

    private void handleName(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortNameAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortNameDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }

    private void handleDate(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortDateAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortDateDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }

}
