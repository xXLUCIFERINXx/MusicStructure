package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);

        Button songs = findViewById(R.id.songs_But);
        Button artists = findViewById(R.id.artists_But);
        Button genres = findViewById(R.id.genres_But);
        LinearLayout nowPlaying = findViewById(R.id.nowPlaying);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Albums.this, Songs.class);
                startActivity(intent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Albums.this, Artists.class);
                startActivity(intent);
            }
        });

        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Albums.this, Genres.class);
                startActivity(intent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Albums.this, Playing.class);
                startActivity(intent);
            }
        });

        ArrayList<MusicClass> Albums = new ArrayList<>();
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album1"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album2"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album3"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album4"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album5"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album6"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album7"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album8"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album9"));
        Albums.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Album10"));

        MusicGridAdapter AlbumsAdapter = new MusicGridAdapter(this, Albums);
        GridView gridView = findViewById(R.id.grid_layout);
        gridView.setAdapter(AlbumsAdapter);
    }
}
