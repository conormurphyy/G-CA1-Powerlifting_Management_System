package org.powerliftingManagementSystem.Menu.MenuUtil;

public class ErrorMessage {
    public static void invalidOptionLifterMenu() {
        System.out.println("""
        ++=========================================================================++
        ||          INVALID OPTION: PLEASE ENTER A "1", "2", "3", "4" or "0"       ||
        ++=========================================================================++
        """);
    }

    public static void invalidOptionCompetitionMenu() {
        System.out.println("""
        ++=========================================================================++
        ||             INVALID OPTION: PLEASE ENTER A "1", "2", "3" or "0"         ||
        ++=========================================================================++
        """);
    }

    public static void invalidOptionLifterResultMenu() {
        System.out.println("""
        ++=========================================================================++
        ||          INVALID OPTION: PLEASE ENTER A "1", "2", "3", "4" or "0"       ||
        ++=========================================================================++
        """);
    }

    public static void invalidOptionLeaderboardMenu() {
        System.out.println("""
        ++=========================================================================++
        ||       INVALID OPTION: PLEASE ENTER A "1", "2", "3", "4", "5" or "0"     ||
        ++=========================================================================++
        """);
    }

    public static void ascDesc() {
        System.out.println("""
        ++=========================================================================++
        ||                INVALID OPTION: PLEASE ENTER A "1", "2", "0"             ||
        ++=========================================================================++
        """);
    }

    public static void invalidInput() {
        System.out.println("""
        ++=========================================================================++
        ||                  INVALID OPTION: PLEASE ENTER AN INTEGER                ||
        ++=========================================================================++
        """);
    }

    public static void error() {
        System.out.println("""
        ++=========================================================================++
        ||                          AN ERROR HAS OCCURRED...                       ||
        ++=========================================================================++
        """);
    }

}
