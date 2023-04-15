package com.practicemvvm.api;

import com.practicemvvm.models.ModelClass;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("login.php")
    Call<ArrayList<ModelClass>>getData();


}
