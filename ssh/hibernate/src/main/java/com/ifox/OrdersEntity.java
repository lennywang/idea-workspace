package com.ifox;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "orders", schema = "test", catalog = "")
public class OrdersEntity {
    private int id;
    private String number;
    private Timestamp createtime;
    private String note;

    public OrdersEntity() {
    }

    public OrdersEntity(int id, String number, String note) {
        this.id = id;
        this.number = number;
        this.note = note;
    }

    public OrdersEntity(int id, String number, Timestamp createtime, String note) {
        this.id = id;
        this.number = number;
        this.createtime =createtime;
        this.note = note;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}
