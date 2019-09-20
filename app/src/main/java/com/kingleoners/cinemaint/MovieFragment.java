package com.kingleoners.cinemaint;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    View view_movie;
    private RecyclerView rvMovies;
    private ArrayList<Movie> listMovie;

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view_movie = inflater.inflate(R.layout.fragment_movie, container, false);
        rvMovies = (RecyclerView) view_movie.findViewById(R.id.rv_movies);
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(getContext(),listMovie);
        rvMovies.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMovies.setAdapter(listMovieAdapter);
        return view_movie;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listMovie = new ArrayList<>();
        listMovie.addAll(MoviesData.getListData());
    }
}
