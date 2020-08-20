package com.deonolarewaju.mvvvmwithretrofit.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.deonolarewaju.mvvvmwithretrofit.model.MovieModel;
import com.deonolarewaju.mvvvmwithretrofit.repository.MovieRepository;

/**
 * Created by Deon Olarewaju on 20/8/20.
 */

public class MovieListViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<MovieModel> data;
    private MovieRepository movieModel;

    public MovieListViewModel() {
        movieModel = new MovieRepository();
    }

    public void init() {
        if (this.data != null) {
            // ViewModel is created per Fragment so
            // we know the userId won't change
            return;
        }
        data = movieModel.getMovies();
    }

    public MutableLiveData<MovieModel> getMovies() {
        return this.data;
    }
}
