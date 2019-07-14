package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Confirm_page extends AppCompatActivity {

    Button btnConfirm;
    EditText txtAdd1,txtAdd2,txtArea,txtLandmark,txtPincode;
       TextView txtTotal;
    String Name;
    String Dish;
    String Hotel;
    String Total;
    String Quantity;

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    final DatabaseReference myRef = database.getReferenceFromUrl("https://frostyy-1e92e.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);

        Intent intent=this.getIntent();
        if(intent !=null) {
            Name = intent.getStringExtra("Name");
            Dish = intent.getStringExtra("Dish");
            Hotel = intent.getStringExtra("Hotel");
            Total = intent.getStringExtra("Total");
            Quantity = intent.getStringExtra("Quantity");
        }


        txtTotal =(TextView) findViewById(R.id.txtTotal);
        txtTotal.setText(Total);

        btnConfirm = (Button) findViewById(R.id.btnConfirm);
        txtAdd1 = (EditText) findViewById(R.id.txtAdd1);
        txtAdd2 = (EditText) findViewById(R.id.txtAdd2);
        txtArea = (EditText) findViewById(R.id.txtArea);
        txtLandmark = (EditText) findViewById(R.id.txtLandmark);
        txtPincode = (EditText) findViewById(R.id.txtPincode);

        final String getAdd1 = txtAdd1.getText().toString();
        final String getAdd2 = txtAdd2.getText().toString();
        final String getArea = txtArea.getText().toString();
        final String getLandmark = txtLandmark.getText().toString();
        final String getpincode = txtPincode.getText().toString();



        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child(Name).child("Detail").child("Add1")
                        .setValue(txtAdd1.getText().toString());
                myRef.child(Name).child("Detail").child("Add2")
                        .setValue(txtAdd2.getText().toString());
                myRef.child(Name).child("Detail").child("Area")
                        .setValue(txtArea.getText().toString());
                myRef.child(Name).child("Detail").child("Landmark")
                        .setValue(txtLandmark.getText().toString());
                myRef.child(Name).child("Detail").child("Pincode")
                        .setValue(txtPincode.getText().toString());
                myRef.child(Name).child("Order").child("Dish")
                        .setValue(Dish);
                myRef.child(Name).child("Order").child("Hotel")
                        .setValue(Hotel);
                myRef.child(Name).child("Order").child("Price")
                        .setValue(Total);
                myRef.child(Name).child("Order").child("Quantity")
                        .setValue(Quantity);


                Toast.makeText(Confirm_page.this,"Order Successfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Confirm_page.this,Category.class);
                startActivity(intent);
            }
        });
    }
}
