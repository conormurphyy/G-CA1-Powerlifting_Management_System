package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenuUtilTest {

    @Test
    void printLifterTable() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifters = new ArrayList<>();
        lifters.add(new Lifter(1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men"));
        MenuUtil.printLifterTable(lifters);
    }

    @Test
    void sortingAscDec() {
        MenuUtil.sortingAscDec();
    }

    @Test
    void exitToMainMenu() {
        MenuUtil.ExitToMainMenu();
    }

    @Test
    void exitProgram() {
        MenuUtil.ExitProgram();
    }
}