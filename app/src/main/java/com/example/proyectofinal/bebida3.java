package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bebida3 extends AppCompatActivity {
Button btns9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida3);
        btns9 = (Button) findViewById(R.id.btns9);

        btns9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Regresaste a bebidas", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), bebida.class);
                startActivity(i);
            }
        });
    }
}