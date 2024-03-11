package ru.netology.RadioStationsmvn;

public class Radio {
    private int maxRadioStationNumber = 9;
    private int minRadioStationNumber = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int numberOfRadioChannels = 10;
    private int currentRadioStationNumber;
    private int soundVolume;

    public Radio(int maxRadioStationNumber, int minRadioStationNumber, int maxSoundVolume, int minSoundVolume) {
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

    public Radio(int numberOfRadioChannels) {
        minRadioStationNumber = 1;
        maxRadioStationNumber = minRadioStationNumber + numberOfRadioChannels -1;
        this.numberOfRadioChannels = numberOfRadioChannels;
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


