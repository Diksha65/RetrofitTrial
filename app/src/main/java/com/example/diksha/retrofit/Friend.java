package com.example.diksha.retrofit;

/**
 * Created by diksha on 15/3/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Friend {

    @SerializedName("branch")
    @Expose
    private String branch;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("roll_no")
    @Expose
    private String rollNo;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

}