package ru.netology;

public class Radio {
    int maxVolume = 10;
    int minVolume = 0;
    int currentVolume;
    int maxStation = 9;
    int minStation = 0;
    int currentStation;

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
            return;
    }

    public void volumeReduced() {
        currentVolume--;
        if (currentVolume <= minVolume)
            currentVolume = minVolume;
            return;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation){
        this.currentStation = currentStation;
    }

    public void stationNext() {
        currentStation++;
        if (currentStation > maxStation){
            currentStation = minStation;
        return;
        }
    }
    public void stationPrev() {
        currentStation--;
        if (currentStation < minStation){
            currentStation = maxStation;
        return;
        }
    }
}




