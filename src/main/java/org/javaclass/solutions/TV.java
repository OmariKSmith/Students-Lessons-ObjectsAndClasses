package org.javaclass.solutions;

//!                             Declare the appropriate accessors, mutators,
//!                             and constructors for this class.
class TV {
    String brand;
    boolean isOn;
    int volume;
    int channel;
    boolean wifiEnabled;

    public TV() {
    }

    public TV(String brand, boolean isOn, int volume, int channel, boolean wifiEnabled) {
        this.brand = brand;
        this.isOn = isOn;
        this.volume = volume;
        this.channel = channel;
        this.wifiEnabled = wifiEnabled;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", volume=" + volume +
                ", channel=" + channel +
                ", wifiEnabled=" + wifiEnabled +
                '}';
    }
}


