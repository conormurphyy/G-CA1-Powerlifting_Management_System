package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.lifter.Lifter;
import org.powerliftingManagementSystem.menu.Menu;

import java.util.ArrayList;

import static org.powerliftingManagementSystem.lifter.FileUtilsLifter.readLiftersData;

public class Main {
    public static void main(String[] args) {


        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv",",");

        Menu.menuOptions(lifters);

    }
}