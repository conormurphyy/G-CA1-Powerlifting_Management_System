package Lifter;

import java.util.Collections;
import java.util.Comparator;

public class LifterSortingFiltering implements Comparator<Lifter> {

    @Override
    public int compare(Lifter a, Lifter b) {
        return a.getName().compareTo(b.getName());
    }
}
