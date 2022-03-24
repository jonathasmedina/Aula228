package com.example.myapplication228;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    private Button bt1;
    private CheckBox ck1, ck2, ck3, ck4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        bt1 = findViewById(R.id.button7);
        ck1 = findViewById(R.id.checkBox1);
        ck2 = findViewById(R.id.checkBox2);
        ck3 = findViewById(R.id.checkBox3);
        ck4 = findViewById(R.id.checkBox4);

        //ouvinte do checkbox
        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked()){
                    Toast.makeText(getApplicationContext(), "CheckBox1 marcado", Toast.LENGTH_SHORT).show();
                }

            }
        });


        //ouvinte do button
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked()){
                    Toast.makeText(getApplicationContext(), "CheckBox1 marcado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}