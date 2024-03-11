package ru.netology.RadioStationsmvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio(9, 0, 100, 0);
        Assertions.assertEquals(9, radio.getMaxRadioStationNumber());
        Assertions.assertEquals(0, radio.getMinRadioStationNumber());
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(10, radio.getNumberOfRadioChannels());
    }

    @Test
    public void numberOfRadioChannels() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10, radio.getNumberOfRadioChannels());
    }

    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxChannel() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setToMaxTemp();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToAboveMaxChannel() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToBelowMaxChannel() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchChannelsWithButtonNext() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(8);
        radio.switchChannelsWithButtonNext();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchChannelsWithButtonNext1() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(9);
        radio.switchChannelsWithButtonNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchChannelsWithButtonPrev() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(2);
        radio.switchChannelsWithButtonPrev();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitSwitchChannelsWithButtonPrev() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setCurrentRadioStationNumber(0);
        radio.switchChannelsWithButtonPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(10);
        int expected = 10;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setToMaxSoundVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToAboveSoundVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(101);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToBelowSoundVolume() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWithButtonPlus() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(1);
        radio.increaseSoundVolumeWithButtonPlus();
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitIncreaseSoundVolumeWithButtonPlus() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(100);
        radio.increaseSoundVolumeWithButtonPlus();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWithButtonMinus() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(2);
        radio.increaseSoundVolumeWithButtonMinus();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitDecreaseSoundVolumeWithButtonMinus1() {
        Radio radio = new Radio(9, 0, 100, 0);
        radio.setSoundVolume(0);
        radio.increaseSoundVolumeWithButtonMinus();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
