package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCountOfStation() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getMaxStation());
    }

    @Test
    public void shouldCheckCountOfStation() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
    }

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
    public void shouldSetCountOfStationAndIncreaseStation() {
        Radio radio = new Radio(19);
        radio.setCurrentStation(19);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
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
    public void shouldSetCountOfStationAndDecreaseMaxStation() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(32);
        radio.decreaseStation();
        assertEquals(31, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldVerifyNegativeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-14);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAndIncreaseMaxStation()  {
        Radio radio = new Radio(19);
        radio.setCurrentStation(19);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndDecreaseMinStation() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(35, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndSetCurrentMoreThanMaxStation() {
        Radio radio = new Radio(33);
        radio.setCurrentStation(34);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

}