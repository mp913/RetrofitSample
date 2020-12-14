package com.example.retrofitradiobutton;

import android.app.Application;
import com.example.retrofitradiobutton.api.JsonTestApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static JsonTestApi jsonTestApi;
    private Retrofit retrofit;
    @Override
    public void onCreate(){
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://date.jsontest.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonTestApi = retrofit.create(JsonTestApi.class);
    }

    public static JsonTestApi getApi()
    {
        return jsonTestApi;
    }
}
