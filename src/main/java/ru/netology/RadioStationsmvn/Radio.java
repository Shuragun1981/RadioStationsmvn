package ru.netology.RadioStationsmvn;

public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            newCurrentRadioStationNumber = 9;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setToMaxTemp() {
        currentRadioStationNumber = 9;
    }

    public void switchChannelsWithButtonNext() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void switchChannelsWithButtonPrev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        if (newSoundVolume > 100) {
            newSoundVolume = 100;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxSoundVolume() {
        soundVolume = 100;
    }

    public void increaseSoundVolumeWithButtonPlus() {
        if (soundVolume < 100) {
            soundVolume++;
        } else {
            soundVolume = 100;
        }
    }

    public void increaseSoundVolumeWithButtonMinus() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}


