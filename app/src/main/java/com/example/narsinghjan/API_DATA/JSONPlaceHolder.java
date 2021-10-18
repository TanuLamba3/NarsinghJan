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

    @POST("users")
    Call<Portfolio> postPortfolio(@Body Portfolio portfolio);
//
//    @GET("customer")
//    Call<List<Portfolio>> getPortfolioData();
//
//    @POST("order")
//    Call<OrderPost> postOrder(@Body OrderPost orderPost);
//
//    @GET("order")
//    Call<List<OrderDetails>> getOrderData();
//
//    @PUT("order/{id}")
//    Call<OrderDetails> update(@Path("id") int id,@Body OrderDetails orderDetails);
//
//    @DELETE("order/{id}")
//    Call<Void> delete(@Path("id") int id);

}
