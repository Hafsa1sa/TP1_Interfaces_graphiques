package com.example.exo3;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        result=findViewById(R.id.result);
        result.setText(this.getIntent().getStringExtra("boxselected"));

    }
}