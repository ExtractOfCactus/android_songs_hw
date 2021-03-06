package com.example.glenyoung.songshomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by glenyoung on 05/07/2017.
 */

public class TopSongsAdapter extends ArrayAdapter<Song> {

    public TopSongsAdapter(Context context, ArrayList<Song> songsList) {
        super(context, 0, songsList);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRank().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSong.getTitle());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentSong.getYear().toString());

        listItemView.setTag(currentSong);

        return listItemView;
    }
}
