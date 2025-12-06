package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.Placement;
import org.powerliftingManagementSystem.Menu.CompetitionMenu;
import org.powerliftingManagementSystem.Menu.LifterMenu;
import org.powerliftingManagementSystem.Menu.LifterResultMenu;
import org.powerliftingManagementSystem.Menu.MainMenu;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterResultMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MainMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        readFilesAndAssign();
        MainMenuUtil.welcome();
        MainMenu.run();
    }

    public static void readFilesAndAssign() throws FileNotFoundException {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");
        //Menu.menuOptions(lifters);
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");

        Competition.assignLiftersToCompetition(lifters, competitions);

        ArrayList<LifterResult> lifterResult = readCompetitionResults("lifterResults.csv", ",");
        Lifter.assignResultsToLifter(lifterResult, lifters);
    }
}