package com.durai.admin.retrofitpostdata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface dataapi {

    @POST("init.php")
    @FormUrlEncoded

    Call<ModelData> data(@Field("username") String username,
                         @Field("userage") int userage,
                           @Field("userdegree") String userdegree);


}
