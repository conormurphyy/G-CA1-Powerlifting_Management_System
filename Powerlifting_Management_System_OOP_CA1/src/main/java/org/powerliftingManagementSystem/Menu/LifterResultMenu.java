package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.LifterResultSort;
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
                System.out.println("Enter Option");
                int input  = Keyboard.nextInt();

                switch (input)
                {
                    case 1:
                        boolean ascDescMenu = true;
                        while (ascDescMenu) {
                            try{
                                MenuUtil.sortingMenu1();
                                int inputName = Keyboard.nextInt();
                                handleDots(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Invalid Option");
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 2:
                        boolean ascDescMenu2 = true;
                        while (ascDescMenu2) {
                            try{
                                MenuUtil.sortingMenu1();
                                int inputName = Keyboard.nextInt();
                                handleTotal(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Invalid Option");
                                Keyboard.nextLine();
                            }
                        }

                        break;
                    case 3:
                        boolean ascDescMenu3 = true;
                        while (ascDescMenu3) {
                            try{
                                MenuUtil.sortingMenu1();
                                int inputName = Keyboard.nextInt();
                                handleSquat(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Invalid Option");
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 4:
                        boolean ascDescMenu4 = true;
                        while (ascDescMenu4) {
                            try{
                                MenuUtil.sortingMenu1();
                                int inputName = Keyboard.nextInt();
                                handleBench(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Invalid Option");
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 5:
                        boolean ascDescMenu5 = true;
                        while (ascDescMenu5) {
                            try{
                                MenuUtil.sortingMenu1();
                                int inputName = Keyboard.nextInt();
                                handleDeadlift(lifterResult,inputName);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Invalid Option");
                                Keyboard.nextLine();
                            }
                        }
                        break;
                    case 0:
                    {
                        System.out.println("Exit");
                        isRunning = false;
                    }
                        default:
                            System.out.println("Invalid Option");

                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
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
        }
    }

}
