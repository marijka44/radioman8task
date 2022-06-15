package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioServiceTest {
    public Radio cond;

    @BeforeEach
    public void initEach(){
        cond = new Radio();
    }

    @Test
    void setCurrentRadioStationNumber() {
        cond.setCurrentRadioStationNumber(6);

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 6;

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentRadioStationNumberFal() {
        cond.setCurrentRadioStationNumber(15);

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationNumberLessThenFirstStationNumber() {
        cond.setCurrentRadioStationNumber(-1);

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void getCurrentRadioStationNumberIfWeCreateRadioWithoutParams() {
        int actual = cond.getCurrentRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationNumberIfWeCreateRadioWithParams() {
        Radio cond = new Radio(20);
        int actual = cond.getCurrentRadioStationNumber();
        cond.nextStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationShouldSetNextCurrentRadioStationNumberIfStationIsFirst() {
        cond.nextStation();

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationShouldSetNextCurrentRadioStationNumberIfStationHasMaxCountStationNumber() {
        cond.setCurrentRadioStationNumber(9);

        cond.nextStation();

        int actual = cond.getCurrentRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationShouldSetNextCurrentRadioStationNumberIfAboveZero() {
        cond.prevStation();


        int actual = cond.getCurrentRadioStationNumber();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationShouldSetNextCurrentRadioStationNumberIfStationIsNine() {
        cond.setCurrentRadioStationNumber(9);

        cond.prevStation();


        int actual = cond.getCurrentRadioStationNumber();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolume() {
        cond.increaseVolume();


        int actual = cond.getCurrentSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolumeIfWeHaveMaxVolume() {
        for (int i = 0; i < 95; i++) {
            cond.increaseVolume();
        }

        int actual = cond.getCurrentSoundVolume();
        int expected = 100;

        assertEquals(expected, actual);

        cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolume() {
        cond.decreaseVolume();


        int actual = cond.getCurrentSoundVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolumeIfWeHaveMinVolume() {
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();

        int actual = cond.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}


