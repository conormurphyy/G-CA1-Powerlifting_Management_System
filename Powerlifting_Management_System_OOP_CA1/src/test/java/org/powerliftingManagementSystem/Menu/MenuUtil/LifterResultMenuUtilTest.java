package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
import org.powerliftingManagementSystem.Menu.LifterResultMenu;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LifterResultMenuUtilTest {

    @Test
    void printLiftersInCompResults() {
        ArrayList<LifterResult> lifterResultMenuArrayList = new ArrayList<>();

        Lifter lifter = new Lifter(1);

        LifterResult result = new LifterResult(lifter, 120.0, 120.0, 120.0, 120.0, 233.0);

        lifterResultMenuArrayList.add(result);

        LifterResultMenuUtil.printLiftersInCompResults(lifterResultMenuArrayList);
    }

    @Test
    void lifterResultMenu() {
        LifterResultMenuUtil.lifterResultMenu();
    }

    @Test
    void exitToLifterResultMenu() {
        LifterResultMenuUtil.exitToLifterResultMenu();
    }
}