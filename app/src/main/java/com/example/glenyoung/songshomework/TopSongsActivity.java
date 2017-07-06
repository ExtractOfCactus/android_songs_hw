package com.example.glenyoung.songshomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> songsList = topSongs.getSongsList();
        TopSongsAdapter songsAdapter = new TopSongsAdapter(this, songsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }

    public void getSong(View listItem) {
        Song song = (Song) listItem.getTag();
        Log.d(getClass().toString(), song.getTitle());
    }
}
