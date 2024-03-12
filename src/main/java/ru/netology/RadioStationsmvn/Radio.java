package ru.netology.RadioStationsmvn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxRadioStationNumber;
    private int minRadioStationNumber;
    private int maxSoundVolume;
    private int minSoundVolume;
    private int numberOfRadioChannels;
    private int currentRadioStationNumber;
    private int soundVolume;


}
