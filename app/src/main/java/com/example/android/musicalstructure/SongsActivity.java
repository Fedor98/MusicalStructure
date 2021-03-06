package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the artists category
        Button artists = (Button) findViewById(R.id.artists_button);

        // Set a click listener on that Button
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
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
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);

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
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
                finish();
            }
        });
    }
}
