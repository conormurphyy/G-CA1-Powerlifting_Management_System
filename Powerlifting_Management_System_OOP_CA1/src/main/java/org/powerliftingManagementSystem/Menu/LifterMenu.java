package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.FileUtil.FileUtils;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Lifter.LifterSort;
import org.powerliftingManagementSystem.Menu.MenuUtil.ErrorMessage;
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
                                if(inputName==1 || inputName==2 || inputName==0){
                                    handleName(lifters, inputName);
                                    ascDecMenu = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e) {
                                ErrorMessage.ascDesc();
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
                                if (inputClubName==1 || inputClubName==2  || inputClubName==0) {
                                    handleClubName(lifters, inputClubName);
                                    ascDecMenu2 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e) {
                                ErrorMessage.ascDesc();
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
                                if (inputAge==1 || inputAge==2 || inputAge==0) {
                                    handleAge(lifters, inputAge);
                                    ascDecMenu3 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e) {
                                ErrorMessage.ascDesc();
                                keyboard.nextLine();
                            }
                        }
                        break;
                    case 4:
                        boolean ascDecMenu4 = true;
                        while (ascDecMenu4) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputBodyweight = keyboard.nextInt();
                                if (inputBodyweight==1 || inputBodyweight==2 || inputBodyweight==0) {
                                    handleBodyweight(lifters, inputBodyweight);
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e) {
                                ErrorMessage.ascDesc();
                                keyboard.nextLine();
                            }
                        }
                        break;
                    case 5:
                        handleNameSearch(lifters);
                        break;
                    case 6:
                        handleClubNameSearch(lifters);
                    case 0:
                        MenuUtil.ExitToMainMenu();
                        isRunning = false;
                    default:
                        ErrorMessage.invalidOptionLifterMenu();
                }
            }
            catch (Exception e) {
                ErrorMessage.error();
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
            case 0:
                LifterMenuUtil.exitToLifterMenu();
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
            case 0:
                LifterMenuUtil.exitToLifterMenu();
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
            case 0:
                LifterMenuUtil.exitToLifterMenu();
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
            case 0:
                LifterMenuUtil.exitToLifterMenu();
                break;
        }
    }
    private void handleNameSearch(ArrayList<Lifter> lifters)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter  name:");
        String name = keyboard.nextLine();
        ArrayList<Lifter> searchedLifter = new ArrayList<>();
        String iName;
        for (Lifter l : lifters)
        {
            iName =l.getName();
            iName = FileUtils.formatName(iName);
            name = FileUtils.formatName(name);
            if (iName.equals(name))
            {
                searchedLifter.add(l);
            }
        }
        LifterMenuUtil.printLifters(searchedLifter);
    }
    private void handleClubNameSearch(ArrayList<Lifter> lifters)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter club name:");
        String clubName = keyboard.nextLine();
        ArrayList<Lifter> searchedClub = new ArrayList<>();
        String iClubName;
        for (Lifter l : lifters)
        {
            iClubName =l.getClubName();
            iClubName = FileUtils.formatName(iClubName);
            clubName = FileUtils.formatName(clubName);
            if (iClubName.equals(clubName))
            {
                searchedClub.add(l);
            }
        }
        LifterMenuUtil.printLifters(searchedClub);
    }

}
