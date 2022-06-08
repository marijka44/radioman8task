package ru.netology.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioServiceTest {

    @Test
    void findMaxNumber() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(6);


        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 6;

        assertEquals(expected, actual);
    }


    @Test
    void findMaxNumberAbove() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(10);


        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void findMaxNumberBelow() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(-2);


        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationShouldSetNextCurrentRadioStationNumberIfAboveNine() {
        Radio cond = new Radio();

        cond.nextStation();

        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationShouldSetNextCurrentRadioStationNumberIfStationIsNine() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(9);

        cond.nextStation();

        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void prevStationShouldSetNextCurrentRadioStationNumberIfAboveZero() {
        Radio cond = new Radio();

        cond.prevStation();


        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationShouldSetNextCurrentRadioStationNumberIfStationIsNine() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(9);

        cond.prevStation();


        int actual = cond.getCurrentRadioStationNumber();//cond.currentRadioStationNumber;;
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolume() {
        Radio cond = new Radio();

        cond.increaseVolume();


        int actual = cond.getCurrentSoundVolume();//cond.currentRadioStationNumber;;
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolumeFalse() {
        Radio cond = new Radio();

        cond.increaseVolume();
        cond.increaseVolume();
        cond.increaseVolume();
        cond.increaseVolume();
        cond.increaseVolume();
        cond.increaseVolume();

        int actual = cond.getCurrentSoundVolume();//cond.currentRadioStationNumber;;
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolume() {
        Radio cond = new Radio();

        cond.decreaseVolume();


        int actual = cond.getCurrentSoundVolume();//cond.currentRadioStationNumber;;
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolumeFalse() {
        Radio cond = new Radio();

        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();
        cond.decreaseVolume();

        int actual = cond.getCurrentSoundVolume();//cond.currentRadioStationNumber;;
        int expected = 0;

        assertEquals(expected, actual);
    }
}


