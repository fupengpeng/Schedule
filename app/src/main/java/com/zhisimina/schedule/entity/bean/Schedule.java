package com.zhisimina.schedule.entity.bean;

import java.util.List;

/**
 * @author fupengpeng
 * @description 日程
 * @data 2018/3/23 0023 17:13
 */

public class Schedule {

    private String id;
    private String name;
    private String kaishishijian;
    private String jieshushijian;
    private String tixingfangshi;
    private String teshusheding;
    private String shuoming;
    private String canyurenyuan;
    private String address;

    private List<Day> ddList;  // 日程
    private boolean select;

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

    public String getKaishishijian() {
        return kaishishijian;
    }

    public void setKaishishijian(String kaishishijian) {
        this.kaishishijian = kaishishijian;
    }

    public String getJieshushijian() {
        return jieshushijian;
    }

    public void setJieshushijian(String jieshushijian) {
        this.jieshushijian = jieshushijian;
    }

    public String getTixingfangshi() {
        return tixingfangshi;
    }

    public void setTixingfangshi(String tixingfangshi) {
        this.tixingfangshi = tixingfangshi;
    }

    public String getTeshusheding() {
        return teshusheding;
    }

    public void setTeshusheding(String teshusheding) {
        this.teshusheding = teshusheding;
    }

    public String getShuoming() {
        return shuoming;
    }

    public void setShuoming(String shuoming) {
        this.shuoming = shuoming;
    }

    public String getCanyurenyuan() {
        return canyurenyuan;
    }

    public void setCanyurenyuan(String canyurenyuan) {
        this.canyurenyuan = canyurenyuan;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Day> getDdList() {
        return ddList;
    }

    public void setDdList(List<Day> ddList) {
        this.ddList = ddList;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }
}
