package com.example.myapplication41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        number=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
    }
    public void go(View view){
        number += 1;

        if (number%7==0 && number!=0)
            btn.setText("BOOM!" );

        else
            btn.setText("THIS IS A CLICK NUMBER: " + number);

    }
}