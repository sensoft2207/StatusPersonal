package com.sensoftindia.allinonestatus.model;

/**
 * Created by mxi on 30/12/17.
 */

public class HaptoData {

    String member_name;

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    String statusID;

    public HaptoData(String member_name) {

        this.member_name = member_name;
    }

    public HaptoData() {

    }


    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }
}
