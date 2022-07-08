package com.example.retrofitapi;



import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi
{
    @GET("api?results=10")
    Call<Example> getJson();



}
