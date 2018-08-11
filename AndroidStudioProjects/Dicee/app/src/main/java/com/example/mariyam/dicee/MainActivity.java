package com.example.mariyam.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton= (Button)findViewById(R.id.RollButton);

        final ImageView leftdice = (ImageView) findViewById(R.id.leftDice);
        final ImageView rightdice =(ImageView) findViewById(R.id.rightDice);

        final  int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random numbergenerator = new Random();
                int number = numbergenerator.nextInt(6);

             leftdice.setImageResource(diceArray[number]);

             number = numbergenerator.nextInt(6);

             rightdice.setImageResource(diceArray[number]);

            }
        });
    }
}
