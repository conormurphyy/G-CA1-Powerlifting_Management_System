package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.Lifter.LifterSort;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readLiftersData;

public class LifterMenu {
    public static void run() {
        System.out.println("Menu");
        new LifterMenu().start();
        System.out.println("end");

    }
    private void start() {
        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");

        Scanner keyboard = new Scanner(System.in);
        boolean isRunning  = true;
        while (isRunning) {
            try {
                int input = keyboard.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("Ascending or Descending?");
                        int ascDesc = keyboard.nextInt();
                        switch (ascDesc) {
                            case 1:
                                lifters.sort(LifterSort.sortNameAscending);
                                LifterMenuUtil.printLifters(lifters);
                                break;
                        }
                    case 0:
                        System.out.println("Exit");
                        isRunning = false;
                }
            }
            catch (Exception e)
            {
                System.out.println("error");
                break;
            }
    }}
}
