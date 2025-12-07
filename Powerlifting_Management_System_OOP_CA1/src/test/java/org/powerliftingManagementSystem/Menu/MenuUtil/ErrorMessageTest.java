package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorMessageTest {

    @Test
    void invalidOptionLifterMenu() {
        ErrorMessage.invalidOptionLifterMenu();
    }

    @Test
    void invalidOptionCompetitionMenu() {
        ErrorMessage.invalidOptionCompetitionMenu();
    }

    @Test
    void invalidOptionLifterResultMenu() {
        ErrorMessage.invalidOptionLifterResultMenu();
    }

    @Test
    void invalidOptionLeaderboardMenu() {
        ErrorMessage.invalidOptionLeaderboardMenu();
    }

    @Test
    void ascDesc() {
        ErrorMessage.ascDesc();
    }

    @Test
    void invalidInput() {
        ErrorMessage.invalidInput();
    }

    @Test
    void error() {
        ErrorMessage.error();
    }
}