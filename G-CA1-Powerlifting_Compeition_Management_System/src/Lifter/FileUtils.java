package Lifter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils {

    public static ArrayList<Lifter> readLiftersData(String fileName, char delimiter) {
        if (fileName == null) {
            throw new IllegalArgumentException("fileName is null");
        }

        ArrayList<Lifter> lifters = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = formatName(parts[1]);
                String clubName = parts[2];
                char gender = (parts[3]).charAt(0);
                double bodyweight = Double.parseDouble(parts[4]);
                String dateOfBirth = parts[5];
                boolean isSponsored = Boolean.parseBoolean(parts[6]);

                Lifter lifter = new Lifter();
                lifter.setId(id);
                lifter.setName(name);
                lifter.setClubName(clubName);
                lifter.setGender(gender);
                lifter.setBodyweight(bodyweight);
                lifter.setDateOfBirth(Lifter.parseDateOfBirth(dateOfBirth));
                lifter.setSponsored(isSponsored);
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
