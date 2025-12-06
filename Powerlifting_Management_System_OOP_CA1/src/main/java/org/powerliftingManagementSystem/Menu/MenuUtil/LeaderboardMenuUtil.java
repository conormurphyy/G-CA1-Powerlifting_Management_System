package org.powerliftingManagementSystem.Menu.MenuUtil;

public class LeaderboardMenuUtil {
    public static void leaderboardMenu() {
        System.out.println("""
        ++=========================================================================++
        ||                             Leaderboard Menu                            ||
        ++-------------------------------------------------------------------------++
        ||                      Select one of the following options:               ||
        ++-------------------------------------+-----------------------------------++
        ||         Top 3 DOT Scores: "1"       |       Top 3 Totals: "2"           ||
        ++-------------------------------------+-----------------------------------++
        ||          Top 3 Squats: "3"          |        Top 3 Benches: "4"         ||
        ++-------------------------------------+-----------------------------------++
        ||          Top 3 Deadlift: "5"        |     Exit Leaderboard Menu: "0"    ||
        ++=========================================================================++
        """);
    }
}
