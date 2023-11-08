package com.example.pruebacambiopestaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv2=findViewById(R.id.tv2);
    }

    public void presion(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}