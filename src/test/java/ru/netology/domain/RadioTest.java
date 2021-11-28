package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.decreaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldVerifyNegativeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-11);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.increaseVolume();
        assertEquals(6,radio.currentVolume);
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.increaseVolume();
        assertEquals(1,radio.currentVolume);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        assertEquals(10,radio.currentVolume);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.decreaseVolume();
        assertEquals(4,radio.currentVolume);
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.decreaseVolume();
        assertEquals(9,radio.currentVolume);
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        assertEquals(0,radio.currentVolume);
    }

}