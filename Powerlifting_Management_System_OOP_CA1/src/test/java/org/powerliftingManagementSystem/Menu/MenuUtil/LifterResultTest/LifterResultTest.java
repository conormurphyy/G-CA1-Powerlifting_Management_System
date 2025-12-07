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
    @Test

        void testGetters()
        {
            LocalDate dob = LocalDate.of(1990, 1, 1);
            Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
            LifterResult lifterResult = new LifterResult(1,123.39,237.12,139.12,420.12,200);
            Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
            lifterResult.setLifter(lifter);

            int expectedID=1;
            int actualID = lifterResult.getId();
            assertEquals(expectedID,actualID);

            double expectedSquat =123.39;
            double actualSquat = lifterResult.getSquat();
            assertEquals(expectedSquat,actualSquat);

            double expectedBench=237.12;
            double actualBench =lifterResult.getBench();
            assertEquals(expectedBench,actualBench);

            double expectedDeadlift = 139.12;
            double actualDeadlift = lifterResult.getDeadlift();
            assertEquals(expectedDeadlift,actualDeadlift);

            double expectedDots=lifterResult.calculateDots();
            double actualDots = lifterResult.getDots();
            assertEquals(expectedDots,actualDots);

            double expectedTotal=expectedSquat+expectedBench+expectedDeadlift;
            double actualTotal = lifterResult.getTotal();
            assertEquals(expectedTotal,actualTotal);
        }
        @Test
    void testSetters()
        {
            LocalDate dob = LocalDate.of(1990, 1, 1);
            Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
            LifterResult lifterResult = new LifterResult(1,123.39,237.12,139.12,420.12,200);
            Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
            lifterResult.setLifter(lifter);

            double expectedSquat=125.0;
            lifterResult.setSquat(125.0);
            assertEquals(expectedSquat,lifterResult.getSquat());

            double expectedBench=125.0;
            lifterResult.setBench(125.0);
            assertEquals(expectedBench,lifterResult.getBench());

            double expectedDeadlift=125.0;
            lifterResult.setDeadlift(125.0);
            assertEquals(expectedDeadlift,lifterResult.getDeadlift());

            int expectedPlacement=100;
            lifterResult.setPlacement(100);
            assertEquals(expectedPlacement,lifterResult.getPlacement());

        }
    }




