package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class homepage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);

        ImageButton ib1=findViewById(R.id.ib1);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i11=new Intent(homepage1.this, schemes.class);
                startActivity(i11);

            }
        });

        ImageButton ib2=findViewById(R.id.ib2);

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i22=new Intent(homepage1.this, Eventpage.class);
                startActivity(i22);

            }
        });

        ImageButton ib3=findViewById(R.id.ib3);

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i33=new Intent(homepage1.this, Emergencyconpage.class);
                startActivity(i33);

            }
        });

        ImageButton ib4=findViewById(R.id.ib4);

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i44=new Intent(homepage1.this, healthcare.class);
                startActivity(i44);

            }
        });

        ImageButton ib5=findViewById(R.id.ib5);

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i55=new Intent(homepage1.this, noticeboard.class);
                startActivity(i55);

            }
        });

        ImageButton ib6=findViewById(R.id.ib6);

        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i66=new Intent(homepage1.this, jobemp.class);
                startActivity(i66);

            }
        });

        ImageButton btn12=findViewById(R.id.btn12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i77=new Intent(homepage1.this, profilepage.class);
                startActivity(i77);

            }
        });

    }
}