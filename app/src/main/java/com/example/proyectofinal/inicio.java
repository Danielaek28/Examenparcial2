package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

Button btn4, btn5, btnsa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incio);
        btn4 = (Button) findViewById(R.id.pizza);
        btn5 = (Button) findViewById(R.id.bebida);
        btnsa = (Button) findViewById(R.id.salir);

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en pizzas", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),pizza.class);
                startActivity(i);
            }

        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en bebidas", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),bebida.class);
                startActivity(i);
            }

        });
        btnsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }

        });


    }
}