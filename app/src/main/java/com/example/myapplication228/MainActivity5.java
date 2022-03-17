package com.example.myapplication228;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button bt1;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bt1 = findViewById(R.id.buttonVerificaRadio);
        radioGroup = findViewById(R.id.radioGroup1);

        Intent intent = getIntent();
        String texto = (String) intent.getSerializableExtra("valor");
        Toast.makeText(getApplicationContext(),
                texto,
                Toast.LENGTH_SHORT).show();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(),
                                "Primeira opção",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(),
                                "Segunda opção",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(),
                                "Terceira opção",
                                Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }



}