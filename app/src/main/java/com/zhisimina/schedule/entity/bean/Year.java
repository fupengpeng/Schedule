package com.zhisimina.schedule.entity.bean;

import java.util.List;

/**
 * @author fupengpeng
 * @description 描述
 * @data 2018/3/23 0023 17:04
 */

public class Year {

    private String id;
    private String name;
    private List<Month> monthList;
    private boolean shifourunnian;
    private String yinninian;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Month> getMonthList() {
        return monthList;
    }

    public void setMonthList(List<Month> monthList) {
        this.monthList = monthList;
    }

    public boolean isShifourunnian() {
        return shifourunnian;
    }

    public void setShifourunnian(boolean shifourunnian) {
        this.shifourunnian = shifourunnian;
    }

    public String getYinninian() {
        return yinninian;
    }

    public void setYinninian(String yinninian) {
        this.yinninian = yinninian;
    }
}
