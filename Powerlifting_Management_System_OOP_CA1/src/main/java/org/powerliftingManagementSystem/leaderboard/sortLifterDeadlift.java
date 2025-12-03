package org.powerliftingManagementSystem.leaderboard;

import org.powerliftingManagementSystem.competition.CompetitionResult;

public class sortLifterDeadlift {
    @Override

    public  int compare(CompetitionResult a, CompetitionResult b)

    {
        return Double.compare(b.getDeadlift(), a.getDeadlift());
    }
}
