package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.io.FileNotFoundException;
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

        }
    }
}
