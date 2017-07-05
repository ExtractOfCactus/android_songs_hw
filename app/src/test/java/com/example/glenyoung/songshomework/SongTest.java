package com.example.glenyoung.songshomework;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by glenyoung on 05/07/2017.
 */

public class SongTest {
    Song song;

    @Before
    public void before() {
        song = new Song("Paranoid", "Black Sabbath", 3, 1970);
    }

    @Test
    public void canGetTitle() {
        assertEquals("Paranoid", song.getTitle());
    }

    @Test
    public void canGetArtist() {
        assertEquals("Black Sabbath", song.getArtist());
    }

    @Test
    public void canGetRank() {
        assertEquals(3, song.getRank());
    }

    @Test
    public void canGetYear() {
        assertEquals(1970, song.getYear());
    }
}
