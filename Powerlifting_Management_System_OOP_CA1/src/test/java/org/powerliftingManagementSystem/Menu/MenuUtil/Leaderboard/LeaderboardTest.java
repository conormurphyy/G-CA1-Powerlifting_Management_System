package org.powerliftingManagementSystem.Menu.MenuUtil.Leaderboard;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Leaderboard.Leaderboard;
import org.powerliftingManagementSystem.Lifter.Lifter;
import org.powerliftingManagementSystem.LifterResult.LifterResult;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeaderboardTest {

    @Test
    void printTop3DeadLift() {

        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1, "SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifter = new ArrayList<>();

        Lifter lifter1 = new Lifter(1, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter3 = new Lifter(3, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter2 = new Lifter(2, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");

        lifter.add(lifter1);
        lifter.add(lifter3);
        lifter.add(lifter2);
        ArrayList<LifterResult> lifterResults = new ArrayList<>();


        LifterResult lr1 = new LifterResult(1, 123, 123, 123);

        LifterResult lr2 = new LifterResult(2, 223, 223, 223);
        LifterResult lr3 = new LifterResult(3, 323, 323, 323);

        lifterResults.add(lr1);
        lifterResults.add(lr2);
        lifterResults.add(lr3);
        Lifter.assignResultsToLifter(lifterResults, lifter);
        Leaderboard.printTop3DeadLift(lifterResults);

    }

    @Test
    void printTop3Bench() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1, "SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifter = new ArrayList<>();

        Lifter lifter1 = new Lifter(1, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter3 = new Lifter(3, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter2 = new Lifter(2, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");

        lifter.add(lifter1);
        lifter.add(lifter3);
        lifter.add(lifter2);
        ArrayList<LifterResult> lifterResults = new ArrayList<>();


        LifterResult lr1 = new LifterResult(1, 123, 123, 123);

        LifterResult lr2 = new LifterResult(2, 223, 223, 223);
        LifterResult lr3 = new LifterResult(3, 323, 323, 323);

        lifterResults.add(lr1);
        lifterResults.add(lr2);
        lifterResults.add(lr3);
        Lifter.assignResultsToLifter(lifterResults, lifter);
        Leaderboard.printTop3Bench(lifterResults);

    }


    @Test
    void printTop3Squat() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1, "SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifter = new ArrayList<>();

        Lifter lifter1 = new Lifter(1, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter3 = new Lifter(3, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter2 = new Lifter(2, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");

        lifter.add(lifter1);
        lifter.add(lifter3);
        lifter.add(lifter2);
        ArrayList<LifterResult> lifterResults = new ArrayList<>();


        LifterResult lr1 = new LifterResult(1, 123, 123, 123);

        LifterResult lr2 = new LifterResult(2, 223, 223, 223);
        LifterResult lr3 = new LifterResult(3, 323, 323, 323);

        lifterResults.add(lr1);
        lifterResults.add(lr2);
        lifterResults.add(lr3);
        Lifter.assignResultsToLifter(lifterResults, lifter);
        Leaderboard.printTop3Squat(lifterResults);
    }

    @Test
    void printTop3Total() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1, "SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifter = new ArrayList<>();

        Lifter lifter1 = new Lifter(1, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter3 = new Lifter(3, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter2 = new Lifter(2, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");

        lifter.add(lifter1);
        lifter.add(lifter3);
        lifter.add(lifter2);
        ArrayList<LifterResult> lifterResults = new ArrayList<>();


        LifterResult lr1 = new LifterResult(1, 123, 123, 123);

        LifterResult lr2 = new LifterResult(2, 223, 223, 223);
        LifterResult lr3 = new LifterResult(3, 323, 323, 323);

        lifterResults.add(lr1);
        lifterResults.add(lr2);
        lifterResults.add(lr3);
        Lifter.assignResultsToLifter(lifterResults, lifter);
        Leaderboard.printTop3Total(lifterResults);
    }

    @Test
    void printTop3Dots() {
        LocalDate dob = LocalDate.of(1990, 1, 1);
        Equipment equipment = new Equipment(1, "SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
        ArrayList<Lifter> lifter = new ArrayList<>();

        Lifter lifter1 = new Lifter(1, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter3 = new Lifter(3, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");
        Lifter lifter2 = new Lifter(2, "Mark John", "Strong Men", 'M', 101.08, dob, false, 19, "Junior", equipment, "U-83 Men");

        lifter.add(lifter1);
        lifter.add(lifter3);
        lifter.add(lifter2);
        ArrayList<LifterResult> lifterResults = new ArrayList<>();


        LifterResult lr1 = new LifterResult(1, 123, 123, 123);

        LifterResult lr2 = new LifterResult(2, 223, 223, 223);
        LifterResult lr3 = new LifterResult(3, 323, 323, 323);

        lifterResults.add(lr1);
        lifterResults.add(lr2);
        lifterResults.add(lr3);
        Lifter.assignResultsToLifter(lifterResults, lifter);
        Leaderboard.printTop3Dots(lifterResults);
    }
}