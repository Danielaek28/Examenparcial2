package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pizza extends AppCompatActivity {
Button btn7, btn8,btn11,btns1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        btn7 = (Button) findViewById(R.id.FP);
        btn8 = (Button) findViewById(R.id.RN);
        btn11 = (Button) findViewById(R.id.P);
        btns1 = (Button) findViewById(R.id.regreso);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PIZZA DE PEPPERONI", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), pizza1.class);
                startActivity(i);
            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PIZZA SAUSAGE", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), pizza2.class);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PIZZA HAWAIANA", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), pizza3.class);
                startActivity(i);
            }

        });

        btns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Regresaste a inicio", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), inicio.class);
                startActivity(i);
            }
        });
    }}

