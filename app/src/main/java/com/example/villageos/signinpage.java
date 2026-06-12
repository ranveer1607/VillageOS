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
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        EditText e3=findViewById(R.id.e3);
        EditText e4=findViewById(R.id.e4);
        EditText e5=findViewById(R.id.e5);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=e1.getText().toString();
                String b=e2.getText().toString();
                String c=e3.getText().toString();
                String d=e4.getText().toString();
                String e=e5.getText().toString();
                String s="Name is:"+a+"\nMobile no is"+b+"\nEmail is:"+c;

                Toast.makeText(signinpage.this, s, Toast.LENGTH_LONG).show();

                Intent i=new Intent(signinpage.this, loginpage.class);
                startActivity(i);

            }
        });
    }
}