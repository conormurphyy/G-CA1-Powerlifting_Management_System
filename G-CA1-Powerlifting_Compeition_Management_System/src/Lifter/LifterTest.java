package Lifter;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class LifterTest {
    //#region findAge() Tests:
    //#region Test 1: findAge(): Valid Age and Valid Date
    @Test
    void findAge_validAge() {
        LocalDate dateOfBirth = LocalDate.of(2006, 5, 1);
        int expectedAge = Period.between(dateOfBirth, LocalDate.now()).getYears();
        assertEquals(expectedAge, Lifter.calculateAge(dateOfBirth));
    }
    //#endregion

    //#region Test 2: findAge() : Age under 13
    @Test
    void findAge_under13() {
        // 12 years old
        LocalDate dateOfBirth = LocalDate.of(2013, 5, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.calculateAge(dateOfBirth);
        });
    }
    //#endregion

    //#region Test 3: findAge(): Invalid/Future Date
    @Test
    void findAge_futureDate() {
        LocalDate futureDate = LocalDate.of(2050, 1, 1);
        assertThrows(IllegalArgumentException.class, () -> {
            Lifter.calculateAge(futureDate);
        });
    }
    //#endregion
    //#endregion

    //#region findAgeClass() Tests:

    // (Theoretically this method should never fail since we have through throws exceptions in our findAge() method,
    // there should already be a valid age being passed into this method but we added futher testing in case of error)
    @Test
    void findAgeClass_ValidAge() {
        int age = 19;
        String expectedClass = "Junior";
        String actual = Lifter.findAgeClass(19);
        assertEquals(expectedClass, actual);

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
        double weight = 70;
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
        double weight = 59;
        char gender = 'M';
        String expectedClass = "U-66KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U74_Male() {
        double weight = 66;
        char gender = 'M';
        String expectedClass = "U-74KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U83_Male() {
        double weight = 74;
        char gender = 'M';
        String expectedClass = "U-83KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U93_Male() {
        double weight = 83;
        char gender = 'M';
        String expectedClass = "U-93KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U105_Male() {
        double weight = 93;
        char gender = 'M';
        String expectedClass = "U-105KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U120_Male() {
        double weight = 105;
        char gender = 'M';
        String expectedClass = "U-120KG Men";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_120Plus_Male() {
        double weight = 120;
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
        double weight = 47;
        char gender = 'F';
        String expectedClass = "U-52KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U59_Female() {
        double weight = 52;
        char gender = 'F';
        String expectedClass = "U-59KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U63_Female() {
        double weight = 59;
        char gender = 'F';
        String expectedClass = "U-63KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U69_Female() {
        double weight = 63;
        char gender = 'F';
        String expectedClass = "U-69KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U76_Female() {
        double weight = 69;
        char gender = 'F';
        String expectedClass = "U-76KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_U84_Female() {
        double weight = 76;
        char gender = 'F';
        String expectedClass = "U-84KG Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }

    @Test
    void findWeightClass_Valid_84Plus_Female() {
        double weight = 84;
        char gender = 'F';
        String expectedClass = "84KG+ Women";
        String actual = Lifter.findWeightClass(weight, gender);
        assertEquals(expectedClass, actual);
    }
    //#endregion
    //#endregion
}





