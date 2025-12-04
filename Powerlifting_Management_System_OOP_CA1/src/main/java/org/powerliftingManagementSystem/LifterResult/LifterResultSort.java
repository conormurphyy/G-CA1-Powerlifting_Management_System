package org.powerliftingManagementSystem.LifterResult;
//https://stackoverflow.com/questions/18883646/java-enum-methods-return-opposite-direction-enum

import java.util.Comparator;

public enum LifterResultSort implements Comparator<LifterResult> {
    byDotsDesc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getDots(), a.getDots());
        }
    },
    bySquatAsc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(a.getSquat(), b.getSquat());
        }
    },
    byBenchAsc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(a.getBench(), b.getBench());
        }
    },
    byDeadliftAsc{
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(a.getDeadlift(), b.getDeadlift());
        }
    },
    byTotalAsc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(a.getTotal(), b.getTotal());
        }
    },
    byDotsAsc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(a.getDots(), b.getDots());
        }
    },
    bySquatDesc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getSquat(), a.getSquat());
        }
    },
    byBenchDesc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getBench(), a.getBench());
        }
    },
    byDeadliftDesc{
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getDeadlift(), a.getDeadlift());
        }
    },
    byTotalDesc {
        @Override
        public  int compare(LifterResult a, LifterResult b) {
            return Double.compare(b.getTotal(), a.getTotal());
        }
    }
}
