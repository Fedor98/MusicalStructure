package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Find the Button that shows the Home Screen
        Button homeScreen = (Button) findViewById(R.id.home_screen_button);

        // Set a click listener on that Button
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Screen button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeScreenIntent = new Intent(ArtistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeScreenIntent);
            }
        });

        // Find the Button that shows the songs category
        Button songs = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that Button
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
                finish();
            }
        });

        // Find the Button that shows the NowPlaying category
        Button nowPlaying = (Button) findViewById(R.id.nowPlaying_button);

        // Set a click listener on that Button
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
                finish();
            }
        });

        // Find the Button that shows the playlists category
        Button playlists = (Button) findViewById(R.id.playlists_button);

        // Set a click listener on that Button
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
                finish();
            }
        });
    }
}
