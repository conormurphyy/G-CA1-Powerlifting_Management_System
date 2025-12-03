package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.competition.Competition;
import org.powerliftingManagementSystem.competition.CompetitionResult;
import org.powerliftingManagementSystem.leaderboard.sortLifterDots;
import org.powerliftingManagementSystem.lifter.Lifter;
import org.powerliftingManagementSystem.menu.Menu;
import org.powerliftingManagementSystem.menu.MenuUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.powerliftingManagementSystem.FileUtils.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");
        //Menu.menuOptions(lifters);
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");

        Competition.assignLiftersToCompetition(lifters, competitions);

        ArrayList<CompetitionResult> lifterResult = readCompetitionResults("lifterResults.csv", ",");

        Lifter.assignResultsToLifter(lifterResult, lifters);

        MenuUtil.printLiftersInCompResults(lifterResult);

        lifterResult.sort(new sortLifterDots());
        MenuUtil.printTop3Dots(lifterResult);
        MenuUtil.printTop3DeadLift(lifterResult);

    }
}