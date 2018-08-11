package com.example.codept.example;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1add = (Button) findViewById(R.id.add);
        Button b2sub = (Button) findViewById(R.id.subtract);
        Button b3mul = (Button) findViewById(R.id.multiply);
        Button b4div = (Button) findViewById(R.id.divide);


    }

    public void add(View V)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c + d;
        Toast.makeText(getApplicationContext(), "The result is: " + res, Toast.LENGTH_SHORT).
                show();

    }


    public void subtract(View V)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c-d;
        Toast.makeText(getApplicationContext(), "The result is: " + res, Toast.LENGTH_SHORT).
                show();
    }



    public void multiply(View V) {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c * d;
        Toast.makeText(getApplicationContext(), "The result is: " + res, Toast.LENGTH_SHORT).
                show();
    }


    public void divide(View V) {
        double res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c / d;
        Toast.makeText(getApplicationContext(), "The result is: " + res, Toast.LENGTH_SHORT).
                show();
    }
}

