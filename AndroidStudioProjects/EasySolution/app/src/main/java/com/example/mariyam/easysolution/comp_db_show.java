package com.example.mariyam.easysolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class comp_db_show extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_db_show);

        pdfView = (PDFView) findViewById(R.id.pdfView);

       // pdfView.fromAsset("B.pdf").load();
    }
}
