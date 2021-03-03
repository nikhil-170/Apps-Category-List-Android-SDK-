package com.example.inclass05;
/*
HomeWork01
FileName - HW01
Group1B- Pramukh Nagendra &
         Nikhil Surya Petiti
 */

import java.io.Serializable;
import java.util.ArrayList;

public class App implements Serializable {
    ArrayList<String> genres;
    String id, artistId, artistName, artworkUrl100, name, releaseDate, url;

    public App(ArrayList<String> genres, String id, String artistId, String artistName, String artworkUrl100, String name, String releaseDate, String url) {
        this.genres = genres;
        this.id = id;
        this.artistId = artistId;
        this.artistName = artistName;
        this.artworkUrl100 = artworkUrl100;
        this.name = name;
        this.releaseDate = releaseDate;
        this.url = url;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", artistId='" + artistId + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", url='" + url + '\'' +
                ", genres=" + genres +
                '}';
    }
}
