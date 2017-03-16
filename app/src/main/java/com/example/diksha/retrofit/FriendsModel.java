package com.example.diksha.retrofit;

/**
 * Created by diksha on 15/3/17.
 */

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendsModel {

    @SerializedName("friends")
    @Expose
    private ArrayList<Friend> friends = null;

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }

}