package org.powerliftingManagementSystem.LifterResult;
//https://stackoverflow.com/questions/18883646/java-enum-methods-return-opposite-direction-enum

import java.util.Comparator;

public enum LifterResultSort implements Comparator<LifterResult> {
    byDotsOverall {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getDots(), a.getDots());
        }
    },
    bySquatOverall {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getSquat(), a.getSquat());
        }
    },
    byBenchOverall {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getBench(), a.getBench());
        }
    },
    byDeadliftOverall{
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getDeadlift(), a.getDeadlift());
        }
    },
    byTotalOverall {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getTotal(), a.getTotal());
        }
    }
}
