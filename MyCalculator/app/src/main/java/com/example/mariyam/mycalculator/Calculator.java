package com.example.mariyam.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {


    private enum OPERATOR{
        PLUS,SUBTRACT,MULTIPLY,DIVIDE,EQUAL
    }
    TextView txtCalculation;
    TextView txtResults;


//Instance variable
    private String currentNumber;
    private String stringNumberAtleft;
    private String stringNumberAtRight;
    private OPERATOR currentOperator;
    private  int calculationsResult;
    private String calculationsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        currentNumber="";
        calculationsResult=0;

        calculationsString="";

        txtCalculation = (TextView) findViewById(R.id.txtCalculation);
        txtResults = (TextView) findViewById(R.id.txtResults);

        findViewById(R.id.btnEqual).setOnClickListener(Calculator.this);
        findViewById(R.id.btnSeven).setOnClickListener(Calculator.this);
        findViewById(R.id.btnEight).setOnClickListener(Calculator.this);
        findViewById(R.id.btnSix).setOnClickListener(Calculator.this);
        findViewById(R.id.btnFive).setOnClickListener(Calculator.this);
        findViewById(R.id.btnFour).setOnClickListener(Calculator.this);
        findViewById(R.id.btnThree).setOnClickListener(Calculator.this);
        findViewById(R.id.btnTwo).setOnClickListener(Calculator.this);
        findViewById(R.id.btnone).setOnClickListener(Calculator.this);
        findViewById(R.id.btnNine).setOnClickListener(Calculator.this);
        findViewById(R.id.btnZero).setOnClickListener(Calculator.this);

        findViewById(R.id.btnPlus).setOnClickListener(Calculator.this);
        findViewById(R.id.btnSubstract).setOnClickListener(Calculator.this);
        findViewById(R.id.btnMultiply).setOnClickListener(Calculator.this);
        findViewById(R.id.btnDivide).setOnClickListener(Calculator.this);
        findViewById(R.id.btnClear).setOnClickListener(Calculator.this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnEqual:

                operatorIsTapped(OPERATOR.EQUAL);
                break;
            case R.id.btnPlus:
                operatorIsTapped(OPERATOR.PLUS);
                calculationsString += " + ";
                break;
            case R.id.btnSubstract:
                operatorIsTapped(OPERATOR.SUBTRACT);
                calculationsString += " - ";

                break;
            case R.id.btnMultiply:
                operatorIsTapped(OPERATOR.MULTIPLY);
                calculationsString += " * ";

                break;
            case R.id.btnDivide:
                operatorIsTapped(OPERATOR.DIVIDE);
                calculationsString += " / ";

                break;
            case R.id.btnClear:
                cleartapped();
                break;
            case R.id.btnone:
                numberIsTapped(1);
                break;
            case R.id.btnTwo:
                numberIsTapped(2);
                break;
            case R.id.btnThree:
                numberIsTapped(3);
                break;
            case R.id.btnFour:
                numberIsTapped(4);
                break;
            case R.id.btnFive:
                numberIsTapped(5);
                break;
            case R.id.btnSix:
                numberIsTapped(6);
                break;
            case R.id.btnSeven:
                numberIsTapped(7);
                break;
            case R.id.btnEight:
                numberIsTapped(8);
                break;
            case R.id.btnNine:
                numberIsTapped(9);
                break;
                case R.id.btnZero:
                    numberIsTapped(0);
                break;


        }

        txtCalculation.setText(calculationsString);

    }

    private void numberIsTapped(int tappedNumber){

        currentNumber=currentNumber+String.valueOf(tappedNumber);
        txtResults.setText(currentNumber);
        calculationsString= currentNumber;
        txtCalculation.setText(calculationsString);
    }

    private  void operatorIsTapped(OPERATOR tappedOperator){
        if(currentOperator!=null ) {
            if (currentNumber != null) {

                stringNumberAtRight = currentNumber;
                currentNumber = "";

                switch (currentOperator) {

                    case PLUS:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) +
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case SUBTRACT:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) -
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case MULTIPLY:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) *
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case DIVIDE:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) /
                                Integer.parseInt(stringNumberAtRight);
                        break;
                }

                stringNumberAtleft = String.valueOf(calculationsResult);
                txtResults.setText(stringNumberAtleft);
                calculationsString = stringNumberAtleft;
            }
        }
        else{

            stringNumberAtleft=currentNumber;
            currentNumber="";

        }

        currentOperator=tappedOperator;
    }

    private  void cleartapped(){
        stringNumberAtleft="";
        stringNumberAtRight="";
        calculationsString="";
        calculationsResult=0;
        currentOperator=null;
        txtResults.setText("0");
        txtCalculation.setText("0");



    }
}
