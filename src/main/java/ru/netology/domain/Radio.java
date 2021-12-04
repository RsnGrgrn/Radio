package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {

    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 9;
    private int minStation = 0;
    private int maxStation = 10;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        else {
            currentVolume = 100;
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
        if (currentStation < maxStation) {
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
            currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }
}