package com.example.water;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Button submit;
    EditText weight , exercise ;
  //  TextView answer;
    float weightvalue , exercisevalue;
    float answerofweight , answerofexercise , finalanswer;
    String formatted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        weight = (EditText) findViewById(R.id.weight);
        exercise = (EditText) findViewById(R.id.exercise);
     //   answer = (TextView) findViewById(R.id.answer);
    }

    public void btn(View v) {

        if(TextUtils.isEmpty(weight.getText())) {
            Toast.makeText(this, "Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
                    weightvalue = Float.valueOf(weight.getText().toString());
                    exercisevalue = Float.valueOf(exercise.getText().toString()) / 30f;

                    answerofweight = weightvalue / 30f;
                    answerofexercise = exercisevalue * 0.35f;

                    finalanswer = answerofweight + answerofexercise;
                    DecimalFormat format = new DecimalFormat("##.##");
                    formatted = format.format(finalanswer);


                    Intent intent = new Intent(MainActivity.this , Answeractivity.class);
                    intent.putExtra("results" , formatted );
                    startActivity(intent);


                //    answer.setText(" You should drink " + String.valueOf(formatted) + " litres of water per day.");
             }


    }
}
