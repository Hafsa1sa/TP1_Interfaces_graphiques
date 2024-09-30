package com.example.travailarendre;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private TextView nomprenom,email,phone,adresse,ville;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        nomprenom=findViewById(R.id.nomprenom);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        ville=findViewById(R.id.ville);
        nomprenom.setText("Nom : " +this.getIntent().getStringExtra("nomprenom"));
        email.setText("Email : " +this.getIntent().getStringExtra("email"));
        phone.setText("Phone : " +this.getIntent().getStringExtra("phone"));
        adresse.setText("Adresse : " +this.getIntent().getStringExtra("adresse"));
        ville.setText("Ville : " +this.getIntent().getStringExtra("ville"));
    }
}