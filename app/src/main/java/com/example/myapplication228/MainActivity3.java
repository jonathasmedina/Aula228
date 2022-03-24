package com.example.myapplication228;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends ListActivity {

    // fonte de dados
    String[] CORES = new String[]{"Tela 1", "Tela  2", "Tela 3", "Tela  Radio sem Listener", "Tela Radio com Listener", "Intent com conteúdo", "Tela CheckBox", "Tela Spinner"};

    Intent intent;

    //arrayAdapter;
    ArrayAdapter<String> meuArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setar/configurar/instanciar o arrayadapter
        meuArrayAdapter = new ArrayAdapter<>(this,
               R.layout.minhalista, CORES);

        setListAdapter(meuArrayAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                intent = new Intent(MainActivity3.this,
                        MainActivity.class);
                startActivity(intent);
            break;
            case 1:
                intent = new Intent(MainActivity3.this,
                        MainActivity2.class);
                startActivity(intent);
                break;
            case 2:
                AlertDialog.Builder janela = new AlertDialog.Builder(this);
                janela.setTitle("Título da Janela de Diálogo");
                janela.setMessage("Mudar de tela?");
                //janela.setNeutralButton("Ok", null);
                janela.setNegativeButton("Cancelar", null);
                janela.setPositiveButton("Ok", mOuvinte);
                janela.show();

                break;

            case 3:
                intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity3.this, MainActivity7.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity3.this, MainActivity8.class);
                startActivity(intent);
                break;
        }
    }

    DialogInterface.OnClickListener mOuvinte = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {

        }
    };

}

//Exemplo de toast
//Toast.makeText(this, "Clicou na primeira opção.",Toast.LENGTH_LONG).show();