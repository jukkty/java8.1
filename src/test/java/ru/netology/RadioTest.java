package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    void volumeAddedOnce() {
        Radio radio = new Radio();
        radio.volumeAdded();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedTillMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 10; i++)
            radio.volumeAdded();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedOverMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++)
            radio.volumeAdded();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedOnce() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume);
        radio.volumeReduced();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedTillMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume);
        for (int i = 0; i < 10; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume);
        for (int i = 0; i < 11; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void stationSwitchingPlusOnce() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation);
        radio.stationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusTillMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation);
        for (int i = 0; i < 9; i++)
            radio.stationNext();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation);
        for (int i = 0; i < 10; i++)
            radio.stationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOnce() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation);
        radio.stationPrev();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusTillMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation);
        for (int i = 0; i < 9; i++)
            radio.stationPrev();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOverMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation);
        for (int i = 0; i < 10; i++)
            radio.stationPrev();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void setStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}
