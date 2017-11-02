package com.laneasy.qilee.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qilee on 2017/1/5.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
