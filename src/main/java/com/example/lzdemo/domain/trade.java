package com.example.lzdemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class trade {
    @Id
    private Integer ID;
    private String order_id;

    public trade() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public trade(Integer ID, String order_id) {
        this.ID = ID;
        this.order_id = order_id;
    }
}
