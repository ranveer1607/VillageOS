package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        LinearLayout schemep1=findViewById(R.id.schemep1);
        LinearLayout g2=findViewById(R.id.g2);
        LinearLayout g3=findViewById(R.id.g3);
        LinearLayout g4=findViewById(R.id.g4);

        schemep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(schemes.this, scholarship_schemes.class);
                startActivity(i);
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(schemes.this, Farmer_schemes.class);
                startActivity(i2);
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(schemes.this, Penssion_Schemes.class);
                startActivity(i3);
            }
        });

        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(schemes.this, Education_schemes.class);
                startActivity(i4);
            }
        });

    }
}