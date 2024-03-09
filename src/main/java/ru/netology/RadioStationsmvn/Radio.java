package ru.netology.RadioStationsmvn;
public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

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

    public void SwitchChannelsWithButtonNext() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void SwitchChannelsWithButtonPrev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
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
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = 100;
        }
    }
        public void increaseSoundVolumeWithButtonMinus () {
            if (soundVolume > 0) {
                soundVolume = soundVolume - 1;
            }
        }
    }


