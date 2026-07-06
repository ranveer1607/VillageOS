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

public class scholarship_schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scholarship_schemes);
        LinearLayout s1=findViewById(R.id.s1);
        LinearLayout s2=findViewById(R.id.s2);
        LinearLayout s3=findViewById(R.id.s3);
        LinearLayout s4=findViewById(R.id.s4);
        LinearLayout s5=findViewById(R.id.s5);
        LinearLayout s6=findViewById(R.id.s6);
        LinearLayout s7=findViewById(R.id.s7);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(scholarship_schemes.this, G_Scheme1.class);
                startActivity(i);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(scholarship_schemes.this, gscheme1_2.class);
                startActivity(i2);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(scholarship_schemes.this, gscheme13.class);
                startActivity(i3);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(scholarship_schemes.this, gscheme14.class);
                startActivity(i4);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(scholarship_schemes.this, gscheme15.class);
                startActivity(i5);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(scholarship_schemes.this, gscheme16.class);
                startActivity(i6);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(scholarship_schemes.this, gscheme17.class);
                startActivity(i7);
            }
        });
    }
}