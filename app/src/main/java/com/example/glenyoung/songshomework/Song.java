package com.example.glenyoung.songshomework;

/**
 * Created by glenyoung on 05/07/2017.
 */

public class Song {
    private String title;
    private String artist;
    private int rank;
    private int year;

    public Song(String title, String artist, Integer rank, Integer year) {
        this.title = title;
        this.artist = artist;
        this.rank = rank;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRank() {
        return rank;
    }

    public int getYear() {
        return year;
    }

}
