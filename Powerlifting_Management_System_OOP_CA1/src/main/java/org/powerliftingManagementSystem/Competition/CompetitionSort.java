package org.powerliftingManagementSystem.Competition;

import org.powerliftingManagementSystem.Lifter.Lifter;

import java.util.Comparator;

public enum CompetitionSort implements Comparator<Lifter> {
    sortIdAscending{
        @Override
        public int compare(Lifter a, Lifter b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    sortNameAscending {
        @Override
        public int compare(Lifter a, Lifter b) {
            return a.getName().compareTo(b.getName());
        }
    },
    sortIdDescending {
        @Override
        public int compare(Lifter a, Lifter b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    sortNameDescending {
        @Override
        public int compare(Lifter a, Lifter b) {
            return b.getName().compareTo(a.getName());
        }
    }
}
