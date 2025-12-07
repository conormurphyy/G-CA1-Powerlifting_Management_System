package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LifterMenuUtilTest {

    @Test
    void printLifters() {
        ArrayList<Lifter> lifterArrayList = new ArrayList<>();
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
        lifterArrayList.add(lifter);
        LifterMenuUtil.printLifters(lifterArrayList);
    }

    @Test
    void printLiftersEquipment() {
        ArrayList<Lifter> lifterArrayList = new ArrayList<>();
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
        lifterArrayList.add(lifter);
        LifterMenuUtil.printLiftersEquipment(lifterArrayList);
    }

    @Test
    void lifterMenu() {
        LifterMenuUtil.lifterMenu();
    }

    @Test
    void exitToLifterMenu() {
        LifterMenuUtil.exitToLifterMenu();
    }
}