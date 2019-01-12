package com.example.mariyam.easysolution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class compPage extends AppCompatActivity {

    private Button c_sem5;
    private Button c_sem4;
    private Button c_sem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_page);

        c_sem5= (Button) findViewById(R.id.c_sem5);
        c_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(compPage.this,Comp_sem5.class);
                startActivity(intent);
            }
        });

        c_sem4= (Button) findViewById(R.id.c_sem4);
        c_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(compPage.this,Comp_sem4.class);
                startActivity(intent);
            }
        });

        c_sem3= (Button) findViewById(R.id.c_sem3);
        c_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(compPage.this,comp_sem3.class);
                startActivity(intent);
            }
        });


    }
}




