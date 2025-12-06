package org.powerliftingManagementSystem.Menu;

import org.powerliftingManagementSystem.Competition.Competition;
import org.powerliftingManagementSystem.Competition.CompetitionSort;
import org.powerliftingManagementSystem.FileUtil.FileUtils;
import org.powerliftingManagementSystem.Menu.MenuUtil.CompetitionMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.ErrorMessage;
import org.powerliftingManagementSystem.Menu.MenuUtil.LifterMenuUtil;
import org.powerliftingManagementSystem.Menu.MenuUtil.MenuUtil;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static org.powerliftingManagementSystem.FileUtil.FileUtils.readCompetitionsData;

public class CompetitionMenu {
    public static void run() throws FileNotFoundException {
        new CompetitionMenu().start();
    }

    private void start() throws FileNotFoundException {
        ArrayList<Competition> competitions = readCompetitionsData("competitionsampledata.csv", ",");
        CompetitionMenuUtil.printCompetitionsTable(competitions);

        Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            try {
                CompetitionMenuUtil.competitionsMenu();
                System.out.print("Enter Option: ");
                int input = keyboard.nextInt();

                switch (input) {
                    case 1:
                        boolean ascDescMenu = true;
                        while (ascDescMenu) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                if(inputName==1 || inputName==2 || inputName==0) {
                                    handleID(competitions, inputName);
                                    ascDescMenu=false;
                                }
                                else
                                {
                                    ErrorMessage.ascDesc();
                                }
                            } catch (Exception e) {
                                ErrorMessage.invalidInput();
                                keyboard.nextLine();
                            }

                        }
                        break;
                    case 2:
                        boolean ascDescMenu2 = true;
                        while (ascDescMenu2) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                if(inputName==1 || inputName==2 || inputName==0) {
                                    handleName(competitions, inputName);
                                    ascDescMenu2=false;
                                }
                                else{
                                    ErrorMessage.ascDesc();
                                }
                            } catch (Exception e) {
                                ErrorMessage.invalidInput();
                                keyboard.nextLine();
                            }

                        }
                        break;
                    case 3:
                        boolean ascDescMenu3 = true;
                        while (ascDescMenu3) {
                            try {
                                MenuUtil.sortingAscDec();
                                int inputName = keyboard.nextInt();
                                if(inputName==1 || inputName==2 || inputName==0) {
                                    handleDate(competitions, inputName);
                                    ascDescMenu3=false;
                                }
                                else{
                                    ErrorMessage.ascDesc();
                                }
                            } catch (Exception e) {
                                ErrorMessage.invalidInput();
                                keyboard.nextLine();
                            }
                            break;
                        }
                    case 4:
                    handleNameSearch(competitions);
                    break;

                    case 5:
                    handleLocationSearch(competitions);
                    break;

                    case 0:
                        CompetitionMenuUtil.exitToCompetitionMenu();
                        isRunning = false;

                    default:
                        ErrorMessage.invalidInput();
                }
            } catch (Exception e) {
                ErrorMessage.invalidInput();
                keyboard.nextLine();
            }
        }
    }

    private void handleID(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortIdAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortIdDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }

    private void handleName(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortNameAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortNameDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }

    private void handleDate(ArrayList<Competition> competitions, int ascDesc) {
        switch (ascDesc) {
            case 1:
                competitions.sort(CompetitionSort.sortDateAscending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
            case 2:
                competitions.sort(CompetitionSort.sortDateDescending);
                CompetitionMenuUtil.printCompetitionsTable(competitions);
                break;
        }
    }
    private void handleNameSearch(ArrayList<Competition> competitions)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter competition name: ");
        String name = keyboard.nextLine();
        ArrayList <Competition> searchedComp = new ArrayList();
        String iname;
        for(Competition comp : competitions)
        {
            iname = comp.getName();
            iname = FileUtils.formatName(iname);
            name = FileUtils.formatName(name);
            if (name.equals(iname))
            {
                searchedComp.add(comp);
            }

        }
        CompetitionMenuUtil.printCompetitionsTable(searchedComp);
    }
    private void handleLocationSearch(ArrayList<Competition> competitions)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter location name: ");
        String location = keyboard.nextLine();
        ArrayList <Competition> searchedComp = new ArrayList();
        String iLocation;
        for(Competition comp : competitions)
        {
            iLocation = comp.getLocation();
            iLocation = FileUtils.formatName(iLocation);
            location = FileUtils.formatName(location);
            if (location.equals(iLocation))
            {
                searchedComp.add(comp);
            }
        }
        CompetitionMenuUtil.printCompetitionsTable(searchedComp);

    }

}