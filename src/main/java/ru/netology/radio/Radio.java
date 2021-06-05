package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int volume;

    public void nextButton() {
        if (this.currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void prevButton() {
        if (this.currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //    Let's do it for volume!'
    private boolean isVolumeMax(int currentVolume) {
        return currentVolume == 9;
    }

    public void volumeUp() {
        if (this.isVolumeMax(this.volume)) {
            return;
        }
        this.volume++;
    }

    private boolean isVolumeMin(int currentVolume) {
        return currentVolume == 0;
    }

    public void volumeDown() {
        if (this.isVolumeMin(this.volume)) {
            return;
        }
        this.volume--;
    }

    public int getVolume() {
        return volume;
    }
}
