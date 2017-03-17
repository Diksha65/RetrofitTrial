package com.example.diksha.retrofit;

/**
 * Created by diksha on 15/3/17.
 */

import android.content.Context;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendsModel {

    @SerializedName("friends")
    @Expose
    private List<Friend> friends = null;

    public List<Friend> getfriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    /**
     * @param context Todo What is this for?
     *                Changed private to public.
     */
    public FriendsModel(Context context){
        friends = new ArrayList<>();
        for(int i=0;i<100;i++){
            Friend friend = new Friend();
            friend.setName("Friend #" + i);
            friend.setRollNo("1000" + i);
            friend.setBranch("Branch %" + i);
        }
    }

}