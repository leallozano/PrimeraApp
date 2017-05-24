package com.example.caleal.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView img=(ImageView)findViewById(R.id.imagenRoca);
        img.setImageResource(R.drawable.images);
    }
}
