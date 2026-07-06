package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class complaintmanagementpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintmanagementpage);

        TextView t1=findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(complaintmanagementpage.this,complaintdetailspage.class);
                startActivity(i3);
            }
        });

        TextView t2=findViewById(R.id.t2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(complaintmanagementpage.this,complaintdetailspage2.class);
                startActivity(i4);
            }
        });

        TextView t3=findViewById(R.id.t3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(complaintmanagementpage.this,complaintmanagementpage3.class);
                startActivity(i5);
            }
        });
    }
    }
