package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signinpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinpage);
        EditText n1=findViewById(R.id.n1);
        EditText m1=findViewById(R.id.m1);
        EditText e1=findViewById(R.id.e1);
        EditText p1=findViewById(R.id.p1);
        EditText c1=findViewById(R.id.c1);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=n1.getText().toString();
                String b=m1.getText().toString();
                String c=e1.getText().toString();
                String d=p1.getText().toString();
                String e=c1.getText().toString();
                String s="Name is:"+a+"\nMobile no is"+b+"\nEmail is:"+c;
                Toast.makeText(signinpage.this, s, Toast.LENGTH_LONG).show();
                Intent i=new Intent(signinpage.this, loginpage.class);
                startActivity(i);
            }
        });
    }
}