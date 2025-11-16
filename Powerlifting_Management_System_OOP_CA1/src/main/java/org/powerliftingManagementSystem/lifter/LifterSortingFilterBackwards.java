package org.powerliftingManagementSystem.lifter;

import java.util.Comparator;

public class LifterSortingFilterBackwards implements Comparator<Lifter>
{
    @Override
    public int compare(Lifter a,Lifter b){return b.getName().compareTo(a.getName());}
}
