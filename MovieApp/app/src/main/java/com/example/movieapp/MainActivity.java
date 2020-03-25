package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    public ImageView imageView2;
    public Button all;
    public Button date;
    public Button rating;
    public Button expected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.mainmenucover);


        all = (Button) findViewById(R.id.all);
        all.setTextColor(Color.parseColor("#ffa500"));
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all.setTextColor(Color.parseColor("#ffa500"));
                date.setTextColor(Color.parseColor("#FFFFFF"));
                rating.setTextColor(Color.parseColor("#FFFFFF"));
                expected.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        date = (Button) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all.setTextColor(Color.parseColor("#FFFFFF"));
                date.setTextColor(Color.parseColor("#ffa500"));
                rating.setTextColor(Color.parseColor("#FFFFFF"));
                expected.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        rating = (Button) findViewById(R.id.rating);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all.setTextColor(Color.parseColor("#FFFFFF"));
                date.setTextColor(Color.parseColor("#FFFFFF"));
                rating.setTextColor(Color.parseColor("#ffa500"));
                expected.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        expected = (Button) findViewById(R.id.expected);
        expected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all.setTextColor(Color.parseColor("#FFFFFF"));
                date.setTextColor(Color.parseColor("#FFFFFF"));
                rating.setTextColor(Color.parseColor("#FFFFFF"));
                expected.setTextColor(Color.parseColor("#ffa500"));
            }
        });
    }

}
