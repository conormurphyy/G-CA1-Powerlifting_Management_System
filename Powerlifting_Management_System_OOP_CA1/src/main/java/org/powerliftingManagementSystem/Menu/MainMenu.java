package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.Placement;
import org.powerliftingManagementSystem.Menu.MenuUtil.ErrorMessage;
import org.powerliftingManagementSystem.Menu.MenuUtil.MainMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil.printLifterTable;

public class MainMenu {
    public static void run() {
        new MainMenu().start();
    }
    private void start() {
        Scanner keyboard = new Scanner(System.in);
        boolean running = true;
        while (running) {
            MainMenuUtil.mainMenu();
            try {
                int mainMenuChoice = keyboard.nextInt();
                switch (mainMenuChoice) {
                    case 1:
                        LifterMenu.run();
                        break;
                    case 2:
                        CompetitionMenu.run();
                        break;
                    case 3:
                        LifterResultMenu.run();
                        break;
                    case 4:
                        LeaderboardMenu.run();
                        break;
                    case 5:
                        PlacementMenu.run();
                    case 0:
                        MenuUtil.ExitProgram();
                        running = false;
                    default:
                        ErrorMessage.invalidOptionLifterMenu();
                }
            }
            catch (InputMismatchException e) {
                ErrorMessage.invalidInput();
                keyboard.nextLine();
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found");;
            }
        }
    }


}
