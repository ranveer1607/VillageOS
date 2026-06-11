package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        TextView no1=findViewById(R.id.no1);

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=e1.getText().toString();
                String b=e2.getText().toString();
                if(a.equals("ABC") && b.equals("ABC@123"))
                {
                    Toast.makeText(loginpage.this, "Login Successfully Completed!!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(loginpage.this, "Enter Correct Username and Password", Toast.LENGTH_LONG).show();

                }

                Intent i=new Intent(loginpage.this, signinpage.class);
                startActivity(i);
            }
        });

    }
}