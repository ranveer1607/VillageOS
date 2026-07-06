package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginpage extends AppCompatActivity {
DatabaseReference db;
int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        TextView no1=findViewById(R.id.no1);
        Button b1=findViewById(R.id.b1);

        db= FirebaseDatabase.getInstance().getReference("new user");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String USERNAME=e1.getText().toString().trim();
                String PASSWORD=e2.getText().toString().trim();
                Intent i=new Intent(loginpage.this,homepage1.class);
                i.putExtra("NAME",USERNAME);
                startActivity(i);

                db.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        for (DataSnapshot ds : snapshot.getChildren()) {
                            String uname = ds.child("a").getValue(String.class);
                            String pass = ds.child("d").getValue(String.class);

                            if ((uname.equals(USERNAME)) && (pass.equals(PASSWORD))) {
                                temp = 1;
                                break;
                            }

                        }
                        if (temp == 1) {
                            Toast.makeText(loginpage.this, "login successfull", Toast.LENGTH_LONG).show();

                            temp = 0;
                        } else {
                            Toast.makeText(loginpage.this, "incorrect pass ", Toast.LENGTH_LONG).show();

                        }
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });


        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1=new Intent(loginpage.this, signinpage.class);
                startActivity(i1);
            }
        });





    }
}