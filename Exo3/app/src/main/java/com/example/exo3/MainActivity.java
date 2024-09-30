package com.example.exo3;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox, checkBox2, checkBox3, checkBox4;
    private RadioButton o, n;
    private Button suivant, quitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        o = findViewById(R.id.o);
        n = findViewById(R.id.n);
        suivant = findViewById(R.id.suivant);
        quitter = findViewById(R.id.quitter);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder boxselected = new StringBuilder();
                if (checkBox.isChecked()) {
                    boxselected.append(checkBox.getText().toString()).append("\n");
                }
                if (checkBox2.isChecked()) {
                    boxselected.append(checkBox2.getText().toString()).append("\n");
                }
                if (checkBox3.isChecked()) {
                    boxselected.append(checkBox3.getText().toString()).append("\n");
                }
                if (checkBox4.isChecked()) {
                    boxselected.append(checkBox4.getText().toString()).append("\n");
                }
                if (o.isChecked()) {
                    boxselected.append(o.getText().toString());
                } else if (n.isChecked()) {
                    boxselected.append(n.getText().toString());
                }
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("boxselected", boxselected.toString());
                startActivity(intent);

            }
        });
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}