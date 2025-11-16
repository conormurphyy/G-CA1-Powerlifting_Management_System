package org.powerliftingManagementSystem.lifter;

import java.util.Comparator;

public class LifterSortingDescending implements Comparator<Lifter>
{

    private int choice;
    public LifterSortingDescending(int choice){
        this.choice = choice;
    }


    @Override
    public int compare(Lifter a,Lifter b) {
        switch (choice){
            case 1: return b.getName().compareTo(a.getName());
            case 2: return b.getClubName().compareTo(a.getClubName());
            case 3: return Integer.compare(b.getAge(), a.getAge());
            case 4: return Double.compare(b.getBodyweight(), a.getBodyweight());
            default: return 0;
        }
    }
}
