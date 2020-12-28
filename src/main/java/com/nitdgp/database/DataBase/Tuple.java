package com.nitdgp.database.DataBase;

import javax.persistence.*;

@Entity
@Table(name="STUDENTS")
public class Tuple {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String mobile_no;
    @Column
    private String trade;

    public Tuple() {
    }

    public Tuple(int id, String name, int age, String mobile_no, String trade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.trade = trade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }
}
