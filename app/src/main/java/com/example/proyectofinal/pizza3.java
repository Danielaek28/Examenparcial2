package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pizza3 extends AppCompatActivity {
    Button btns8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza3);
        btns8 = (Button) findViewById(R.id.btns8);

        btns8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Regresaste a pizza", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), pizza.class);
                startActivity(i);
            }
        });
    }
}