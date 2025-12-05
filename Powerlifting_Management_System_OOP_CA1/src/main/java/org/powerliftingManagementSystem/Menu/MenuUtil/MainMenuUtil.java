package org.powerliftingManagementSystem.Menu.MenuUtil;

public class MainMenuUtil {
    public static void welcome() {
        System.out.println("""
        ++=========================================================================++
        ||                          Welcome to JavaLifter                          ||
        ||                                                                         ||
        ||                A competition and athlete management tool.               ||
        ++=========================================================================++
        """);
    }

    public static void mainMenu() {
        System.out.println("""
        ++=========================================================================++
        ||                                 MAIN MENU                               ||
        ++-------------------------------------------------------------------------++
        ||                      Select one of the following options:               ||
        ++-------------------------------------+-----------------------------------++
        ||           Lifters: "1"              |       Competitions: "2"           ||
        ++-------------------------------------+-----------------------------------++
        ||           Lifter Results: "3"       |       View Leaderboard: "4"       ||
        ++-------------------------------------------------------------------------++
        ||                             Exit The Program: "0"                       ||
        ++=========================================================================++
        """);
    }



}
