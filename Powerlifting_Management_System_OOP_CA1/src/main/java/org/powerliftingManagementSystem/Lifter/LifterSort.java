package org.powerliftingManagementSystem.Lifter;

import java.util.Comparator;

public enum LifterSort implements Comparator<Lifter> {
    //Ascending
    sortNameAscending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return a.getName().compareTo(b.getName());
        }
    },
    sortClubNameAscending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return a.getClubName().compareTo(b.getClubName());
        }
    },
    sortAgeAscending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Integer.compare(a.getAge(), b.getAge());
        }
    },
    sortBodyweightAscending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Double.compare(a.getBodyweight(), b.getBodyweight());
        }
    },
    //Descending
    sortNameDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return b.getName().compareTo(a.getName());
        }
    },
    sortClubNameDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return b.getClubName().compareTo(a.getClubName());
        }
    },
    sortAgeDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Integer.compare(b.getAge(), a.getAge());
        }
    },
    sortBodyweightDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Double.compare(b.getBodyweight(), a.getBodyweight());
        }
    }
}
