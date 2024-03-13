package ru.netology.RadioStationsmvn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int maxRadioStationNumber = 9;
    private int minRadioStationNumber = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int numberOfRadioChannels = 10;
    private int currentRadioStationNumber;
    private int soundVolume;

    public void setToMaxTemp() {
        {
            currentRadioStationNumber = maxRadioStationNumber;
        }

    }

    public void switchChannelsWithButtonNext() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            currentRadioStationNumber++;
        }
    }


    public void switchChannelsWithButtonPrev(){
        if (currentRadioStationNumber == minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber--;
        }
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
        if (soundVolume > minSoundVolume)
            soundVolume--;
        }
}