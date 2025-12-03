package org.powerliftingManagementSystem.Leaderboard;

import org.powerliftingManagementSystem.Result.Result;

import java.util.Comparator;

public class sortLifterDots implements Comparator<Result> {
    @Override
    public int compare(Result a, Result b) {
        return Double.compare(b.getDots(), a.getDots());
    }
}


