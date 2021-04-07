package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void volumeAddedOnce() {
        Radio radio = new Radio(100,0,0,10,0,0);
        radio.volumeAdded();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedTillMax() {
        Radio radio = new Radio(100,0,0,10,0,1);
        for (int i = 0; i < 100; i++)
            radio.volumeAdded();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedOverMax() {
        Radio radio = new Radio(100,0,0,10,0,1);
        for (int i = 0; i < 101; i++)
            radio.volumeAdded();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedOnce() {
        Radio radio = new Radio(100,0,100,10,0,1);
        radio.volumeReduced();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedTillMin() {
        Radio radio = new Radio(100,0,100,10,0,1);
        radio.setCurrentVolume(50);
        for (int i = 0; i < 100; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedBelowZero() {
        Radio radio = new Radio(100,0,100,10,0,1);
        for (int i = 0; i < 101; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void stationSwitchingPlusOnce() {
        Radio radio = new Radio(100,0,0,10,0,0);
        radio.stationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusTillMax() {
        Radio radio = new Radio(100,0,0,10,0,0);
        for (int i = 0; i < 10; i++)
            radio.stationNext();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusOverMax() {
        Radio radio = new Radio(100,0,0,10,0,0);
        for (int i = 0; i < 11; i++)
            radio.stationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOnce() {
        Radio radio = new Radio(100,0,0,10,0,10);
        radio.stationPrev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusTillMin() {
        Radio radio = new Radio(100,0,0,10,0,10);
        for (int i = 0; i < 10; i++)
            radio.stationPrev();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOverMin() {
        Radio radio = new Radio(100,0,0,10,0,10);
        for (int i = 0; i < 11; i++)
            radio.stationPrev();
        assertEquals(10, radio.getCurrentStation());
    }
    @Test
    void setStationOverMax() {
        Radio radio = new Radio(100,0,0,10,0,0);
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setStationBelowMin() {
        Radio radio = new Radio(100,0,0,10,0,0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setStationAsCurrent() {
        Radio radio = new Radio(100,0,0,10,0,0);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }
}
