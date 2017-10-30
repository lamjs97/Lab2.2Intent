package com.example.taruc.lab22intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String MESSAGE = "Down Payment";
    public static final String MESSAGE2 = "Loan Period";
    public static final String MESSAGE3 = "Interest Rate";
    public static final String MESSAGE4 = "Monthly Repayment";
    private EditText editTextMessage;
    private EditText editTextMessage2;
    private EditText editTextMessage3;
    private EditText editTextMessage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMessage  = (EditText)findViewById(R.id.editText);
        editTextMessage2 = (EditText)findViewById(R.id.editText2);
        editTextMessage3 = (EditText)findViewById(R.id.editText3);
        editTextMessage4 = (EditText)findViewById(R.id.editText4);

    }

    public void calculate(View v){
        Intent intent = new Intent(this,ResultActivity.class);

        double carLoan,carPrice,downPayment,loanPeriod,interestRate,interest,monthlyRepayment;

        carPrice = Double.parseDouble(editTextMessage.getText().toString());
        downPayment = Double.parseDouble(editTextMessage2.getText().toString());
        loanPeriod = Double.parseDouble(editTextMessage3.getText().toString());
        interestRate = Double.parseDouble(editTextMessage4.getText().toString());
        interestRate/=100;


        carLoan = carPrice-downPayment;
        interest = carLoan * interestRate * loanPeriod;
        monthlyRepayment = (carLoan+interest)/loanPeriod/12;


        //passing value
        intent.putExtra(MESSAGE,downPayment);
        intent.putExtra(MESSAGE2,loanPeriod);
        intent.putExtra(MESSAGE3,interestRate);
        intent.putExtra(MESSAGE4,monthlyRepayment);
        startActivity(intent);
    }




}
