package com.example.mariyam.easysolution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Comp_sem5 extends AppCompatActivity {

private  Button C_5_db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_sem5);

       //final PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        C_5_db = (Button) findViewById(R.id.c_5_db);
        C_5_db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Intent intent = new Intent(Comp_sem5.this,db_show.class);
                //startActivity(intent);

        }
    });

    }
}
