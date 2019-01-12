package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dessert extends AppCompatActivity {

    Button btnBreadPudding;
    Button btnLemonTart;
    Button btnCremeBrulee;
    Button btnFrangipane;
    Button btnPanama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        btnCremeBrulee =(Button) findViewById(R.id.btnCremeBrulee);
        btnBreadPudding =(Button) findViewById(R.id.btnBreadPudding);
        btnLemonTart =(Button) findViewById(R.id.btnLemonTart);
        btnFrangipane =(Button) findViewById(R.id.btnFrangipane);
        btnPanama =(Button) findViewById(R.id.btnPanama);

        btnCremeBrulee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dessert.this,Hotel.class);
                intent.putExtra("msg","CremeBrulee");
                startActivity(intent);
            }
        });

        btnBreadPudding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dessert.this,Hotel.class);
                intent.putExtra("msg","BreadPudding");
                startActivity(intent);
            }
        });

        btnLemonTart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dessert.this,Hotel.class);
                intent.putExtra("msg","MasalaDosa");
                startActivity(intent);
            }
        });

        btnFrangipane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dessert.this,Hotel.class);
                intent.putExtra("msg","Frangipane");
                startActivity(intent);
            }
        });

        btnPanama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dessert.this,Hotel.class);
                intent.putExtra("msg","Panama");
                startActivity(intent);
            }
        });


    }
}
