package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) return;
        if (newRadioStation > 9) return;
        currentRadioStation = newRadioStation;
    }

    public void nextRadioStation(){
        if (currentRadioStation < 9) currentRadioStation = currentRadioStation + 1;
        else currentRadioStation = 0;
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) currentRadioStation = currentRadioStation - 1;
        else currentRadioStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) currentVolume = currentVolume - 1;
    }

}
