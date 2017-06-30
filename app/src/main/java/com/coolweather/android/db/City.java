package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kelianzhikong on 2017/6/23.
 */

public class City  extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    protected int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;//记录市的名字
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;//记录市的代号
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;//记录当前市所属省的id值
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
