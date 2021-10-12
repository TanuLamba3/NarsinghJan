package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        imageView = findViewById(R.id.image_view);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("full screen image");

        Intent intent = getIntent();
        int i = intent.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[i]);
    }
}