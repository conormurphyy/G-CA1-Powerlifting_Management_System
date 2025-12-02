package org.powerliftingManagementSystem;

import org.powerliftingManagementSystem.competition.Competition;
import org.powerliftingManagementSystem.lifter.Lifter;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils {
    public static String [] readLiftersEquipment(String fileName, String delimiter, int lifterID) {
        //reads equiptment based on id

        String[] equipment = {};
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(delimiter);

                if (Integer.parseInt(parts[0]) == lifterID) {
                    equipment = new String[]{
                            parts[0],
                            parts[1],
                            parts[2],
                            parts[3],
                            parts[4],
                            parts[5],
                            parts[6],
                            parts[7]
                    };
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return equipment;
    }

    public static ArrayList<Lifter> readLiftersData(String fileName, String delimiter) {
        ArrayList<Lifter> lifters = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                if(line.isEmpty()) continue;

                String[] parts = line.split(delimiter);

                int id = Integer.parseInt(parts[0]);
                String [] equipmentUsed = readLiftersEquipment("lifterEquipment.csv", ",",id);
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
                lifter.setEquipmentUsedType(equipmentUsed);
                lifter.setAgeClass(ageClass);

                lifters.add(lifter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return null;
        }

        return lifters;
    }

    public static ArrayList<Competition> readCompetitionsData(String filename, String delimiter) throws FileNotFoundException {
        ArrayList<Competition> competitions = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.isEmpty()) continue;
                String[] parts = line.split(delimiter);
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String location = parts[2];
                String date = parts[3];


                Competition comp = new Competition(id,name,location,date,new ArrayList<>());
                competitions.add(comp);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return competitions;
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
