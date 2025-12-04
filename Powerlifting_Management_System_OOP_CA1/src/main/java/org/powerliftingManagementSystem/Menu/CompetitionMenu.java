package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionMenuUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readCompetitionsData;

public class CompetitionMenu {
    public static void run() throws FileNotFoundException {
        new CompetitionMenu().start();
    }
    private void start() throws FileNotFoundException {
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");
        CompetitionMenuUtil.printCompetitionsTable(competitions);

    }
}
