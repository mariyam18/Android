package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    private Button btnSnacks;
    private Button btnBf;
    private Button btnLunch;
    private Button btnDinner;
    private Button btnDessert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnBf = (Button) findViewById(R.id.btnBf);

        btnBf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bf = new Intent(Category.this,Breakfast.class);
                startActivity(bf);
            }
        });

        btnLunch = (Button) findViewById(R.id.btnLunch);

        btnLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lunch = new Intent(Category.this,Lunch.class);
                startActivity(lunch);
            }
        });

        btnSnacks = (Button) findViewById(R.id.btnSnacks);

        btnSnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent snacks = new Intent(Category.this,Snacks.class);
                startActivity(snacks);
            }
        });



        btnDinner = (Button) findViewById(R.id.btnDinner);

        btnDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dinner = new Intent(Category.this,Dinner.class);
                startActivity(dinner);
            }
        });

        btnDessert = (Button) findViewById(R.id.btnDessert);

        btnDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessert = new Intent(Category.this,Dessert.class);
                startActivity(dessert);
            }
        });
    }
}
