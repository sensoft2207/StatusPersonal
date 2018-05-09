package com.sensoftindia.allinonestatus.model;

/**
 * Created by mxi on 13/10/17.
 */

public class PointTable {

    int id;

    public String getPoints() {
        return points;
    }

    String points;

    public PointTable() {

    }

    public PointTable(String points) {
        this.points = points;
    }

    public PointTable(int id, String points) {
        this.id = id;
        this.points = points;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(String tag_name) {
        this.points = tag_name;
    }

    // getter
    public int getId() {
        return this.id;
    }

}
