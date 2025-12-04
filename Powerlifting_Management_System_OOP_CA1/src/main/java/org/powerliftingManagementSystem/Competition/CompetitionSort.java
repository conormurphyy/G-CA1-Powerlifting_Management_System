package org.powerliftingManagementSystem.Competition;

import org.powerliftingManagementSystem.Competition.Competition;

import java.util.Comparator;

public enum CompetitionSort implements Comparator<Competition> {
    sortIdAscending{
        @Override
        public int compare(Competition a, Competition b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    sortNameAscending {
        @Override
        public int compare(Competition a, Competition b) {
            return a.getName().compareTo(b.getName());
        }
    },
    sortDateAscending {
        @Override
        public int compare(Competition a, Competition b) {
            return a.getDate().compareTo(b.getDate());
        }
    },
    sortIdDescending {
        @Override
        public int compare(Competition a, Competition b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    sortNameDescending {
        @Override
        public int compare(Competition a, Competition b) {
            return b.getName().compareTo(a.getName());
        }
    },
    sortDateDescending {
        @Override
        public int compare(Competition a, Competition b) {
            return a.getDate().compareTo(b.getDate());
        }
    }
}
