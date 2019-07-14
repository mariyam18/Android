package com.example.mariyam.pc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);


        Button btnRegparticipate;
        Button btnViewparticipate;



        btnRegparticipate = (Button) findViewById(R.id.btnRegParticipate);
        btnViewparticipate = (Button) findViewById(R.id.btnViewParticipate);


        btnViewparticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose.this,choose.class);
                startActivity(intent);
            }
        });


        btnRegparticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose.this,Register.class);
                startActivity(intent);
            }
        });

    }
}
