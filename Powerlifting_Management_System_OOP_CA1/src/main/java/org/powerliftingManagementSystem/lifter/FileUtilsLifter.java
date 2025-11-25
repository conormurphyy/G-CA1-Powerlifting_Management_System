package org.powerliftingManagementSystem.lifter;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtilsLifter {

    public static ArrayList<Lifter> readLiftersData(String fileName, String delimiter) {
        ArrayList<Lifter> lifters = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.isEmpty()) continue;

                String[] parts = line.split(delimiter);

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String clubName = parts[2];
                char gender = parts[3].charAt(0);
                double bodyweight = Double.parseDouble(parts[4]);
                String dateOfBirth = parts[5];
                boolean isSponsored = Boolean.parseBoolean(parts[6]);
                LocalDate dob = Lifter.parseDateOfBirth(dateOfBirth);

                int age = Lifter.calculateAge(dob);
                String ageClass = Lifter.findAgeClass(age);
                String weightClass = Lifter.findWeightClass(bodyweight, gender);

                Lifter lifter = new Lifter();
                lifter.setId(id);
                lifter.setName(formatName(name));
                lifter.setClubName(formatName(clubName));
                lifter.setGender(gender);
                lifter.setBodyweight(bodyweight);
                lifter.setDateOfBirth(dob);
                lifter.setSponsored(isSponsored);
                lifter.setAge(age);
                lifter.setWeightClass(weightClass);
                lifter.setAgeClass(ageClass);

                lifters.add(lifter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return null;
        }

        return lifters;
    }


    public static String formatName(String name){
        name=name.trim().toLowerCase();
        String[] parts =name.split("\\s+");
        String finalName="";
        for(String part:parts) {
            finalName+= part.substring(0,1).toUpperCase()+ part.substring(1)+" ";
        }
        return finalName;
    }
}
