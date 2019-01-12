package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dinner extends AppCompatActivity {

    Button btnBiryani;
    Button btnMatarPaneer;
    Button btnSchewanFried;
    Button btnChickenTandoori;
    Button btnButterChicken;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        btnSchewanFried =(Button) findViewById(R.id.btnSchewanFried);
        btnBiryani =(Button) findViewById(R.id.btnBiryani);
        btnMatarPaneer =(Button) findViewById(R.id.btnMatarPaneer);
        btnChickenTandoori =(Button) findViewById(R.id.btnChickenTandoori);
        btnButterChicken =(Button) findViewById(R.id.btnButterChicken);

        btnSchewanFried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this,Hotel.class);
                intent.putExtra("msg","SchewanFriedRice");
                startActivity(intent);
            }
        });

        btnBiryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this,Hotel.class);
                intent.putExtra("msg","Biryani");
                startActivity(intent);
            }
        });

        btnMatarPaneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this,Hotel.class);
                intent.putExtra("msg","MatarPaneer");
                startActivity(intent);
            }
        });

        btnChickenTandoori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this,Hotel.class);
                intent.putExtra("msg","ChickenTandoori");
                startActivity(intent);
            }
        });

        btnButterChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinner.this,Hotel.class);
                intent.putExtra("msg","ButterChicken");
                startActivity(intent);
            }
        });

    }
}
