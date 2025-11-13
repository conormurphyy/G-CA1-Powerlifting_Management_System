package Lifter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Lifter {
    //#region Fields
    private int id;
    private String name;
    private String clubName;
    private char gender; //M/F
    private double bodyweight;
    private LocalDate dateOfBirth;
    private boolean isSponsored;

    private int age;
    private String ageClass;
    private String[] equipmentUsedType;
    private String weightClass;
    //endregion
    //#region Getters
    public int getId() {return id;}
    public String getName() {return name;}
    public String getClubName() {return clubName;}
    public char getGender() {return gender;}
    public double getBodyweight() {return bodyweight;}
    public String getWeightClass() {return weightClass;}
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public boolean isSponsored() {return isSponsored;}
    public int getAge() {return age;}
    public String getAgeClass() {return ageClass;}
    public String[] getEquipmentUsedType() {return equipmentUsedType;}
    //#endregion
    //#region Setters
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setClubName(String clubName) {this.clubName = clubName;}
    public void setGender(char gender) {this.gender = gender;}
    public void setBodyweight(double bodyweight) {this.bodyweight = bodyweight;}
    public void setWeightClass(String weightClass) {this.weightClass = weightClass;}
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth =  dateOfBirth;}
    public void setSponsored(boolean sponsored) {isSponsored = sponsored;}
    public void setAge(int age) {this.age = age;}
    public void setAgeClass(String ageClass) {this.ageClass = ageClass;}
    public void setEquipmentUsedType(String[] equipmentUsedType) {this.equipmentUsedType = equipmentUsedType;}

    //#endregion
    //#region ToString()
    @Override
    public String toString() {
        return "LifterTemp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", bodyweight=" + bodyweight +
                ", weightClass='" + weightClass + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", isSponsored=" + isSponsored +
                ", age=" + age +
                ", ageClass='" + ageClass + '\'' +
                ", equipmentUsedType=" + Arrays.toString(equipmentUsedType) +
                '}';
    }
    //endregion

    //parse DOB from a string to Local Date
    public static LocalDate parseDateOfBirth(String dobString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //https://www.digitalocean.com/community/tutorials/java-simpledateformat-java-date-format
        return LocalDate.parse(dobString, formatter); //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
    }

    // Calculate age from LocalDate
    public static int calculateAge(LocalDate dob) {
        LocalDate now = LocalDate.now();
        int years = Period.between(dob, now).getYears();
        if (years < 0) throw new IllegalArgumentException("Date of birth is invalid");
        if (years < 13) throw new IllegalArgumentException("You must be at least 13 years old to compete!");
        return years;
    }

    // Find weight class from age
    public static String findAgeClass(int age) {
        String ageClass = "";
        int[] maxAge = {13, 18, 23, 40, 49, 59, 69, 122}; //Maximum recorded age is 122 according to: //https://www.washington.edu/news/2021/07/01/how-long-can-a-person-live-the-21st-century-may-see-a-record-breaker/
        String[] ageClasses = {"Too Young", "Sub-Junior", "Junior", "Open", "Master 1", "Master 2", "Master 3", "Master 4"};

        if (age < 0) throw new IllegalArgumentException("Age is invalid");
        if (age < 13) throw new IllegalArgumentException("You must be at least 13 years old to compete!");

        for (int i = 1; i < maxAge.length; i++) {
            if (age <= maxAge[i]) {
                ageClass = ageClasses[i];
                break;
            }
        }

        if (age > 122) throw new IllegalArgumentException("Impossible Age");

        return ageClass;
    }

    //Find weight Class from gender and weight
    public static String findWeightClass(double weight, char gender) {
        String weightClass = "";
        //Gender and weight dictate competing class.
        int[] menMaxWeight = {59, 66, 74, 83, 93, 105, 120, 635};
        String[] menClasses = {"U-59KG Men", "U-66KG Men", "U-74KG Men", "U-83KG Men", "U-93KG Men", "U-105KG Men", "U-120KG Men", "120KG+ Men"};

        int[] womenMaxWeight = {47, 52, 59, 63, 69, 76, 84, 727};
        String[] womenClasses = {"U-47KG Women", "U-52KG Women", "U-59KG Women", "U-63KG Women", "U-69KG Women", "U-76KG Women", "U-84KG Women", "84KG+ Women"};

        if (weight < 0) throw new IllegalArgumentException("Weight is invalid");

        int[] maxWeight = {};
        String[] classes = {};

        if (gender == 'M') {
            maxWeight = menMaxWeight;
            classes = menClasses;
            if(weight > 635) throw new IllegalArgumentException("Impossible Weight");
        }
        else if (gender == 'F') {
            maxWeight = womenMaxWeight;
            classes = womenClasses;
            if(weight > 727) throw new IllegalArgumentException("Impossible Weight");
        }
        else {
            throw new IllegalArgumentException("Invalid Gender");
        }

        for (int i = 0; i < maxWeight.length; i++) {
            if (weight < maxWeight[i]) {
                weightClass = classes[i];
                break;
            }
        }
        return weightClass;
    }


}





