package com.laneasy.qilee.coolweather.gson;

/**
 * Created by qilee on 2017/1/5.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
