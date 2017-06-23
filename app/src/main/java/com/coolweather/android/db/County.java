package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kelianzhikong on 2017/6/23.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;//记录县的名字
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;//记录先所对应的天气id
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;//记录当前县所属市的id值
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
