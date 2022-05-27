package com.example.doodlz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item_borrar){
            Toast.makeText(this, "Botón de borrar", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item_salvar){
            Toast.makeText(this, "Botón Salvar", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item_imprimir){
            Toast.makeText(this, "Botón Imprimir", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item_tamaño){
            Toast.makeText(this, "Botóm seleccionar tamaño", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item_color){
            Toast.makeText(this, "Botóm color línea", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}