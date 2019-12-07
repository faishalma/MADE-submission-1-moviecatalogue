package com.faishalma.imovies;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
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
    private String name;
    private String description;
    private String date;
    private String rating;
    private String director1;
    private String director2;
    private int photo;

    protected Movie(Parcel in) {
        name = in.readString();
        description = in.readString();
        date = in.readString();
        rating = in.readString();
        director1 = in.readString();
        director2 = in.readString();
        photo = in.readInt();
    }

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector1() {
        return director1;
    }

    public void setDirector1(String director1) {
        this.director1 = director1;
    }

    public String getDirector2() {
        return director2;
    }

    public void setDirector2(String director2) {
        this.director2 = director2;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(date);
        dest.writeString(rating);
        dest.writeString(director1);
        dest.writeString(director2);
        dest.writeInt(photo);
    }
}
