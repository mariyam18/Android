package com.example.mariyam.pc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] paths = {"1", "2", "3","4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       final LinearLayout ll2 =  (LinearLayout) findViewById(R.id.ll2);

        final Spinner dropdown = findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"1", "2", "3" ,"4"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

        Button btnCreate =  (Button) findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = dropdown.getSelectedItem().toString();
                int num = Integer.parseInt(text);
                for(int i=0;i<num;i++){

                    TextView txtdis = new TextView(Register.this);
                    txtdis.setText("Participant "+(i+1));
                    ll2.addView(txtdis);

                    EditText edtName =new  EditText(Register.this);
                    // EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
                    edtName.setHint("Name of participate");
                    ll2.addView(edtName);

                    EditText edtEmail =new  EditText(Register.this);
                    // EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
                    edtEmail.setHint("Email of participate");
                    ll2.addView(edtEmail);

                    EditText edtNumber =new  EditText(Register.this);
                    // EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
                    edtNumber.setHint("Number of participate");
                    ll2.addView(edtNumber);
                    // ll2.addView(edtEmail);


                }

            }
        });


    }
}
