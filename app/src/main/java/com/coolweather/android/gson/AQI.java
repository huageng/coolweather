package com.coolweather.android.gson;

/**
 * Created by admin on 2017/1/17.
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
