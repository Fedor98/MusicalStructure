package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the Button that shows the Home Screen
        Button homeScreen = (Button) findViewById(R.id.home_screen_button);

        // Set a click listener on that Button
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Screen button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeScreenIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeScreenIntent);
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
                Intent artistsIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
                finish();
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
                Intent songsButtonIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsButtonIntent);
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
                Intent playlistsIntent = new Intent(NowPlayingActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
                finish();
            }
        });
    }
}
