package org.powerliftingManagementSystem.Menu.MenuUtil.Lifter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.powerliftingManagementSystem.Lifter.Lifter.assignResultsToLifter;

class LifterTest {



    @Test
    void testGetters() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
        int expectedID = 1;
        int actualID = lifter.getId();
        assertEquals(expectedID,actualID);

        String expectedName = "Mark John";
        String actualName = lifter.getName();
        assertEquals(expectedName,actualName);

        String expectedClubName = "Strong Men";
        String actualClubName = lifter.getClubName();
        assertEquals(expectedClubName,actualClubName);

        char expectedGender = 'M';
        char actualGender = lifter.getGender();
        assertEquals(expectedGender,actualGender);

        double expectedWeight = 101.08;
        double actualWeight = lifter.getBodyweight();
        assertEquals(expectedWeight,actualWeight);

        LocalDate expectedDate = LocalDate.of(1990, 1, 1);
        LocalDate actualDate = lifter.getDateOfBirth();
        assertEquals(expectedDate,actualDate);

        boolean expectedIsSponsored = false;
        boolean actualIsSponsored = lifter.isSponsored();
        assertEquals(expectedIsSponsored,actualIsSponsored);

        int expectedAge = 19;
        int actualAge = lifter.getAge();
        assertEquals(expectedAge,actualAge);

        String expectedAgeClass = "Junior";
        String actualAgeClass = lifter.getAgeClass();
        assertEquals(expectedAgeClass,actualAgeClass);

        Equipment expectedEquipment = equipment;
        Equipment actualEquipment = lifter.getEquipment();
        assertEquals(expectedEquipment,actualEquipment);

