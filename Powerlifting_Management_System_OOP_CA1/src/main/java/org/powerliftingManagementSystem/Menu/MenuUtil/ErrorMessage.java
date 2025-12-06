package org.powerliftingManagementSystem.Menu.MenuUtil;

public class ErrorMessage {
    public static void invalidOptionLifterMenu() {
        System.out.println("""
        ++=========================================================================++
        ||          INVALID OPTION: PLEASE ENTER A "1", "2", "3", "4" or "0"       ||
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
}
