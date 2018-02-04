package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genres);

        Button albums = findViewById(R.id.albums_But);
        Button songs = findViewById(R.id.songs_But);
        Button artists = findViewById(R.id.artists_But);
        LinearLayout nowPlaying = findViewById(R.id.nowPlaying);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genres.this, Albums.class);
                startActivity(intent);
            }
        });
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genres.this, Songs.class);
                startActivity(intent);
            }
        });
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genres.this, Artists.class);
                startActivity(intent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genres.this, Playing.class);
                startActivity(intent);
            }
        });

        ArrayList<MusicClass> Genres = new ArrayList<>();
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre1"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre2"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre3"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre4"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre5"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre6"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre7"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre8"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre9"));
        Genres.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Genre10"));

        MusicListAdapter GenresAdapter = new MusicListAdapter(this, Genres);
        ListView listView = findViewById(R.id.list_layout);
        listView.setAdapter(GenresAdapter);
    }
}
