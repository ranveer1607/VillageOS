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

public class Education_schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_education_schemes);
        LinearLayout e1=findViewById(R.id.e1);
        LinearLayout e2=findViewById(R.id.e2);
        LinearLayout e3=findViewById(R.id.e3);
        LinearLayout e4=findViewById(R.id.e4);
        LinearLayout e5=findViewById(R.id.e5);
        LinearLayout e6=findViewById(R.id.e6);
        LinearLayout e7=findViewById(R.id.e7);
        LinearLayout e8=findViewById(R.id.e8);
        LinearLayout e9=findViewById(R.id.e9);
        LinearLayout e10=findViewById(R.id.e10);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Education_schemes.this, Education1.class);
                startActivity(i);
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Education_schemes.this, Education2.class);
                startActivity(i2);
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(Education_schemes.this, Education3.class);
                startActivity(i3);
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(Education_schemes.this, Education4.class);
                startActivity(i4);
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(Education_schemes.this, Education5.class);
                startActivity(i5);
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6= new Intent(Education_schemes.this, Education6.class);
                startActivity(i6);
            }
        });
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7= new Intent(Education_schemes.this, Education7.class);
                startActivity(i7);
            }
        });
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8= new Intent(Education_schemes.this, Education8.class);
                startActivity(i8);
            }
        });
        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9= new Intent(Education_schemes.this, Education9.class);
                startActivity(i9);
            }
        });
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10= new Intent(Education_schemes.this, Education10.class);
                startActivity(i10);
            }
        });

    }
}