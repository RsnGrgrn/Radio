package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetCountOfStation() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getCountOfStation());
    }

    @Test
    public void shouldSetCountRadioStation() {
        radio.setCountOfStation(17);
        assertEquals(17, radio.getCountOfStation());
    }

    @Test
    public void shouldCheckCountOfStation() {
        assertEquals(10, radio.getCountOfStation());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndIncreaseStation() {
        Radio radio = new Radio(19);
        radio.setCurrentStation(14);
        radio.increaseStation();
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
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
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldVerifyNegativeStation() {
        radio.setCurrentStation(-14);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAndIncreaseMaxStation()  {
        Radio radio = new Radio(19);
        radio.setCurrentStation(17);
        radio.increaseStation();
        assertEquals(18, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndDecreaseMinStation() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(34, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndSetCurrentMoreThanMaxStation() {
        Radio radio = new Radio(33);
        radio.setCurrentStation(34);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

}