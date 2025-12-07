package org.powerliftingManagementSystem.Menu.MenuUtil;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Competition.Competition;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionMenuUtilTest {

    @Test
    void printLiftersInCompTable() {
        ArrayList<Competition> competitions = new ArrayList<>();
        competitions.add(new Competition(1, "Cool Comp", "Dublin", "01-02-2025",null));
        CompetitionMenuUtil.printLiftersInCompTable(competitions,1);
    }

    @Test
    void printCompetitionsTable() {
        ArrayList<Competition> competitions = new ArrayList<>();
        competitions.add(new Competition(1, "Cool Comp", "Dublin", "01-02-2025"));

        CompetitionMenuUtil.printCompetitionsTable(competitions);
    }

    @Test
    void competitionsMenu() {
        CompetitionMenuUtil.competitionsMenu();
    }

    @Test
    void exitToCompetitionMenu() {
        CompetitionMenuUtil.exitToCompetitionMenu();
    }
}