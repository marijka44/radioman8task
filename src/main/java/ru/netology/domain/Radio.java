package ru.netology.domain;


public class Radio {

    private int currentRadioStationNumber = 0;
    private int currentSoundVolume = 5;


    public void setCurrentRadioStationNumber(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            this.currentRadioStationNumber = stationNumber;
        }

    }

    public void nextStation() {
        if (this.currentRadioStationNumber < 9) {
            this.currentRadioStationNumber = this.currentRadioStationNumber + 1;
        } else {
            this.currentRadioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (this.currentRadioStationNumber > 0) {
            this.currentRadioStationNumber = this.currentRadioStationNumber - 1;
        } else {
            this.currentRadioStationNumber = 9;
        }
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;

    }

    public int getCurrentSoundVolume() {
        return this.currentSoundVolume;

    }


    public void increaseVolume() {
        if (this.currentSoundVolume < 10) {
            this.currentSoundVolume = this.currentSoundVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (this.currentSoundVolume > 0) {
            this.currentSoundVolume = this.currentSoundVolume - 1;
        }

    }
}


