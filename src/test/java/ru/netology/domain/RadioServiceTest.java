package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioServiceTest {

    @Test
    void findMax() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(10);

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 9;

        assertEquals(expected, actual);


    }
}
