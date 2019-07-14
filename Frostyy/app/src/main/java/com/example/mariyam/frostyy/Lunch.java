package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lunch extends AppCompatActivity {

    Button btnDalChawal;
    Button btnDalFry;
    Button btnChikenSalan;
    Button btnKeemaGhotala;
    Button btnMalaiKhofta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        btnChikenSalan =(Button) findViewById(R.id.btnChickenSalan);
        btnDalChawal =(Button) findViewById(R.id.btnDalChawal);
        btnDalFry =(Button) findViewById(R.id.btnDalFry);
        btnKeemaGhotala =(Button) findViewById(R.id.btnKeemaGhotala);
        btnMalaiKhofta =(Button) findViewById(R.id.btnMalaiKhofta);

        btnChikenSalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,Hotel.class);
                intent.putExtra("msg","ChikenSalan");
                startActivity(intent);
            }
        });

        btnDalChawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,Hotel.class);
                intent.putExtra("msg","DalChawal");
                startActivity(intent);
            }
        });

        btnDalFry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,Hotel.class);
                intent.putExtra("msg","DalFry");
                startActivity(intent);
            }
        });

        btnKeemaGhotala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,Hotel.class);
                intent.putExtra("msg","KeemaGhotala");
                startActivity(intent);
            }
        });

        btnMalaiKhofta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,Hotel.class);
                intent.putExtra("msg","MalaiKhofta");
                startActivity(intent);
            }
        });
    }
}
