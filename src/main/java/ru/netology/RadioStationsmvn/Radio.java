package ru.netology.RadioStationsmvn;

public class Radio {
    private int maxRadioStationNumber;
    private int minRadioStationNumber;
    private int maxSoundVolume;
    private int minSoundVolume;
    private int numberOfRadioChannels;
    private int currentRadioStationNumber;
    private int soundVolume;

    public Radio() {                           // без параметров
        this.maxRadioStationNumber = 9;
        this.minRadioStationNumber = 0;
        this.maxSoundVolume = 100;
        this.minSoundVolume = 0;
        this.numberOfRadioChannels = 10;
        this.soundVolume = 50;
        this.currentRadioStationNumber = 0;
    }

    public Radio(int numberOfRadioChannels) { // с одним параметром принимающим желаемое количество радиостанций
        minRadioStationNumber = 1;
        maxRadioStationNumber = minRadioStationNumber + numberOfRadioChannels - 1;
        this.numberOfRadioChannels = numberOfRadioChannels;
        maxSoundVolume = 100;
        minSoundVolume = 0;
        currentRadioStationNumber = 0;
        soundVolume = 50;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getNumberOfRadioChannels() {
        return numberOfRadioChannels;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            newCurrentRadioStationNumber = maxRadioStationNumber;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setToMaxTemp() {
        currentRadioStationNumber = maxRadioStationNumber;
    }

    public void switchChannelsWithButtonNext() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void switchChannelsWithButtonPrev() {
        if (currentRadioStationNumber == minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            newSoundVolume = minSoundVolume;
        }
        if (newSoundVolume > maxSoundVolume) {
            newSoundVolume = maxSoundVolume;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxSoundVolume() {
        soundVolume = maxSoundVolume;
    }

    public void increaseSoundVolumeWithButtonPlus() {
        if (soundVolume < maxSoundVolume) {
            soundVolume++;
        } else {
            soundVolume = maxSoundVolume;
        }
    }

    public void increaseSoundVolumeWithButtonMinus() {
        if (soundVolume > minSoundVolume) {
            soundVolume--;
        }
    }
}

