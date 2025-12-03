package org.powerliftingManagementSystem.leaderboard;

import org.powerliftingManagementSystem.competition.CompetitionResult;

import java.util.Comparator;

public class sortLifterDeadlift implements Comparator<CompetitionResult>  {
    @Override
    public  int compare(CompetitionResult a, CompetitionResult b) {
        return Double.compare(b.getDeadlift(), a.getDeadlift());
    }
}
