package com.example.mariyam.frostyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Order_page extends AppCompatActivity {

    private TextView txtHotel;
    private TextView txtDish;
    private TextView txtPerPrice;
    private TextView txtQuantity;
    private  TextView txtTotal;
    Button btnPlaceOrder;
    String Name;
    String Dish;
    String Hotel;
    String Price;
    int total;
    int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        txtDish = (TextView) findViewById(R.id.txtDish);
        txtHotel = (TextView) findViewById(R.id.txtHotel);
        txtPerPrice = (TextView) findViewById(R.id.txtPerPiece);
        txtQuantity = (TextView) findViewById(R.id.txtQuantity);
        txtTotal = (TextView) findViewById(R.id.txtTotal);

        Intent intent=this.getIntent();
        if(intent !=null) {
            Name = intent.getStringExtra("Name");
            Dish = intent.getStringExtra("dish");
            Hotel = intent.getStringExtra("hotel");
            Price = intent.getStringExtra("price");
        }


        txtHotel.setText(Hotel);
        txtDish.setText(Dish);
        txtPerPrice.setText(Price);


       txtQuantity.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


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
               quantity = Integer.parseInt(txtQuantity.getText().toString());
                 total = perPrice * quantity;
               Log.d("Total price is ",Integer.toString(total));
               txtTotal.setText(Integer.toString(total));

           }
       });

       btnPlaceOrder = (Button) findViewById(R.id.btnPlaceOrder);


        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(Order_page.this,Confirm_page.class);
               intent.putExtra("Total",Integer.toString(total));
               intent.putExtra("Name",Name);
               intent.putExtra("Hotel",Hotel);
               intent.putExtra("Dish",Dish);
               intent.putExtra("Quantity",Integer.toString(quantity));


               startActivity(intent);
           }
       });

    }
}
