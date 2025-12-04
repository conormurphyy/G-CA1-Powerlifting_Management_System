package org.powerliftingManagementSystem.LifterResult;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Lifter.Lifter;

import java.util.ArrayList;

public class Placement {
    public static void calculatePlacement(ArrayList<Competition> competitions, ArrayList<LifterResult> results) {
        for (Competition comp : competitions) {
            System.out.println("\n==========================================");
            System.out.println("COMPETITION: " + comp.getName());
            System.out.println("==========================================");

            ArrayList<LifterResult> compResults = new ArrayList<>();
            for (LifterResult r : results) {
                for (Lifter l : comp.getLifters()) {
                    if (l.getId() == r.getLifter().getId()) {
                        compResults.add(r);
                        break;
                    }
                }
            }


            for (int i = 0; i < compResults.size(); i++) {
                LifterResult lifterResult = compResults.get(i);
                Lifter currentLifter = lifterResult.getLifter();

                int place = 1;

                for (int j = 0; j < compResults.size(); j++) {
                    LifterResult otherLifterResult = results.get(j);
                    Lifter otherLifter = otherLifterResult.getLifter();

                    if(lifterResult == otherLifterResult) {
                        continue;
                    }
                    boolean sameGender = currentLifter.getGender() == otherLifter.getGender();
                    boolean sameAgeClass = currentLifter.getAgeClass().equals(otherLifter.getAgeClass());
                    boolean sameWeightClass = currentLifter.getWeightClass().equals(otherLifter.getWeightClass());

                    if (sameGender && sameAgeClass && sameWeightClass) {

                        if (otherLifterResult.getTotal() > lifterResult.getTotal()) {
                            place++;
                        } else if (otherLifterResult.getTotal() == lifterResult.getTotal()) {
                            if (otherLifter.getBodyweight() < currentLifter.getBodyweight()) {
                                place++;
                            }
                        }
                    }
                }
                lifterResult.setPlacement(place);
            }
            System.out.printf("%-20s %-20s %-10s %-10s%n", "Name", "Category", "Total", "Place");
            System.out.println("-------------------------------------------------------------");

            for (LifterResult r : compResults) {
                String category = r.getLifter().getAgeClass() + " " + r.getLifter().getWeightClass();
                System.out.printf("%-20s %-20s %-10.1f %d%n",
                        r.getLifter().getName(),
                        category,
                        r.getTotal(),
                        r.getPlacement());

            }
        }
    }
}
