package org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionTest;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Equipment.Equipment;
import org.powerliftingManagementSystem.Lifter.Lifter;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class CompetitionTest {

  @Test
  void testGetters()
  {
      LocalDate dob = LocalDate.of(1990, 1, 1);
      Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
      Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
      ArrayList<Lifter> lifters = new ArrayList<>();
      lifters.add(lifter);
      Competition competition = new Competition(1,"Drogheda open","Drogheda","18 December 2025",lifters);

      int expectedID=1;
      int actualID = competition.getId();
      assertEquals(expectedID,actualID);

      String expectedName="Drogheda open";
      String actualName=competition.getName();
      assertEquals(expectedName,actualName);

      String expectedLocation="Drogheda";
      String actualLocation=competition.getLocation();
      assertEquals(expectedLocation,actualLocation);

      String expectedDate="18 December 2025";
      String actualDate=competition.getDate();
      assertEquals(expectedDate,actualDate);


  }
  @Test
  void testSetters()
  {
      LocalDate dob = LocalDate.of(1990, 1, 1);
      Equipment equipment = new Equipment(1,"SBD Belt", "SBD Singlet", "SBD Tee", "SBD Wrist Wraps", "SBD KneeSleeves", "Cool Socks", "Cool Deadlift Socks", "Nike");
      Lifter lifter = new Lifter (1,"Mark John","Strong Men",'M',101.08,dob,false,19,"Junior",equipment,"U-83 Men");
      ArrayList<Lifter> lifters = new ArrayList<>();
      lifters.add(lifter);
      Competition competition = new Competition(1,"Drogheda open","Drogheda","18 December 2025",lifters);

      int expectedID=100;
      competition.setId(expectedID);
      int actualID=competition.getId();
      assertEquals(expectedID,actualID);

      String expectedName="Drogheda Closed";
      competition.setName(expectedName);
      String actualName=competition.getName();
      assertEquals(expectedName,actualName);

      String expectedLocation="Drogheda";
      competition.setLocation(expectedLocation);
      String actualLocation=competition.getLocation();
      assertEquals(expectedLocation,actualLocation);

      String expectedDate="19 December 2025";
      competition.setDate(expectedDate);
      String actualDate=competition.getDate();
      assertEquals(expectedDate,actualDate);
  }

    @Test
    void assignLiftersToCompetition() {
    }
}