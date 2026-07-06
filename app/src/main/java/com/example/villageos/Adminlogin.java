package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Adminlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           String a=e1.getText().toString();
           String b=e2.getText().toString();
                if(a.equals("ABC") && b.equals("ABC@123"))
                {
                    Toast.makeText(Adminlogin.this, "correct username and password", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Adminlogin.this, "incorrect username and password", Toast.LENGTH_LONG).show();

                }
                Intent i = new Intent(Adminlogin.this, admindb.class);
                startActivity(i);

            }
        });
    }
}



