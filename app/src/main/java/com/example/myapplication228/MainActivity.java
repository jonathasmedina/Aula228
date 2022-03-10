package com.example.myapplication228;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView);
        img = findViewById(R.id.imageView);
    }

    public void funcao(View v){
        tv1.setText("Texto alterado.");
        img.setImageResource(R.drawable.images);
    }

}