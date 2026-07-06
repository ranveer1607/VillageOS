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
        EditText e1 = findViewById(R.id.e1);
        EditText e2 = findViewById(R.id.e2);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = e1.getText().toString().trim();
                String b = e2.getText().toString().trim();

                if (a.equals("ABC") && b.equals("ABC@123")) {

                    Toast.makeText(Adminlogin.this,
                            "Correct username and password",
                            Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(Adminlogin.this, admindb.class);
                    i.putExtra("NAME", a);
                    startActivity(i);
                    finish();

                } else {

                    Toast.makeText(Adminlogin.this,
                            "Incorrect username or password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

