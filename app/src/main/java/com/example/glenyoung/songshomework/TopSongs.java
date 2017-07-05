package com.example.glenyoung.songshomework;

import java.util.ArrayList;

/**
 * Created by glenyoung on 05/07/2017.
 */

public class TopSongs {
    private ArrayList<Song> songsList;

    public TopSongs(){
        songsList = new ArrayList<Song>();
        songsList.add(new Song("You Shook Me All Night Long", "AC/DC", 1, 1980));
        songsList.add(new Song("Kashmir", "Led Zeppelin", 2, 1975));
        songsList.add(new Song("Can I Play With Madness", "Iron Maiden", 3, 1988));
        songsList.add(new Song("Freebird", "Lynyrd Skynyrd", 4, 1974));
        songsList.add(new Song("Don't Drink the Water", "Dave Matthews Band", 5, 1998));
        songsList.add(new Song("Fortunate Son", "Creedence Clearwater Revival", 6, 1969));
        songsList.add(new Song("Paranoid", "Black Sabbath", 7, 1970));
        songsList.add(new Song("Roxanne", "The Police", 8, 1978));
        songsList.add(new Song("Mercy", "Muse", 9, 2015));
        songsList.add(new Song("Under The Bridge", "Red Hot Chili Peppers", 10, 1991));
        songsList.add(new Song("Black Hole Sun", "Soundgarden", 11, 1994));
        songsList.add(new Song("Deeper Underground", "Jamiroquai", 12, 1998));
        songsList.add(new Song("Superstition", "Stevie Wonder", 13, 1972));
        songsList.add(new Song("Ballad of the Beacon", "Wishbone Ash", 14, 1973));
        songsList.add(new Song("Cecilia", "Simon and Garfunkel", 15, 1970));
        songsList.add(new Song("Mr Tambourine Man", "Bob Dylan", 16, 1965));
        songsList.add(new Song("Wild Horses", "The Rolling Stones", 17, 1971));
        songsList.add(new Song("Crazy Crazy Nights", "Kiss", 18, 1987));
        songsList.add(new Song("One", "Metallica", 19, 1988));
        songsList.add(new Song("Godzilla", "Blue Oyster Cult", 20, 1977));
    }

    public ArrayList<Song> getSongsList() {
        return new ArrayList<Song>(songsList);
    }
}
