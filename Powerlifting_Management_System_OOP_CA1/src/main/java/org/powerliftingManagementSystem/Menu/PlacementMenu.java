package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.LifterResult.Placement;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.*;

public class PlacementMenu {
    public static void run() throws FileNotFoundException {
        new PlacementMenu().start();
    }
    private void start() throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Competition ID");
        int compID = keyboard.nextInt();

        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");

        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");

        Competition.assignLiftersToCompetition(lifters, competitions);

        ArrayList<LifterResult> lifterResult = readCompetitionResults("lifterResults.csv", ",");
        Lifter.assignResultsToLifter(lifterResult, lifters);


        Competition selectedComp = null;

        for (Competition c : competitions) {
            if (c.getId() == compID) {
                selectedComp = c;
                break;
            }
        }

        Placement.calculatePlacement(selectedComp, lifterResult);

    }
}
