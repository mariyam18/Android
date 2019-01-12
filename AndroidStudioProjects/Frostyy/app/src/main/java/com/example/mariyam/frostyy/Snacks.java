package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Snacks extends AppCompatActivity {

    Button btnSamosa;
    Button btnChickenRoll;
    Button btnVadaPav;
    Button btnFrankie;
    Button btnSandwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);


        btnSamosa =(Button) findViewById(R.id.btnSamosa);
        btnVadaPav =(Button) findViewById(R.id.btnVadaPav);
        btnFrankie =(Button) findViewById(R.id.btnFrankie);
        btnChickenRoll =(Button) findViewById(R.id.btnChickenRoll);
        btnSandwitch =(Button) findViewById(R.id.btnSandwitch);

        btnSamosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snacks.this,Hotel.class);
                intent.putExtra("msg","Samosa");
                startActivity(intent);
            }
        });

        btnVadaPav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snacks.this,Hotel.class);
                intent.putExtra("msg","VadaPav");
                startActivity(intent);
            }
        });

        btnFrankie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snacks.this,Hotel.class);
                intent.putExtra("msg","Frankie");
                startActivity(intent);
            }
        });

        btnChickenRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snacks.this,Hotel.class);
                intent.putExtra("msg","ChickenRoll");
                startActivity(intent);
            }
        });

        btnSandwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snacks.this,Hotel.class);
                intent.putExtra("msg","Sandwitch");
                startActivity(intent);
            }
        });
    }
}
