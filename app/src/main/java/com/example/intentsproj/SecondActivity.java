package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String num1, num2, Result;
    Button add, sub, mul, div;
    TextView no1, no2, result;
    Integer res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
        result = findViewById(R.id.rslt);
        add = findViewById(R.id.a);
        sub = findViewById(R.id.s);
        mul = findViewById(R.id.m);
        div = findViewById(R.id.d);
        Intent intent = getIntent();
        num1 = intent.getStringExtra("x");
        num2 = intent.getStringExtra("y");
        no1.setText(num1);
        no2.setText(num2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = Integer.valueOf(num1) + Integer.valueOf(num2);
                Result = res.toString();
                result.setText(Result);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = Integer.valueOf(num1) - Integer.valueOf(num2);
                Result = res.toString();
                result.setText(Result);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = Integer.valueOf(num1) * Integer.valueOf(num2);
                Result = res.toString();
                result.setText(Result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = Integer.valueOf(num1) / Integer.valueOf(num2);
                Result = res.toString();
                result.setText(Result);
            }
        });

    }
}