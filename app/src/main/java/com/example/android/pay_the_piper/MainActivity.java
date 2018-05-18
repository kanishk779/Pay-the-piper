package com.example.android.pay_the_piper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int payment;
    int payment1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ASSIGNING THE NAME TO THE BUTTONS
        Button one =(Button)findViewById(R.id.one_$);
        Button two= (Button)findViewById(R.id.two_$);
        Button five =(Button)findViewById(R.id.five_$);
        Button ten=(Button)findViewById(R.id.ten_$);
        Button reset=(Button)findViewById(R.id.Reset_button);
        Button newPayment=(Button)findViewById(R.id.another_payment);

        //SETTING THE RANDOM INTEGER FOR PAYMENT
        TextView pay = (TextView)findViewById(R.id.randomInteger);
        payment=(int)getRandomIntegerBetweenRange(0,100);
        pay.setText(payment);

        //INITIALIZING THE PAYMENT BOX
        TextView f = (TextView)findViewById(R.id.payment);
        f.setText(payment1);


        //CODE FOR 1$ BUTTON
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(payment1+1>payment){
                    Context context = getApplicationContext();
                    CharSequence text = "OOPS!! , paying More than Required";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if((payment1+1)==payment){
                    TextView a = (TextView)findViewById(R.id.payment);
                    a.setText(payment1+1);
                    a.setBackgroundColor(getResources().getColor(R.color.golden));
                }
                else{
                TextView a = (TextView)findViewById(R.id.payment);
                a.setText(payment1+1);}
            }
        });


        //CODE FOR 2$ BUTTON
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(payment1+2>payment){
                    Context context = getApplicationContext();
                    CharSequence text = "OOPS!! , paying More than Required" ;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if((payment1+2)==payment) {
                    TextView b = (TextView)findViewById(R.id.payment);
                    b.setText(payment1+2);
                    b.setBackgroundColor(getResources().getColor(R.color.golden));
                }
                else{
                TextView b = (TextView)findViewById(R.id.payment);
                b.setText(payment1+2);}
            }
        });


        //CODE FOR 5$ BUTTON
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(payment1+5>payment){
                    Context context = getApplicationContext();
                    CharSequence text = "OOPS!! , paying More than Required";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if((payment1+5)==payment){
                    TextView c = (TextView)findViewById(R.id.payment);
                    c.setText(payment1+5);
                    c.setBackgroundColor(getResources().getColor(R.color.golden));
                }
                else{
                TextView c = (TextView)findViewById(R.id.payment);
                c.setText(payment1+5);}
            }
        });


        //CODE FOR 10$ BUTTON
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(payment1+10>payment){
                    Context context = getApplicationContext();
                    CharSequence text = "OOPS!! , paying More than Required";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if((payment1+10)==payment){
                    TextView d = (TextView)findViewById(R.id.payment);
                    d.setText(payment1+10);
                    d.setBackgroundColor(getResources().getColor(R.color.golden));
                }
                else{
                TextView d = (TextView)findViewById(R.id.payment);
                d.setText(payment1+10);}
            }
        });


        //CODE FOR RESETTING THE THE PAYMENT TO BE MADE TO SOME ANOTHER VALUE
        newPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView e = (TextView)findViewById(R.id.randomInteger);
                payment=(int)getRandomIntegerBetweenRange(0,100);
                e.setText(payment);
            }
        });


        //CODE FOR RESETTING THE VALUE OF PAYMENT TO BE ZERO
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView g = (TextView)findViewById(R.id.payment);
                //payment=(int)getRandomIntegerBetweenRange(0,100);
                g.setText(0);
            }
        });
    }
    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}

