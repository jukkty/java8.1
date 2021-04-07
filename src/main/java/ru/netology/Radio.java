package ru.netology;

public class Radio {
    int maxVolume;
    int currentVolume;
    int maxStation;
    int minStation;
    int currentStation;
    int minVolume;

    public Radio(int maxVolume, int minVolume, int currentVolume, int maxStation, int minStation, int currentStation) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    public void volumeAdded() {
        currentVolume++;
        if (currentVolume >= maxVolume)
            currentVolume = maxVolume;
    }

    public void volumeReduced() {
        currentVolume--;
        if (currentVolume <= minVolume)
            currentVolume = minVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void stationNext() {
        currentStation++;
        if (currentStation > maxStation){
            currentStation = minStation;
        }
    }
    public void stationPrev() {
        currentStation--;
        if (currentStation < minStation){
            currentStation = maxStation;
        }
    }
}



