package org.powerliftingManagementSystem.Equipment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {
    @Test
    void getandSetEquiptmentTest() {
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD", "SBD","SBD","Nike");

        equipment.setId(2);
        equipment.setBelt("A7");
        equipment.setSinglet("A7");
        equipment.setCompTee("A7");
        equipment.setWristWraps("A7");
        equipment.setKneeSleeves("A7");
        equipment.setDeadliftSocks("A7");
        equipment.setSocks("A7");
        equipment.setShoes("Notorious Lift");
        int expectedID = 2;
        int actualID = equipment.getId();
        assertEquals(expectedID,actualID);

        String expectedBelt = "A7";
        String actualBelt = equipment.getBelt();
        assertEquals(expectedBelt,actualBelt);

        String expectedSinglet = "A7";
        String actualSinglet = equipment.getSinglet();
        assertEquals(expectedSinglet,actualSinglet);

        String expectedTee = "A7";
        String actualTee = equipment.getCompTee();
        assertEquals(expectedTee,actualTee);

        String expectedWristWraps = "A7";
        String actualWristWraps = equipment.getWristWraps();
        assertEquals(expectedWristWraps,actualWristWraps);

        String expectedKneeSleeves = "A7";
        String actualKneeSleeves = equipment.getKneeSleeves();
        assertEquals(expectedKneeSleeves,actualKneeSleeves);

        String expectedCoolSocks = "A7";
        String actualSocks = equipment.getSocks();
        assertEquals(expectedCoolSocks,actualSocks);

        String expectedDLSocks = "A7";
        String actualDLSocks = equipment.getDeadliftSocks();
        assertEquals(expectedDLSocks,actualDLSocks);

        String expectedShoes = "Notorious Lift";
        String actualShoes = equipment.getShoes();
        assertEquals(expectedShoes,actualShoes);

        equipment.setId(2);




    }
}