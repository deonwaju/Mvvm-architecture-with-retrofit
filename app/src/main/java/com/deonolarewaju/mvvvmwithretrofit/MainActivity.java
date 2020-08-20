package com.deonolarewaju.mvvvmwithretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deonolarewaju.mvvvmwithretrofit.ui.movielist.MovieListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.movie_list_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MovieListFragment.newInstance())
                    .commitNow();
        }

    }
}