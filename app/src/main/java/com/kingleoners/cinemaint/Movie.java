package com.kingleoners.cinemaint;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name_movie;
    private String from_movie;
    private String cover_movie;

    protected Movie(Parcel in) {
        name_movie = in.readString();
        from_movie = in.readString();
        cover_movie = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    public String getFrom_movie() {
        return from_movie;
    }

    public void setFrom_movie(String from_movie) {
        this.from_movie = from_movie;
    }

    public String getCover_movie() {
        return cover_movie;
    }

    public void setCover_movie(String cover_movie) {
        this.cover_movie = cover_movie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name_movie);
        dest.writeString(from_movie);
        dest.writeString(cover_movie);
    }
}
