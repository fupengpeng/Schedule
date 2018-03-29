package com.zhisimina.schedule.entity.bean;

import java.util.List;

/**
 * @author fupengpeng
 * @description 描述
 * @data 2018/3/23 0023 17:05
 */

public class Month {
    private String id;
    private String name;
    private List<Day> dayList;
    private boolean shifourunyue;
    private String yinliyue;

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

    public List<Day> getDayList() {
        return dayList;
    }

    public void setDayList(List<Day> dayList) {
        this.dayList = dayList;
    }

    public boolean isShifourunyue() {
        return shifourunyue;
    }

    public void setShifourunyue(boolean shifourunyue) {
        this.shifourunyue = shifourunyue;
    }

    public String getYinliyue() {
        return yinliyue;
    }

    public void setYinliyue(String yinliyue) {
        this.yinliyue = yinliyue;
    }
}
