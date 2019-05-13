package com.durai.admin.retrofitpostdata;

import com.google.gson.annotations.SerializedName;

public class ModelData {

    String username;
    int userage;

    public ModelData(String username, int userage, String userdegree) {
        this.username = username;
        this.userage = userage;
        this.userdegree = userdegree;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
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
