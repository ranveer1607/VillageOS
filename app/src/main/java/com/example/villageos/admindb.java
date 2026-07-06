package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class admindb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindb);
        ImageView t1=findViewById(R.id.t1);

        TextView w1=findViewById(R.id.w1);
        Intent i=getIntent();
        String b=i.getStringExtra("NAME");
        w1.setText("Welcome \n"+b);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(admindb.this, userspage.class);
                startActivity(i1);
            }
        });

        ImageView t2=findViewById(R.id.t2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(admindb.this, adcomplaintmanage.class);
                startActivity(i2);
            }
        });

        ImageView t3=findViewById(R.id.t3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(admindb.this, adnotice.class);
                startActivity(i3);
            }
        });

        ImageView t4=findViewById(R.id.t4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(admindb.this, complaintmanagementpage.class);
                startActivity(i4);
            }
        });

        ImageView t6=findViewById(R.id.t6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(admindb.this, adfeedback.class);
                startActivity(i6);
            }
        });

        ImageView t5=findViewById(R.id.t5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(admindb.this, Adscheme.class);
                startActivity(i7);
            }
        });



    }
}