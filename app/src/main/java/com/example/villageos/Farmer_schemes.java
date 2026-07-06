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

public class Farmer_schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_farmer_schemes);
        LinearLayout f1=findViewById(R.id.f1);
        LinearLayout f2=findViewById(R.id.f2);
        LinearLayout f3=findViewById(R.id.f3);
        LinearLayout f4=findViewById(R.id.f4);
        LinearLayout f5=findViewById(R.id.f5);
        LinearLayout f6=findViewById(R.id.f6);
        LinearLayout f7=findViewById(R.id.f7);
        LinearLayout f8=findViewById(R.id.f8);
        LinearLayout f9=findViewById(R.id.f9);
        LinearLayout f10=findViewById(R.id.f10);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Farmer_schemes.this, Farmer1.class);
                startActivity(i);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Farmer_schemes.this, Farmer2.class);
                startActivity(i2);
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(Farmer_schemes.this, Farmer3.class);
                startActivity(i3);
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(Farmer_schemes.this, Farmer4.class);
                startActivity(i4);
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(Farmer_schemes.this, Farmer5.class);
                startActivity(i5);
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6= new Intent(Farmer_schemes.this, Farmer6.class);
                startActivity(i6);
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7= new Intent(Farmer_schemes.this, Farmer7.class);
                startActivity(i7);
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8= new Intent(Farmer_schemes.this, Farmer8.class);
                startActivity(i8);
            }
        });
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9= new Intent(Farmer_schemes.this, Farmer9.class);
                startActivity(i9);
            }
        });
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10= new Intent(Farmer_schemes.this, Farmer10.class);
                startActivity(i10);
            }
        });

    }
}