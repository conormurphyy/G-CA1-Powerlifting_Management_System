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
            return a.getName().compareTo(b.getName());
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
            return a.getName().compareTo(b.getName());
        }
    },
    sortClubNameDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return a.getName().compareTo(b.getName());
        }
    },
    sortAgeDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Integer.compare(a.getAge(), b.getAge());
        }
    },
    sortBodyweightDescending() {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Double.compare(a.getBodyweight(), b.getBodyweight());
        }
    }
}
