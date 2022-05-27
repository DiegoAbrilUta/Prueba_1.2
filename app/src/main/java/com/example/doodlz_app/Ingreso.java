package com.example.doodlz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ingreso extends AppCompatActivity {
    //
    private EditText editTextUsuario;
    private EditText editTextClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        editTextUsuario = findViewById(R.id.editTextTextPersonName);
        editTextClave = findViewById(R.id.editTextTextPersonName3);
    }

    //METODO ONCLICK
    public void onClickIngresar(View view) {
        String usuario = editTextUsuario.getText().toString();
        String clave = editTextClave.getText().toString();


        if (usuario.equals("DIEGO") && clave.equals("DIEGO")) {
            // mostrar un activity
            Intent intent = new Intent(Ingreso.this, MainActivity.class);
            //Intent intent = new Intent(this, MainActivity.class);
            // mostrar el activity
            //this.startActivity();

            // pasar parametros
            intent.putExtra("variable_usuario", usuario);
            intent.putExtra("variable_clave", clave);

            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuario/Clave incorrectos", Toast.LENGTH_SHORT).show();

        }
        //
        if (usuario.equals("ABRIL") && clave.equals("ABRIL")) {
            // mostrar un activity
            Intent intent = new Intent(Ingreso.this, MainActivity.class);
            //Intent intent = new Intent(this, MainActivity.class);
            // mostrar el activity
            //this.startActivity();

            // pasar parametros
            intent.putExtra("variable_usuario", usuario);
            intent.putExtra("variable_clave", clave);

            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuario/Clave incorrectos", Toast.LENGTH_SHORT).show();

        }

    }
}