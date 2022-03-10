package com.example.myapplication228;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
        implements View.OnClickListener{

    EditText edNum1;
    EditText edNum2;
    TextView tvResult;
    Button btSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edNum1 = findViewById(R.id.editTextNum1);
        edNum2 = findViewById(R.id.editTextNum2);
        tvResult = findViewById(R.id.textViewResult);
        btSomar = findViewById(R.id.buttonSum);

        //forma 2
        //btSomar.setOnClickListener(ouvinte);

        //forma 3
        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edNum1.getText().toString().trim().equals("")){
                    edNum1.setError("Preencha.");
                }
                else{
                    int num1 = Integer.parseInt(edNum1.getText().toString());
                    int num2 = Integer.parseInt(edNum2.getText().toString());

                    int result = num1+num2;

                    tvResult.setText(String.valueOf(result));
                }
            }
        });

        //forma 4
        btSomar.setOnClickListener(this);
        //btSubtrair.setOnClickListener(this);

        Toast.makeText(this, "Mensagem", Toast.LENGTH_LONG).show();

        Log.e("Tag1", "dentro da onCreate()");


    }

    //formatar para duas casas decimais
    //String.format("%.2f", resultado);

    //forma 2
    View.OnClickListener ouvinte = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(edNum1.getText().toString().trim().equals("")){
                edNum1.setError("Preencha.");
            }
            else{
                int num1 = Integer.parseInt(edNum1.getText().toString());
                int num2 = Integer.parseInt(edNum2.getText().toString());

                int result = num1+num2;

                tvResult.setText(String.valueOf(result));
            }
        }
    };





    //forma 1
    public void funcao(View v){
        if(edNum1.getText().toString().trim().equals("")){
            edNum1.setError("Preencha.");
        }
        else{
            int num1 = Integer.parseInt(edNum1.getText().toString());
            int num2 = Integer.parseInt(edNum2.getText().toString());

            int result = num1+num2;

            tvResult.setText(String.valueOf(result));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonSum:
                //
                break;
         //   case R.id.buttonSubtrair:
                //
            //    break;

        }
    }
}