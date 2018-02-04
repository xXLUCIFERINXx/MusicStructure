package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists);

        Button albums = findViewById(R.id.albums_But);
        Button songs = findViewById(R.id.songs_But);
        Button genres = findViewById(R.id.genres_But);
        LinearLayout nowPlaying = findViewById(R.id.nowPlaying);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Artists.this, Albums.class);
                startActivity(intent);
            }
        });
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Artists.this, Songs.class);
                startActivity(intent);
            }
        });
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Artists.this, Genres.class);
                startActivity(intent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Artists.this.releaseInstance();
                }
                Intent intent = new Intent(Artists.this, Playing.class);
                startActivity(intent);
            }
        });

        ArrayList<MusicClass> Artists = new ArrayList<>();
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist1"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist2"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist3"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist4"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist5"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist6"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist7"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist8"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist9"));
        Artists.add(new MusicClass(R.drawable.ic_music_note_white_48dp, "Artist10"));

        MusicGridAdapter ArtistsAdapter = new MusicGridAdapter(this, Artists);
        GridView gridView = findViewById(R.id.grid_layout);
        gridView.setAdapter(ArtistsAdapter);
    }
}
