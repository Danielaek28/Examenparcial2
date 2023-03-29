package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pizza2 extends AppCompatActivity {
Button btns1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza2);
        btns1 = (Button) findViewById(R.id.btns1);

        btns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Regresaste a pizza", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), pizza.class);
                startActivity(i);
            }
        });

    }
}