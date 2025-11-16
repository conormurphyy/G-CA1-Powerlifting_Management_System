package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.lifter.Lifter;

import java.util.ArrayList;

import static org.powerliftingManagementSystem.lifter.FileUtilsLifter.readLiftersData;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");

        Menu.menuOptions(lifters);
        long end = System.currentTimeMillis();
        System.out.println("Counting to 10000000 takes " +
                (end - start) + "ms");
    }
}