package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        else {
            currentVolume = 0;
        }
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation++;
        }
        else {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        }
        else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

}