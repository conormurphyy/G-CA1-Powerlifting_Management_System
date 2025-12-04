package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.util.ArrayList;

public class LifterMenuUtil {
    public static void printLifters(ArrayList<Lifter> lifters) {

            System.out.println("Lifter Table");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf(
                    "%-6s %-20s  %-35s  %-6s  %-6s %-8s  %-13s  %-8s  %-5s  %-12s %n",
                    "ID", "Name", "Club Name", "Gender", "Body Weight", "",
                    "Weight Class", "Date of Birth", "Age", "Age Class"
            );
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Lifter l : lifters) {
                System.out.printf(
                        "%-6d %-20s  %-35s  %-6c  %-6.2f %-8s  %-18s  %-15s  %-5d  %-12s %n",
                        l.getId(),
                        l.getName(),
                        l.getClubName(),
                        l.getGender(),
                        l.getBodyweight(), "KG",
                        l.getWeightClass(),
                        l.getDateOfBirth(),
                        l.getAge(),
                        l.getAgeClass()
                        //Arrays.toString(l.getEquipmentUsedType())
                );
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        public static void printLiftersEquipment(ArrayList<Lifter> lifters) {
            System.out.println("Lifter Equipment Table");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf(
                    "%-6s %-20s %-20s %-25s %-25s %-30s %-30s %-25s %-32s %-25s%n",
                    "ID", "Name", "Belt", "Singlet","Comp Tee","Wrist Wraps", "Knee Sleeves", "Socks", "Deadlift Socks","Shoes"
            );
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Lifter l : lifters) {
                System.out.printf(
                        "%-6d %-20s %-20s %-25s %-25s %-30s %-30s %-25s %-32s %-25s%n",
                        l.getId(),
                        l.getName(),
                        l.getEquipment().getBelt(),
                        l.getEquipment().getSinglet(),
                        l.getEquipment().getCompTee(),
                        l.getEquipment().getWristWraps(),
                        l.getEquipment().getKneeSleeves(),
                        l.getEquipment().getSocks(),
                        l.getEquipment().getDeadliftSocks(),
                        l.getEquipment().getShoes()

                        //Arrays.toString(l.getEquipmentUsedType())
                );
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
}
