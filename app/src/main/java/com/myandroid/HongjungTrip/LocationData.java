package com.myandroid.HongjungTrip;

public class LocationData {
    private int iv_profile;
    private String tv_location;


    public LocationData(String tv_location, int iv_profile) {
        this.iv_profile = iv_profile;
        this.tv_location = tv_location;
    }

    public String getTv_location() {
        return tv_location;
    }

    public void setTv_location(String tv_location) {
        this.tv_location = tv_location;
    }

    public int getIv_profile() {
        return iv_profile;
    }

    public void setIv_profile(int iv_profile) {
        this.iv_profile = iv_profile;
    }
}
