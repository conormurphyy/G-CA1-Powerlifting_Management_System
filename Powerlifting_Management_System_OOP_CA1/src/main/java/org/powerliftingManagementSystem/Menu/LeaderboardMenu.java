package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Leaderboard.Leaderboard;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.ErrorMessage;
import org.powerliftingManagementSystem.Menu.MenuUtil.LeaderboardMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readCompetitionResults;
import static org.powerliftingManagementSystem.FileUtil.FileUtils.readLiftersData;

public class LeaderboardMenu {
    public static void run() throws FileNotFoundException {
        new LeaderboardMenu().start();
    }
    private void start() throws FileNotFoundException {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");
        ArrayList<LifterResult> lifterResult = readCompetitionResults("lifterResults.csv", ",");
        Lifter.assignResultsToLifter(lifterResult, lifters);
        Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            try {
                LeaderboardMenuUtil.leaderboardMenu();
                System.out.print("Enter Option: ");
                int input = keyboard.nextInt();

                switch (input) {
                    case 1:
                        Leaderboard.printTop3Dots(lifterResult);
                        break;
                    case 2:
                        Leaderboard.printTop3Total(lifterResult);
                        break;
                    case 3:
                        Leaderboard.printTop3Squat(lifterResult);
                        break;

                    case 4:
                        Leaderboard.printTop3Bench(lifterResult);
                        break;
                    case 5:
                        Leaderboard.printTop3DeadLift(lifterResult);
                        break;
                    case 0:
                        MenuUtil.ExitToMainMenu();
                        isRunning = false;
                        break;

                    default:
                        ErrorMessage.invalidOptionLeaderboardMenu();
                }
                break;
            } catch (Exception e) {
                ErrorMessage.error();
                keyboard.nextLine();
            }
        }
    }
}

