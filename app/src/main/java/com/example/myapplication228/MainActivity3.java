package com.example.myapplication228;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends ListActivity {

    // fonte de dados
    String[] CORES = new String[]{"Tela 1", "Tela  2", "Tela 3", "Tela  4"};

    Intent intent;

    //arrayAdapter;
    ArrayAdapter<String> meuArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setar/configurar/instanciar o arrayadapter
        meuArrayAdapter = new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1, CORES);

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
                janela.setMessage("Mensagem da janela de Diálogo");
                janela.setNeutralButton("Ok", null);
                janela.show();

                intent = new Intent(MainActivity3.this, MainActivity4.class );
                startActivity(intent);
                break;

        }


    }
}

//Exemplo de toast
//Toast.makeText(this, "Clicou na primeira opção.",Toast.LENGTH_LONG).show();