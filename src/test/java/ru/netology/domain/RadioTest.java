package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

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
    public void shouldDecreaseMinStation() {
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldVerifyNegativeStation() {
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMoreThanMaxStation() {
        radio.setCurrentStation(15);
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
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

}