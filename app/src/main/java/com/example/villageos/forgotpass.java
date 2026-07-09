package com.example.villageos;

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
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class forgotpass extends AppCompatActivity {
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forgotpass);
        EditText Name=findViewById(R.id.Name);
        EditText Mobile=findViewById(R.id.Mobile);
        Button btn=findViewById(R.id.btn);
        db= FirebaseDatabase.getInstance().getReference("new user");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=Name.getText().toString();
                String m=Mobile.getText().toString();
                db.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot ds:snapshot.getChildren())
                        {
                            String datau=ds.child("a").getValue(String.class);
                            String datam=ds.child("b").getValue(String.class);
                            if(u.equals(datau)&&m.equals(datam))
                            {
                                String password=ds.child("d").getValue(String.class);
                                Intent i=new Intent();
                                PendingIntent pi=PendingIntent.getActivity(forgotpass.this, 0,i,PendingIntent.FLAG_IMMUTABLE);
                                SmsManager sms=SmsManager.getDefault();
                                sms.sendTextMessage(m, null, "Password=" +   password,pi, null);
                                Toast.makeText(forgotpass.this, "Password Sent successfully!", Toast.LENGTH_LONG).show();
                            }
                        }

                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


            }
        });

    }
    public boolean checkPermission(String permission) {
        int check = ContextCompat.checkSelfPermission
                (this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}