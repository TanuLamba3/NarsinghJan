package com.example.narsinghjan.API_DATA;

import com.example.narsinghjan.Classes.Portfolio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface JSONPlaceHolder {

    @POST("api/users")
    Call<Portfolio> postPortfolio(@Body Portfolio portfolio);

    @GET("generate-idcard/{id}")
    Call<Void> downloadCard(@Path("id") int id);
}
