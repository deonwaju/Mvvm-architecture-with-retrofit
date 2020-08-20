package com.deonolarewaju.mvvvmwithretrofit.network;

import com.deonolarewaju.mvvvmwithretrofit.model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Deon Olarewaju on 20/8/20.
 */
public interface APIInterface
{

    @GET("/api/unknown")
    Call<MovieModel> getdata();
}
