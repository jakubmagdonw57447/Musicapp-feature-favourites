package com.example.stud.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.stud.musicapp.favourites.FavouritesActivity;
import com.example.stud.musicapp.topsongs.TopSongsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bTopSongs = findViewById(R.id.top_song);
        bTopSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TopSongsActivity.class);
                startActivity(intent);
            };
        });
        Button bfavourites = findViewById(R.id.bFavourites);
        bfavourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, FavouritesActivity.class);
                startActivity(intent);
            };
        });
}
}

