package com.example.water;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Answeractivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answeractivity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("results");


        answer = (TextView) findViewById(R.id.answer);
        answer.setText(" You should drink " + String.valueOf(str) + " litres of water per day.");
    }
}
