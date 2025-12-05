package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Lifter.LifterSort;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readLiftersData;

public class LifterMenu {
    public static void run() {
        new LifterMenu().start();
    }

    public void start() {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv", ",");

        Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            //Call Options here
            try {
                LifterMenuUtil.lifterMenu();
                System.out.print("Enter Option: ");
                int input = keyboard.nextInt();

                switch (input) {
                    //Name
                    case 1:
                        boolean ascDecMenu = true;
                        while (ascDecMenu) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                handleName(lifters, inputName);
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Invalid Option");
                                keyboard.nextLine();
                            }
                        }
                        break;
                        //ClubName
                    case 2:
                        boolean ascDecMenu2 = true;
                        while (ascDecMenu2) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputClubName = keyboard.nextInt();
                                handleClubName(lifters, inputClubName);
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Invalid Option");
                                keyboard.nextLine();
                            }
                        }
                        break;
                    case 3:
                        boolean ascDecMenu3 = true;
                        while (ascDecMenu3) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputAge = keyboard.nextInt();
                                handleAge(lifters, inputAge);
                                break;
                            }
                            catch (Exception e) {
                            System.out.println("Invalid Option");}
                            keyboard.nextLine();
                        }
                        break;
                    case 4:
                        boolean ascDecMenu4 = true;
                        while (ascDecMenu4) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputBodyweight = keyboard.nextInt();
                                handleBodyweight(lifters, inputBodyweight);
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Invalid Option");
                                keyboard.nextLine();
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Exit");
                        isRunning = false;
                    default:
                        System.out.println("Invalid Option");
                }
            }
            catch (Exception e) {
                System.out.println("error");
                keyboard.nextLine();
            }
        }
    }

    private void handleName(ArrayList<Lifter> lifters, int ascDesc) {

        switch (ascDesc) {
            case 1:
                lifters.sort(LifterSort.sortNameAscending);
                LifterMenuUtil.printLifters(lifters);
                break;
            case 2:
                lifters.sort(LifterSort.sortNameDescending);
                LifterMenuUtil.printLifters(lifters);
                break;
        }
    }

    private void handleClubName(ArrayList<Lifter> lifters, int ascDesc) {

        switch (ascDesc) {
            case 1:
                lifters.sort(LifterSort.sortClubNameAscending);
                LifterMenuUtil.printLifters(lifters);
                break;
            case 2:
                lifters.sort(LifterSort.sortClubNameDescending);
                LifterMenuUtil.printLifters(lifters);
                break;
        }
    }

    private void handleAge(ArrayList<Lifter> lifters, int ascDesc) {

        switch (ascDesc) {
            case 1:
                lifters.sort(LifterSort.sortAgeAscending);
                LifterMenuUtil.printLifters(lifters);
                break;
            case 2:
                lifters.sort(LifterSort.sortAgeDescending);
                LifterMenuUtil.printLifters(lifters);
                break;
        }
    }

    private void handleBodyweight(ArrayList<Lifter> lifters, int ascDesc) {

        switch (ascDesc) {
            case 1:
                lifters.sort(LifterSort.sortBodyweightAscending);
                LifterMenuUtil.printLifters(lifters);
                break;
            case 2:
                lifters.sort(LifterSort.sortBodyweightDescending);
                LifterMenuUtil.printLifters(lifters);
                break;
        }
    }

}
