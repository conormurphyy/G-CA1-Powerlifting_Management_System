package org.powerliftingManagementSystem.Menu.MenuUtil.LifterResultTest;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LifterResultTest {

    @Test
    void totalCalculation() {
        LifterResult lifterTest = new LifterResult(1, 212.5, 130, 255,0,0);
        double expectedTotal = 212.5 + 130 + 255;
        double actualTotal = lifterTest.getTotal();
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    void dotCalculationMale() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
        LifterResult lifterTest = new LifterResult(lifter, 212.50, 130.00, 255.00,0.0,0.0);
        double expectedDots = 53.533293342657075;
        double actualDots = lifterTest.calculateDots();
        assertEquals(expectedDots, actualDots);
    }

    @Test
    void dotCalculationFemale() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'F',101.08,dob,false,19,"Junior",equipment,"U-84+ Female");
        LifterResult lifterTest = new LifterResult(lifter, 120.00, 50.00, 200.00,0.0,0.0);
        double expectedDots = 314.43177019435325;
        double actualDots = lifterTest.calculateDots();
        assertEquals(expectedDots, actualDots);
    }




}