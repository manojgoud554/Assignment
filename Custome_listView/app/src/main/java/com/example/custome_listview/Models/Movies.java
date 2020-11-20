package com.example.custome_listview.Models;

import android.media.Image;

public class Movies {

    String MovieName;
    String ratings;
    String Description;
    String Category;
    String Date;
    Integer[] image_file;

    public Movies(String movieName, String ratings, String description,  String category,
            String date, Integer[] image_file) {
        this.MovieName = movieName;
        this.ratings = ratings;
        this.Description = description;
        this.Category = category;
        this.Date = date;
        this.image_file=image_file;

    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public void setDate(String Date) {
        this.Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() { return Date; }

    public String getCategory() {
        return Category;
    }

    public Integer getImage_file(int position) {
        return image_file[position];
    }

    public void setImage_file(Integer[] image_file) {
        this.image_file = image_file;
    }
}
