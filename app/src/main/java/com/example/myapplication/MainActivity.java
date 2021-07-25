package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
//hello world
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View Text
        textView = findViewById(R.id.name);

         Class a = new Class();
         //Class a1 = new Class();


        //Set Text
        textView.setText(""+a.x);



    }


}