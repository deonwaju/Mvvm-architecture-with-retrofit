package com.deonolarewaju.mvvvmwithretrofit.repository;

import androidx.lifecycle.MutableLiveData;

import com.deonolarewaju.mvvvmwithretrofit.model.MovieModel;
import com.deonolarewaju.mvvvmwithretrofit.network.APIInterface;
import com.deonolarewaju.mvvvmwithretrofit.network.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Deon Olarewaju on 20/8/20.
 */

public class MovieRepository {

    private APIInterface apiInterface;


    public MovieRepository() {
    }

    public MutableLiveData<MovieModel> getMovies() {
        final MutableLiveData<MovieModel> refferAndInvitePojoMutableLiveData = new MutableLiveData<>();
        apiInterface = ApiClient.getRetrofitInstance().create(APIInterface.class);
        Call<MovieModel> call = apiInterface.getdata();
        call.enqueue(new Callback<MovieModel>() {
            @Override
            public void onResponse(Call<MovieModel> call, Response<MovieModel> response) {
                if(response.body()!=null)
                {
                    refferAndInvitePojoMutableLiveData.setValue(response.body());
                }


            }

            @Override
            public void onFailure(Call<MovieModel> call, Throwable t) {

            }
        });

        return refferAndInvitePojoMutableLiveData;
    }
}
