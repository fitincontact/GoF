package com.fitin.patterns.s.Bridge.impl;

import com.fitin.patterns.s.Bridge.Device;

public class Tv implements Device {
    private boolean isEnabled;
    private  int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
    }

    @Override
    public void disable() {
        isEnabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "isEnabled=" + isEnabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
