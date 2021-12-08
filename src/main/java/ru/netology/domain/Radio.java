package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int countOfStation = 10;

    public Radio() {
    }

    public int getCountOfStation() {
        return countOfStation;
    }

    public void setCountOfStation(int countOfStation) {
        this.countOfStation = countOfStation;
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public void increaseStation() {
        if (currentStation < countOfStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = countOfStation - 1;
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
        if (currentStation > countOfStation - 1) {
//            currentStation = 0;
            return;
        }
        if (currentStation < 0) {
//            currentStation = countOfStation - 1;
            return;
        }
        this.currentStation = currentStation;
    }
}