package com.example.villageos;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class signinpage extends AppCompatActivity {
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinpage);
        EditText e10 = findViewById(R.id.e10);
        EditText e2 = findViewById(R.id.e2);
        EditText e4 = findViewById(R.id.e4);
        EditText e5 = findViewById(R.id.e5);
        Button btn = findViewById(R.id.btn);
        db = FirebaseDatabase.getInstance().getReference("new user");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = e10.getText().toString().trim();
                String b = e2.getText().toString().trim();
                String d = e4.getText().toString().trim();
                String e = e5.getText().toString().trim();
                sign cg = new sign(a, b, d, e);
                String uid = db.push().getKey();

                db.child(uid).setValue(cg).addOnSuccessListener(unused -> {
                            Toast.makeText(signinpage.this, "Store", Toast.LENGTH_LONG).show();

                            // SMS pathav
                            if (ContextCompat.checkSelfPermission(signinpage.this,
                                    Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                                Intent smsIntent = new Intent(signinpage.this, loginpage.class);
                                PendingIntent pi = PendingIntent.getActivity(signinpage.this,
                                        0, smsIntent, PendingIntent.FLAG_IMMUTABLE);
                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(b, null, "Thank you for your valuable responce", pi, null);
                                Toast.makeText(signinpage.this, "Message Sent successfully!", Toast.LENGTH_LONG).show();
                            }

                            Intent i = new Intent(signinpage.this, loginpage.class);
                            startActivity(i);
                            finish();
                        })
                        .addOnFailureListener(err ->
                                Toast.makeText(signinpage.this, "Fail", Toast.LENGTH_LONG).show()
                        );
            }
        });
    }
}