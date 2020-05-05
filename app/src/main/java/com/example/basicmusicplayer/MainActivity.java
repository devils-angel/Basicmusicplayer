package com.example.basicmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         an object of class MediaPlayer created named player
         a mp3 file is added to the object using create method*/
        player = MediaPlayer.create(this, R.raw.adele);

//        setting up  inline event listeners to the button
//        first comes the play button
        Button play_music = findViewById(R.id.play);
        play_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                player.start();

            }
        });

//        adding event listener on pause button
        Button pause_music = findViewById(R.id.pause);
        pause_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "paused sound",Toast.LENGTH_SHORT).show();
                player.pause();

            }
        });

//        adding event listener for stop button
        Button stop_music = findViewById(R.id.stop);
        stop_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "stopped sound",Toast.LENGTH_SHORT).show();
                player.stop();

            }
        });



    }
}
