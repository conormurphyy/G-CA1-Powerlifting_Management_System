package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Leaderboard.sortLifterDots;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Menu.MenuUtil;
import org.powerliftingManagementSystem.Result.Result;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.powerliftingManagementSystem.FileUtils.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");
        //Menu.menuOptions(lifters);
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");

        Competition.assignLiftersToCompetition(lifters, competitions);

        ArrayList<Result> lifterResult = readCompetitionResults("lifterResults.csv", ",");

        Lifter.assignResultsToLifter(lifterResult, lifters);

        MenuUtil.printLiftersInCompResults(lifterResult);

        lifterResult.sort(new sortLifterDots());
        MenuUtil.printTop3Dots(lifterResult);
        MenuUtil.printTop3DeadLift(lifterResult);

    }
}