package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;
import org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.ErrorMessage;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterResultMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readCompetitionResults;
import static org.powerliftingManagementSystem.FileUtil.FileUtils.readLiftersData;

public class LifterResultMenu {
    public static void run() throws FileNotFoundException {
        new LifterResultMenu().start();
    }
    private void start() throws FileNotFoundException {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");
        ArrayList<LifterResult> lifterResult = readCompetitionResults("lifterResults.csv", ",");
        Lifter.assignResultsToLifter(lifterResult, lifters);

        Scanner Keyboard = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            try{
                LifterResultMenuUtil.lifterResultMenu();
                System.out.print("Enter Option: ");
                int input  = Keyboard.nextInt();

                switch (input)
                {
                    case 1:
                        boolean ascDescMenu = true;
                        while (ascDescMenu) {
                            try{
                                MenuUtil.sortingAscDec();
                                int inputName = Keyboard.nextInt();
                                handleDots(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                ErrorMessage.invalidInput();
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 2:
                        boolean ascDescMenu2 = true;
                        while (ascDescMenu2) {
                            try{
                                MenuUtil.sortingAscDec();
                                int inputName = Keyboard.nextInt();
                                if (inputName == 1 || inputName == 2 || inputName == 0) {
                                    handleTotal(lifterResult,inputName);
                                    ascDescMenu2 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e){
                                ErrorMessage.invalidInput();
                                Keyboard.nextLine();
                            }
                        }

                        break;
                    case 3:
                        boolean ascDescMenu3 = true;
                        while (ascDescMenu3) {
                            try{
                                MenuUtil.sortingAscDec();
                                int inputName = Keyboard.nextInt();
                                if (inputName == 1 || inputName == 2 || inputName == 0) {
                                    handleSquat(lifterResult,inputName);
                                    ascDescMenu3 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e){
                                ErrorMessage.invalidInput();
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 4:
                        boolean ascDescMenu4 = true;
                        while (ascDescMenu4) {
                            try{
                                MenuUtil.sortingAscDec();
                                int inputName = Keyboard.nextInt();
                                if (inputName == 1 || inputName == 2 || inputName == 0) {
                                    handleBench(lifterResult,inputName);
                                    ascDescMenu4 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e){
                                ErrorMessage.invalidInput();
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 5:
                        boolean ascDescMenu5 = true;
                        while (ascDescMenu5) {
                            try{
                                MenuUtil.sortingAscDec();
                                int inputName = Keyboard.nextInt();
                                if (inputName == 1 || inputName == 2 || inputName == 0) {
                                    handleDeadlift(lifterResult,inputName);
                                    ascDescMenu5 = false;
                                }
                                else {
                                    ErrorMessage.ascDesc();
                                }
                            }
                            catch (Exception e){
                                ErrorMessage.invalidInput();
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 6:
                        //search by name
                    case 7:
                        //search by clubname
                    case 0:
                    {

                        MenuUtil.ExitToMainMenu();
                        isRunning = false;
                    }
                        default:
                            ErrorMessage.invalidInput();

                }
            }
            catch(Exception e)
            {
                ErrorMessage.error();
                Keyboard.nextLine();
            }

        }
    }
    private void handleDots (ArrayList<LifterResult> lifterResults, int ascDesc)
    {
        switch (ascDesc) {
            case 1:
            lifterResults.sort(LifterResultSort.byDotsAsc);
            LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
            break;
            case 2:
            lifterResults.sort(LifterResultSort.byDotsDesc);
            LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
            break;
            case 0:
                LifterResultMenuUtil.exitToLifterResultMenu();
                break;
        }
    }
    private void handleTotal (ArrayList<LifterResult> lifterResults, int ascDesc)
    {
        switch (ascDesc) {
            case 1:
                lifterResults.sort(LifterResultSort.byTotalAsc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 2:
                lifterResults.sort(LifterResultSort.byTotalDesc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 0:
                LifterResultMenuUtil.exitToLifterResultMenu();
                break;
        }
    }
    private void handleSquat (ArrayList<LifterResult> lifterResults, int ascDesc)
    {
        switch (ascDesc) {
            case 1:
                lifterResults.sort(LifterResultSort.bySquatAsc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 2:
                lifterResults.sort(LifterResultSort.bySquatDesc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 0:
                LifterResultMenuUtil.exitToLifterResultMenu();
                break;
        }
    }
    private void handleBench (ArrayList<LifterResult> lifterResults, int ascDesc)
    {
        switch (ascDesc) {
            case 1:
                lifterResults.sort(LifterResultSort.byBenchAsc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 2:
                lifterResults.sort(LifterResultSort.byBenchDesc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 0:
                LifterResultMenuUtil.exitToLifterResultMenu();
                break;
        }
    }
    private void handleDeadlift (ArrayList<LifterResult> lifterResults, int ascDesc)
    {
        switch (ascDesc) {
            case 1:
                lifterResults.sort(LifterResultSort.byDeadliftAsc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 2:
                lifterResults.sort(LifterResultSort.byDeadliftDesc);
                LifterResultMenuUtil.printLiftersInCompResults(lifterResults);
                break;
            case 0:
                LifterResultMenuUtil.exitToLifterResultMenu();
                break;
        }
    }

}
