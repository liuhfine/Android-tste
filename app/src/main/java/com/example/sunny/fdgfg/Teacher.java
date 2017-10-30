package com.example.sunny.fdgfg;

/**
 * Created by sunny on 2017/6/19.
 */

import android.support.annotation.NonNull;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Teacher {

    // 私有属性，只能被class自己访问，修改
    private int imageId;
    private String name;
    private String desc;

    // 可以被所有类访问
    public boolean isTeacher;

    // 只能被自己，子类及同一个包中的类访问
    protected String sex;


    // 构造函数
    public Teacher(int imageId, String name, String desc) {
        this.imageId = imageId;
        this.name = name;
        this.desc = desc;
        isTeacher = false;
    }

    // IO 返回dataSource
    public static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(R.mipmap.mode,"老王","要想生活很开心，头上必须顶点绿"));
        teachers.add(new Teacher(R.mipmap.phon,"隔壁","老王隔壁的隔壁"));
        teachers.add(new Teacher(R.mipmap.ldc,"翠花","街坊邻居称之豆腐西施"));
        teachers.add(new Teacher(R.mipmap.preview,"功夫","wo shi 路人甲乙丙丁"));

        return teachers;
    }

    // 提供外部属性访问接口
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}