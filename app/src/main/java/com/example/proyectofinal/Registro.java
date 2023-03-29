
package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Registro extends AppCompatActivity {
    EditText editn,editd;

    Button btn3,btn4;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        editn = (EditText) findViewById(R.id.editnombre);
        editd=  (EditText)  findViewById(R.id.editdirec);
        btn3 = (Button) findViewById(R.id.guardardatos);
        btn4 = (Button) findViewById(R.id.salir);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCampos();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "saliste de la aplicacion", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
    private void validarCampos() {
        String nombre="", direccion="";
        nombre=editn.getText().toString();
        direccion=editd.getText().toString();

        String error="";error+="";
        if (nombre.equals("") || direccion.equals("") )
            error="--No puedes dejar campos vacios";
        if(!error.equals(""))
            Toast.makeText(getApplicationContext(), "ERROR"+error, Toast.LENGTH_LONG).show();
        else {
            guardarDatos(nombre,direccion.toLowerCase(Locale.ROOT));
            Intent i= new Intent(getApplicationContext(),inicio.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(), "Se registro correctamente tus datos"+nombre, Toast.LENGTH_LONG).show();
        }

    }



    private void guardarDatos(String name, String dir){
        preferences=getSharedPreferences( "Registro", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putString("nombre",name);
        editor.putString("direccion",dir);
        editor.commit();
    }

}