        String expectedWeightClass = "U-83 Men";
        String actualWeightClass = lifter.getWeightClass();
        assertEquals(expectedWeightClass,actualWeightClass);
    }

    @Test
    void testSetters() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");

        int expectedId = 2;
        lifter.setId(2);
        int actualId = lifter.getId();
        assertEquals(expectedId,actualId);

        String expectedName = "Mark John";
        lifter.setName(expectedName);
        String actualName = lifter.getName();
        assertEquals(expectedName,actualName);

    }

    @Test
    void parseDOBTest() {
        String dob = "01-01-1999";
        LocalDate expectedDOB = LocalDate.of(1999, 1, 1);
        LocalDate actualDOB = Lifter.parseDateOfBirth(dob);
        assertEquals(expectedDOB,actualDOB);
    }

    @Test
    void toStringTest() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");

        String expected = "Lifter{id=1, name='Mark John', clubName='Strong Men', gender='M', bodyweight=101.08, weightClass='U-83 Men', dateOfBirth=1990-01-01, isSponsored=false, age=19, ageClass='Junior'}";
        String actual = lifter.toString();
        assertEquals(expected,actual);
    }

    //#region findAge() Tests:
    //#region Test 1: findAge(): Valid Age and Valid Date
    @Test
    void findAge_validAge() {
        LocalDate dateOfBirth = LocalDate.of(2006, 5, 1); // //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        int expectedAge = Period.between(dateOfBirth, LocalDate.now()).getYears(); // //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        assertEquals(expectedAge, Lifter.calculateAge(dateOfBirth));
    }
    //#endregion

    //#region Test 2: findAge() : Age under 13
    @Test
    void findAge_under13() {
        // age = 12
        LocalDate dateOfBirth = LocalDate.of(2013, 5, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.calculateAge(dateOfBirth);
        });
    }
    //#endregion

    //#region Test 3: findAge(): Invalid/Future Date
    @Test
    void findAge_futureDate() {
        LocalDate dateOfBirth = LocalDate.of(2050, 1, 1);
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.calculateAge(dateOfBirth);
        });
    }
    //#endregion
    //#endregion

    //#region findAgeClass() Tests:

    // (Theoretically this method should never fail since we have through throws exceptions in our findAge() method,
    // there should already be a valid age being passed into this method but we added futher testing in case of error)
    @Test
    void findAgeClass_ValidAge() {
        int age = 12;
        String expectedClass = "Junior";
        String actual = Lifter.findAgeClass(19);
        assertEquals(expectedClass, actual);

    }

    @Test
    void findAgeClass_Under13() {
        int age = 13;
        assertDoesNotThrow(() -> {
            Lifter.findAgeClass(age);
        });

    }

    @Test
    void findAgeClass_MissingAge() {
        int age = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.findAgeClass(age);
        });

    }

    @Test
    void findAgeClass_HugeAge() {
        int age = 200;
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.findAgeClass(age);
        });
    }
    //#endregion

    //#region findWeightClass() Tests:
    //#region Invalid inputs
    @Test
    void findWeightClass_InvalidWeight1() {
        double weight = -1;
        char gender = 'M';
        assertThrows(IllegalArgumentException.class, () -> Lifter.findWeightClass(weight, gender));
    }

    @Test
    void findWeightClass_InvalidWeight2() {
        double weight = 1000.00;
        char gender = 'F';
        assertThrows(IllegalArgumentException.class, () -> Lifter.findWeightClass(weight, gender));
    }

    @Test
    void findWeightClass_InvalidGender() {
        double weight = 70.00;
        char gender = 'X';
        assertThrows(IllegalArgumentException.class, () -> Lifter.findWeightClass(weight, gender));
    }

    @Test
    void findWeightClass_InvalidAge_InvalidGender() {
        double weight = -1;
        char gender = 'a';
        assertThrows(IllegalArgumentException.class, () -> Lifter.findWeightClass(weight, gender));
    }
    //#endregion

    //#region Male weight classes
    @Test
    void findWeightClass_Valid_U59_Male() {
        double weight = 58.9;
        char gender = 'M';
        String expectedClass = "U-59KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U66_Male() {
        double weight = 59.00;
        char gender = 'M';
        String expectedClass = "U-66KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U74_Male() {
        double weight = 66.00;
        char gender = 'M';
        String expectedClass = "U-74KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U83_Male() {
        double weight = 74.00;
        char gender = 'M';
        String expectedClass = "U-83KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U93_Male() {
        double weight = 83.00;
        char gender = 'M';
        String expectedClass = "U-93KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U105_Male() {
        double weight = 93.00;
        char gender = 'M';
        String expectedClass = "U-105KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U120_Male() {
        double weight = 105.00;
        char gender = 'M';
        String expectedClass = "U-120KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_120Plus_Male() {
        double weight = 120.00;
        char gender = 'M';
        String expectedClass = "120KG+ Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }
    //#endregion

    //#region Female weight classes
    @Test
    void findWeightClass_Valid_U47_Female() {
        double weight = 46.9;
        char gender = 'F';
        String expectedClass = "U-47KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U52_Female() {
        double weight = 47.00;
        char gender = 'F';
        String expectedClass = "U-52KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U59_Female() {
        double weight = 52.00;
        char gender = 'F';
        String expectedClass = "U-59KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U63_Female() {
        double weight = 59.00;
        char gender = 'F';
        String expectedClass = "U-63KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U69_Female() {
        double weight = 63.00;
        char gender = 'F';
        String expectedClass = "U-69KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U76_Female() {
        double weight = 69.00;
        char gender = 'F';
        String expectedClass = "U-76KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U84_Female() {
        double weight = 76.00;
        char gender = 'F';
        String expectedClass = "U-84KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_84Plus_Female() {
        double weight = 84.00;
        char gender = 'F';
        String expectedClass = "84KG+ Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void assignResultsToLifterTest() {
        Lifter lifter1 = new Lifter(1);
        LifterResult lifterResult1 = new LifterResult(1);
        ArrayList<Lifter> lifter = new ArrayList<>();
        ArrayList<LifterResult> lifterResult = new ArrayList<>();
        lifter.add(lifter1);
        lifterResult.add(lifterResult1);
        assignResultsToLifter(lifterResult,lifter);
    }

    @Test
    void testEqualsAndHashCode() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter1 = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");

        LocalDate dob2 = LocalDate.of(1990, 1, 1);
        Equipment equipment2 = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter2 = new Lifter (2,"Sarah","Cool Club",'F',101.08,dob2,false,19,"Junior",equipment2,"U-83 Men");

        LocalDate dob3 = LocalDate.of(1990, 1, 1);
        Equipment equipment3 = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        Lifter lifter3 = new Lifter (3,"Bob","SClub",'M',101.08,dob3,false,19,"Junior",equipment3,"U-83 Men");

        assertEquals(lifter1, lifter1);
        assertEquals(lifter1.hashCode(), lifter1.hashCode());

        assertNotEquals(lifter1, lifter2);
        assertNotEquals(lifter1.hashCode(), lifter2.hashCode());

        assertNotEquals(lifter1, lifter3);
        assertNotEquals(lifter1.hashCode(), lifter3.hashCode());

    }







    //#endregion
    //#endregion
}





