package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationBelowMin(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);
        radio.prevRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 9;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
