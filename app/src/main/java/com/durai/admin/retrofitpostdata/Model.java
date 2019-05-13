package com.durai.admin.retrofitpostdata;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.POST;

public class Model {
 String  username;
   String  userage;

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getUserdegree() {
        return userdegree;
    }



    public void setUserdegree(String userdegree) {
        this.userdegree = userdegree;
    }

    String userdegree;

}
