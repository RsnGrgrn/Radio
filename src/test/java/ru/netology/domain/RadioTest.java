package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetCountOfStation() {
        radio.setMaxStation(15);
        assertEquals(15, radio.getMaxStation());
    }

    @Test
    public void shouldCheckCountOfStation() {
        assertEquals(10, radio.getMaxStation());
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
        radio.setMaxStation(20);
        radio.setCurrentStation(19);
        radio.increaseStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {
        radio.setCurrentStation(radio.getMaxStation());
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
        radio.setMaxStation(32);
        radio.setCurrentStation(32);
        radio.decreaseStation();
        assertEquals(31, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseMinStation() {
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldVerifyNegativeStation() {
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAndIncreaseMaxStation()  {
        radio.setMaxStation(19);
        radio.setCurrentStation(19);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndDecreaseMinStation() {
        radio.setMaxStation(35);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(35, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCountOfStationAndSetCurrentMoreThanMaxStation() {
        radio.setMaxStation(33);
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