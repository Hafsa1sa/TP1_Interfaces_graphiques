package com.example.travailarendre;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button envoyer;
    private EditText nomprenom,email,phone,adresse,ville;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        envoyer=findViewById(R.id.envoyer);
        nomprenom=findViewById(R.id.nomprenom);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        ville=findViewById(R.id.ville);
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                intent.putExtra("nomprenom",nomprenom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                intent.putExtra("adresse",adresse.getText().toString());
                intent.putExtra("ville",ville.getText().toString());
                startActivity(intent);

            }
        });
    }
}