package org.powerliftingManagementSystem.Menu.MenuUtil.LifterResultTest;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;
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
        Lifter newLifter = new Lifter(123123123,"Conor McHugh", 'M', 80.00);
        LifterResult lifterTest = new LifterResult(newLifter, 212.50, 130.00, 255.00,0.0,0.0);
        double expectedDots = 76.87525064903356;
        double actualDots = lifterTest.calculateDots();
        assertEquals(expectedDots, actualDots);
    }

    @Test
    void dotCalculationFemale() {
        Lifter newLifter = new Lifter(123,"Sarah John", 'F', 72.1);
        LifterResult lifterTest = new LifterResult(newLifter, 120.00, 50.00, 200.00,0.0,0.0);
        double expectedDots = 368.0918468881794;
        double actualDots = lifterTest.calculateDots();
        assertEquals(expectedDots, actualDots);
    }



}