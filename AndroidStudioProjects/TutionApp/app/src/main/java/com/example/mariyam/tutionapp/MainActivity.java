package com.example.mariyam.tutionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtName = (EditText) findViewById(R.id.edtName);

        final EditText edtStd = (EditText) findViewById(R.id.edtStd);

        final EditText edtSchoolName = (EditText) findViewById(R.id.edtSchoolName);

        final EditText edtMedium = (EditText) findViewById(R.id.edtMedium);

        final EditText edtFees = (EditText) findViewById(R.id.edtFees);

        final EditText edtNumber = (EditText) findViewById(R.id.edtnumber);

        final EditText edtDate = (EditText) findViewById(R.id.edtDate);

        Button  btnSend = (Button) findViewById(R.id.btnSend);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

       final DatabaseReference myRef = database.getReferenceFromUrl("https://tutionapp-a1d68.firebaseio.com/");

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myRef.child(edtName.getText().toString()).child("School Name")
                        .setValue(edtSchoolName.getText().toString());
                myRef.child(edtName.getText().toString()).child("Medium")
                        .setValue(edtMedium.getText().toString());
                myRef.child(edtName.getText().toString()).child("Tution Fees")
                        .setValue(edtFees.getText().toString());
                myRef.child(edtName.getText().toString()).child("Phone Number")
                        .setValue(edtNumber.getText().toString());
                myRef.child(edtName.getText().toString()).child("Date")
                        .setValue(edtDate.getText().toString());
            }
        });
    }
}
