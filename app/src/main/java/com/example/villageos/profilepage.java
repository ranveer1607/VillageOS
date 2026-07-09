package com.example.villageos;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
import com.google.firebase.database.ValueEventListener; import java.lang.reflect.Method;
public class profilepage extends AppCompatActivity {

    DatabaseReference db;

    TextView e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);


        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);


        // Firebase Data
        db = FirebaseDatabase.getInstance().getReference("new user");

        db.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot ds : snapshot.getChildren()){

                    String name = ds.child("a").getValue(String.class);
                    String mobile = ds.child("b").getValue(String.class);

                    e3.setText(name);
                    e4.setText(mobile);

                    break;
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        // My Complaints
        TextView t10=findViewById(R.id.t10);

        t10.setOnClickListener(view -> {

            Intent i1 = new Intent(profilepage.this, complentpage.class);
            startActivity(i1);

        });



        // Feedback
        TextView t20=findViewById(R.id.t20);

        t20.setOnClickListener(view -> {

            Intent i2 = new Intent(profilepage.this, feedback.class);
            startActivity(i2);

        });



        TextView t40=findViewById(R.id.t40);

        t40.setOnClickListener(view -> {

            Intent i3 = new Intent(profilepage.this, Emergencyconpage.class);
            startActivity(i3);

        });

        TextView l1=findViewById(R.id.l1);

        l1.setOnClickListener(view -> {

            Intent i4= new Intent(profilepage.this, Mainpage.class);
            startActivity(i4);
            finish();

        });

        Button r1=findViewById(R.id.r1);

        r1.setOnClickListener(view -> {

            Intent i444= new Intent(profilepage.this, Editvillagerpage.class);
            startActivity(i444);
            finish();

        });

    }
}