package com.example.data_center.persistence.model;

import java.sql.Timestamp;

public class MqttPointTable {
    private Timestamp time;
    private String value;
    private String pointId;
    private String pointName;

    // Getters and Setters
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }
}