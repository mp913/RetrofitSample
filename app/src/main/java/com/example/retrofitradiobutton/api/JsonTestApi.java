package com.example.retrofitradiobutton.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.example.retrofitradiobutton.DateTime;
import com.example.retrofitradiobutton.IPadress;

public interface JsonTestApi {

    @GET(".")
    Call<List<DateTime>> getData(@Query ("service") String service);

    @GET("/")
    Call<List<IPadress>> getIP(@Query ("service") String service);
}
