package com.example.myapplication228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    Button bt_;
    EditText ed_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        bt_ = findViewById(R.id.buttonIntent);
        ed_ = findViewById(R.id.editTextIntent);

        bt_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = ed_.getText().toString();

                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);

                intent.putExtra("valor",texto);

                startActivity(intent);
            }
        });
    }
}