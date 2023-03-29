package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bebida extends AppCompatActivity {
    Button btn9, btn10, btns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida);
        btn9 = (Button) findViewById(R.id.CP);
        btn10 = (Button) findViewById(R.id.MaB);
        btns2 = (Button) findViewById(R.id.regreso2);

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Jugo de limon", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(), bebida1.class);
                startActivity(i);
            }

        });
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Jugo de naranja", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(), bebida2.class);
                startActivity(i);
            }

        });


        btns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "regresaste a menu", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),inicio.class);
                startActivity(i);
            }
        });

    }

}
