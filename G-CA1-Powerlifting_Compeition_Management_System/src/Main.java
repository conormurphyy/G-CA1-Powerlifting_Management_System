import Lifter.Lifter;

import java.time.LocalDate;
import java.util.ArrayList;

import static Lifter.FileUtils.readLiftersData;

public class Main {
    public static void main(String[] args) {
        String dobString = "01-05-2005";
        LocalDate dob = Lifter.parseDateOfBirth(dobString);
        int age = Lifter.calculateAge(dob);

        Lifter lifter = new Lifter();
        lifter.setDateOfBirth(dob);
        lifter.setAge(age);

        System.out.println("Lifter.Lifter age: " + lifter.getAge() + "\nAge Class: " + lifter.findAgeClass(age));
        System.out.println(lifter);

        ArrayList<Lifter> lifters = readLiftersData("liftersData.csv", ',');

    }
}