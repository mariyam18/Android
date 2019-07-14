package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Breakfast extends AppCompatActivity {


    Button btnPavBhaji;
    Button btnMasalaDosa;
    Button btnDhokla;
    Button btnKeemaPav;
    Button btnCholeBature;
    String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        btnDhokla =(Button) findViewById(R.id.btnDhokla);
        btnPavBhaji =(Button) findViewById(R.id.btnPavBhaji);
        btnMasalaDosa =(Button) findViewById(R.id.btnMasalaDosa);
        btnKeemaPav =(Button) findViewById(R.id.btnKeemaPav);
        btnCholeBature =(Button) findViewById(R.id.btnCholeBature);

        Intent intent=this.getIntent();
        if(intent !=null)
            Name= intent.getStringExtra("Name");


        btnDhokla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Breakfast.this,Hotel.class);
                intent.putExtra("msg","Dhokla");
                intent.putExtra("Name",Name);

                startActivity(intent);
            }
        });

        btnPavBhaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Breakfast.this,Hotel.class);
                intent.putExtra("msg","PavBhaji");
                startActivity(intent);
            }
        });

        btnMasalaDosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Breakfast.this,Hotel.class);
                intent.putExtra("msg","MasalaDosa");
                startActivity(intent);
            }
        });

        btnKeemaPav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Breakfast.this,Hotel.class);
                intent.putExtra("msg","KeemaPav");
                startActivity(intent);
            }
        });

        btnCholeBature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Breakfast.this,Hotel.class);
                intent.putExtra("msg","CholeBature");
                startActivity(intent);
            }
        });
    }

}
