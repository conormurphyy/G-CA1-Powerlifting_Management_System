package org.powerliftingManagementSystem.Menu.MenuUtil.FileUtilTest;

import org.junit.jupiter.api.Test;
import org.powerliftingManagementSystem.FileUtil.FileUtils;

import static org.junit.Assert.assertEquals;

class FileUtilsTest {

    @Test
    void readLiftersEquipment() {
    }

    @Test
    void readLiftersData() {
    }

    @Test
    void readCompetitionsData() {
    }

    @Test
    void readCompetitionResults() {
    }

    @Test
    void formatName1() {
        String name = "aLeX  mUrpHy";
        String actual = FileUtils.formatName(name);
        String expected = "Alex Murphy";
        assertEquals(expected, actual);
    }
    @Test
    void formatName2() {
        String name = "JAMES       mcardle";
        String actual = FileUtils.formatName(name);
        String expected = "James Mcardle";
        assertEquals(expected, actual);
    }
    @Test
    void formatName3() {
        String name = " conor mccracken";
        String actual = FileUtils.formatName(name);
        String expected = "Conor Mccracken";
        assertEquals(expected, actual);
    }
}