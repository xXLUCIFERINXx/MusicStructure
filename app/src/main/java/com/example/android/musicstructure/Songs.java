package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        Button albums = findViewById(R.id.albums_But);
        Button artists = findViewById(R.id.artists_But);
        Button genres = findViewById(R.id.genres_But);
        LinearLayout nowPlaying = findViewById(R.id.nowPlaying);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Albums.class);
                startActivity(intent);
            }
        });
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Artists.class);
                startActivity(intent);
            }
        });
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Genres.class);
                startActivity(intent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Playing.class);
                startActivity(intent);
            }
        });

        ArrayList<MusicClass> Songs = new ArrayList<>();
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song1"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song2"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song3"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song4"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song5"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song6"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song7"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song8"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song9"));
        Songs.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Song10"));

        MusicListAdapter GenresAdapter = new MusicListAdapter(this, Songs);
        ListView listView = findViewById(R.id.list_layout);
        listView.setAdapter(GenresAdapter);
    }
}
