package com.kingleoners.cinemaint;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment {

    View view;
    private RecyclerView rvFilms;
    private ArrayList<Film> listFilm;

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_film, container, false);
        rvFilms = (RecyclerView) view.findViewById(R.id.rv_films);
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(getContext(),listFilm);
        rvFilms.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFilms.setAdapter(listFilmAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listFilm = new ArrayList<>();
        listFilm.addAll(FilmsData.getListData());

    }

    /*
    @Override
    public void onAttach(Context context) {
        super.onAttach(LocaleHelper.onAttach(context,"in"));
    }
    */

}
