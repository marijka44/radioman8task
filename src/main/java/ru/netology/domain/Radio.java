package ru.netology.domain;

public class Radio {
    private final int countStationNumber;

    private final int firstStationNumber = 0;

    private int currentRadioStationNumber = 0;

    private final int minSoundVolume = 0;

    private final int maxSoundVolume = 100;
    private int currentSoundVolume = 5;

    public Radio() {
        this.countStationNumber = 10;
    }

    public Radio(int countStationNumber) {
        this.countStationNumber = countStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public int getCurrentSoundVolume() {
        return this.currentSoundVolume;
    }

    public void setCurrentRadioStationNumber(int stationNumber) {
        if (stationNumber >= this.firstStationNumber && stationNumber < this.countStationNumber) {
            this.currentRadioStationNumber = stationNumber;
        }
    }

    public void nextStation() {
        if (this.currentRadioStationNumber < this.countStationNumber - 1) {
            this.currentRadioStationNumber = this.currentRadioStationNumber + 1;
        } else {
            this.currentRadioStationNumber = this.firstStationNumber;
        }
    }

    public void prevStation() {
        if (this.currentRadioStationNumber > this.firstStationNumber) {
            this.currentRadioStationNumber = this.currentRadioStationNumber - 1;
        } else {
            this.currentRadioStationNumber = this.countStationNumber - 1;
        }
    }

    public void increaseVolume() {
        if (this.currentSoundVolume < this.maxSoundVolume) {
            this.currentSoundVolume = this.currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (this.currentSoundVolume > this.minSoundVolume) {
            this.currentSoundVolume = this.currentSoundVolume - 1;
        }
    }

}


