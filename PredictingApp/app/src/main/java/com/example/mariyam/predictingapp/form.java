package com.example.mariyam.predictingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class form extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText edtAppName  = (EditText) findViewById(R.id.edtAppName);
        EditText edtAndroidVer  = (EditText) findViewById(R.id.edtAndroidVer);
        EditText edtCurrentVer = (EditText) findViewById(R.id.edtCurrentVer);
        EditText edtType = (EditText) findViewById(R.id.edtType);
        EditText edtCategory = (EditText) findViewById(R.id.edtCategory);
        EditText edtInstals = (EditText) findViewById(R.id.edtInstals);
        EditText edtContentRating = (EditText) findViewById(R.id.edtContentrating);
        EditText edtGenres = (EditText) findViewById(R.id.edtGenres);
        EditText edtLastUpdate = (EditText) findViewById(R.id.edtLastUpdate);
        EditText edtPrice = (EditText) findViewById(R.id.edtPrice);
        EditText edtAppSize = (EditText) findViewById(R.id.edtAppSize);



    }
}
