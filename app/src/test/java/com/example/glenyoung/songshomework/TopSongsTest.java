package com.example.glenyoung.songshomework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by glenyoung on 05/07/2017.
 */

public class TopSongsTest {

    @Test
    public void canGetSongList() {
        TopSongs topSongs = new TopSongs();
        assertEquals(20, topSongs.getSongsList().size());
    }
}
