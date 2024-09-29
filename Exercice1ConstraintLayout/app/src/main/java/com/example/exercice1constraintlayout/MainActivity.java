package com.example.exercice1constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button toast;
    private EditText increment;
    private Button count;
    private int compteur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast);
        increment = findViewById(R.id.increment);
        count = findViewById(R.id.count);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_LONG).show();
            }

        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur++;
                increment.setText(String.valueOf(compteur));
            }
        });

    }
}