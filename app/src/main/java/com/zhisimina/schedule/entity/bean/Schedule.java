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

}
