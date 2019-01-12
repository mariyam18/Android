package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Order_page extends AppCompatActivity {

    private TextView txtHotel;
    private TextView txtDish;
    private TextView txtPerPrice;
    private TextView txtQuantity;
    private  TextView txtTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        txtDish = (TextView) findViewById(R.id.txtDish);
        txtHotel = (TextView) findViewById(R.id.txtHotel);
        txtPerPrice = (TextView) findViewById(R.id.txtPerPiece);
        txtQuantity = (TextView) findViewById(R.id.txtQuantity);
        txtTotal = (TextView) findViewById(R.id.txtTotal);

        Intent intent = getIntent();
        Bundle ord = getIntent().getExtras();
        final String Hotel = ord.getString("hotel");
        final String Dish = ord.getString("dish");
        final String Price = ord.getString("price");

        txtHotel.setText(Hotel);
        txtDish.setText(Dish);
        txtPerPrice.setText(Price);

       final String Quan = txtQuantity.getText().toString();



       txtQuantity.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//               Integer Total=0;
//               try {
//                   Total = parseInt(Price) * parseInt(Quan);
//               } catch (NumberFormatException nfe) {
//                   System.out.println("Could not parse " + nfe);
//               }
//               final   String str =  Integer.toString(Total);
//               txtTotal.setText(str);
               ;

           }

           @Override
           public void afterTextChanged(Editable editable) {
               if(txtQuantity.getText().toString().isEmpty()
                       || txtQuantity.getText().toString().equals("")
                       ){
                   Toast.makeText(Order_page.this,"Null not allowed",Toast.LENGTH_SHORT).show();
                return;
               }
                int perPrice = Integer.parseInt(txtPerPrice.getText().toString());
               int quantity = Integer.parseInt(txtQuantity.getText().toString());
               int total = perPrice * quantity;
               Log.d("Total price is ",Integer.toString(total));
               txtTotal.setText(Integer.toString(total));
           }
       });


    }
}
