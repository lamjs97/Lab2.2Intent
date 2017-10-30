package com.example.taruc.lab22intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    TextView textViewMessage;
    TextView textViewMessage2;
    TextView textViewMessage3;
    TextView textViewMessage4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        textViewMessage  = (TextView)findViewById(R.id.textView);
        textViewMessage2 = (TextView)findViewById(R.id.textView2);
        textViewMessage3 = (TextView)findViewById(R.id.textView3);
        textViewMessage4 = (TextView)findViewById(R.id.textView4);


        Double downPayment = intent.getDoubleExtra(MainActivity.MESSAGE,0);
        Double loanPeriod = intent.getDoubleExtra(MainActivity.MESSAGE2,0);
        Double interestRate = intent.getDoubleExtra(MainActivity.MESSAGE3,0);
        Double monthlyRepayment = intent.getDoubleExtra(MainActivity.MESSAGE4,0);


        textViewMessage.setText(getResources().getString(R.string.payment)+" "+downPayment);
        textViewMessage2.setText(getResources().getString(R.string.period)+" "+loanPeriod);
        textViewMessage3.setText(getResources().getString(R.string.rate)+" "+interestRate);
        textViewMessage4.setText(getResources().getString(R.string.month)+" "+monthlyRepayment);




    }


    public void closeActivity(View v){
        finish();
    }


}
