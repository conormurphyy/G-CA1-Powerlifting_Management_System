package org.powerliftingManagementSystem.lifter;

import java.util.Comparator;

public class LifterSortingFiltering implements Comparator<Lifter>{

    private int choice;
    public LifterSortingFiltering(int choice){
        this.choice = choice;
    }

    @Override
    public int compare(Lifter a, Lifter b) {

        switch (choice){
            case 1: return a.getName().compareTo(b.getName());
            case 2: return a.getClubName().compareTo(b.getClubName());
            case 3: return Integer.compare(a.getAge(), b.getAge());
            case 4: return Double.compare(a.getBodyweight(), b.getBodyweight());
            default: return 0;
        }

    }
}

