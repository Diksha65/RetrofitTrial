package com.example.diksha.retrofit;

/**
 * Created by diksha on 15/3/17.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendsModel {

    @SerializedName("friends")
    @Expose
    private List<Friend> friends = null;

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

}