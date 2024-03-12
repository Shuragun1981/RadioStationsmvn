//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.RadioStationsmvn;

public class Radio {
    private int maxRadioStationNumber;
    private int minRadioStationNumber;
    private int maxSoundVolume;
    private int minSoundVolume;
    private int numberOfRadioChannels;
    private int currentRadioStationNumber;
    private int soundVolume;

    public Radio() {
        this.maxRadioStationNumber = 9;
        this.minRadioStationNumber = 0;
        this.maxSoundVolume = 100;
        this.minSoundVolume = 0;
        this.numberOfRadioChannels = 10;
        this.soundVolume = 50;
        this.currentRadioStationNumber = 0;
    }

    public Radio(int numberOfRadioChannels) {
        this.minRadioStationNumber = 1;
        this.maxRadioStationNumber = this.minRadioStationNumber + numberOfRadioChannels - 1;
        this.numberOfRadioChannels = numberOfRadioChannels;
        this.maxSoundVolume = 100;
        this.minSoundVolume = 0;
        this.currentRadioStationNumber = 0;
        this.soundVolume = 50;
    }

    public int getMaxRadioStationNumber() {
        return this.maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return this.minRadioStationNumber;
    }

    public int getMaxSoundVolume() {
        return this.maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return this.minSoundVolume;
    }

    public int getNumberOfRadioChannels() {
        return this.numberOfRadioChannels;
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < this.minRadioStationNumber) {
            newCurrentRadioStationNumber = this.maxRadioStationNumber;
        }

        if (newCurrentRadioStationNumber <= this.maxRadioStationNumber) {
            this.currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }

    public void setToMaxTemp() {
        this.currentRadioStationNumber = this.maxRadioStationNumber;
    }

    public void switchChannelsWithButtonNext() {
        if (this.currentRadioStationNumber == this.maxRadioStationNumber) {
            this.currentRadioStationNumber = this.minRadioStationNumber;
        } else {
            ++this.currentRadioStationNumber;
        }

    }

    public void switchChannelsWithButtonPrev() {
        if (this.currentRadioStationNumber == this.minRadioStationNumber) {
            this.currentRadioStationNumber = this.maxRadioStationNumber;
        } else {
            --this.currentRadioStationNumber;
        }

    }

    public int getSoundVolume() {
        return this.soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < this.minSoundVolume) {
            newSoundVolume = this.minSoundVolume;
        }

        if (newSoundVolume > this.maxSoundVolume) {
            newSoundVolume = this.maxSoundVolume;
        }

        this.soundVolume = newSoundVolume;
    }

    public void setToMaxSoundVolume() {
        this.soundVolume = this.maxSoundVolume;
    }

    public void increaseSoundVolumeWithButtonPlus() {
        if (this.soundVolume < this.maxSoundVolume) {
            ++this.soundVolume;
        } else {
            this.soundVolume = this.maxSoundVolume;
        }

    }

    public void increaseSoundVolumeWithButtonMinus() {
        if (this.soundVolume > this.minSoundVolume) {
            --this.soundVolume;
        }

    }

    public Radio(int maxRadioStationNumber, int minRadioStationNumber, int maxSoundVolume, int minSoundVolume, int numberOfRadioChannels, int currentRadioStationNumber, int soundVolume) {
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.numberOfRadioChannels = numberOfRadioChannels;
        this.currentRadioStationNumber = currentRadioStationNumber;
        this.soundVolume = soundVolume;
    }

    public void setMaxRadioStationNumber(int maxRadioStationNumber) {
        this.maxRadioStationNumber = maxRadioStationNumber;
    }

    public void setMinRadioStationNumber(int minRadioStationNumber) {
        this.minRadioStationNumber = minRadioStationNumber;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public void setNumberOfRadioChannels(int numberOfRadioChannels) {
        this.numberOfRadioChannels = numberOfRadioChannels;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMaxRadioStationNumber() != other.getMaxRadioStationNumber()) {
                return false;
            } else if (this.getMinRadioStationNumber() != other.getMinRadioStationNumber()) {
                return false;
            } else if (this.getMaxSoundVolume() != other.getMaxSoundVolume()) {
                return false;
            } else if (this.getMinSoundVolume() != other.getMinSoundVolume()) {
                return false;
            } else if (this.getNumberOfRadioChannels() != other.getNumberOfRadioChannels()) {
                return false;
            } else if (this.getCurrentRadioStationNumber() != other.getCurrentRadioStationNumber()) {
                return false;
            } else {
                return this.getSoundVolume() == other.getSoundVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getMaxRadioStationNumber();
        result = result * 59 + this.getMinRadioStationNumber();
        result = result * 59 + this.getMaxSoundVolume();
        result = result * 59 + this.getMinSoundVolume();
        result = result * 59 + this.getNumberOfRadioChannels();
        result = result * 59 + this.getCurrentRadioStationNumber();
        result = result * 59 + this.getSoundVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMaxRadioStationNumber();
        return "Radio(maxRadioStationNumber=" + var10000 + ", minRadioStationNumber=" + this.getMinRadioStationNumber() + ", maxSoundVolume=" + this.getMaxSoundVolume() + ", minSoundVolume=" + this.getMinSoundVolume() + ", numberOfRadioChannels=" + this.getNumberOfRadioChannels() + ", currentRadioStationNumber=" + this.getCurrentRadioStationNumber() + ", soundVolume=" + this.getSoundVolume() + ")";
    }
}
