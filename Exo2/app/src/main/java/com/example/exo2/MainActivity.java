package com.example.exo2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nom,adresse,surface,nbrpiece;
    private TextView result;
    private Button calcul;
    private CheckBox piscine;
    private double impotbase;
    private double imposupp;
    private double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom=findViewById(R.id.nom);
        result=findViewById(R.id.result);
        adresse=findViewById(R.id.adresse);
        surface=findViewById(R.id.surface);
        nbrpiece=findViewById(R.id.nbrpiece);
        calcul=findViewById(R.id.calcul);
        piscine=findViewById(R.id.piscine);
        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String surf=surface.getText().toString();
                String piece=nbrpiece.getText().toString();
                if(surf.isEmpty() || piece.isEmpty())
                    Toast.makeText(MainActivity.this, "vueillez remplir tous les champs", Toast.LENGTH_LONG).show();

                else if(Integer.parseInt(surf)<0 || Integer.parseInt(piece)<0)
                    Toast.makeText(MainActivity.this, "surface et nombre de piece negative", Toast.LENGTH_LONG).show();


                else {
                    impotbase = Integer.parseInt(surf) * 2;
                    if (piscine.isChecked())
                        imposupp = (Integer.parseInt(piece) * 50) + 100;
                    else {
                        imposupp = (Integer.parseInt(piece) * 50);
                    }
                    total = impotbase + imposupp;
                    result.setText("Impot de base: "+impotbase+"\n"+"impot supplémentaire: "+imposupp+"\n"+"Impot Total: "+total);
                    result.setVisibility(View.VISIBLE);
                }


            }

        });
    }
}