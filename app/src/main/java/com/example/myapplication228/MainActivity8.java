package com.example.myapplication228;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    Spinner spinner;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        spinner = findViewById(R.id.spinner_);
        aSwitch = findViewById(R.id.switch1);

        //ouvinte para o switch
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Log.e("Switch buton:", "Mudou para " + isChecked);
            }
        });

        //fonte de dados
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Opção 1");
        arrayList.add("Opção 2");
        arrayList.add("Opção 3");
        arrayList.add("Opção 4");

        //criar o adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                arrayList
        );

        //utilizar o arrayadapter criado
        spinner.setAdapter(arrayAdapter);

        //ouvinte spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selec = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity8.this, "Selecionado"+selec, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}