package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the Button that shows the Home Screen
        Button homeScreen = (Button) findViewById(R.id.home_screen_button);

        // Set a click listener on that Button
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Screen button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent songsIntent = new Intent(PlaylistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the Button that shows the songs category
        Button songsButton = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that Button
        songsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsButtonIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsButtonIntent);
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
                Intent nowPlayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the artists category
        Button artists = (Button) findViewById(R.id.artists_button);

        // Set a click listener on that Button
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }
}
