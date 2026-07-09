package com.example.villageos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseError;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Editvillagerpage extends AppCompatActivity {
    DatabaseReference db;
    EditText etName, etEmail, etPhone, etVillage, etDistrict, etState;
    Button btnSave;

    DatabaseReference profileRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editvillagerpage);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etVillage = findViewById(R.id.etVillage);
        etDistrict = findViewById(R.id.etDistrict);
        etState = findViewById(R.id.etState);

        btnSave = findViewById(R.id.btnSave);


        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);

        db = FirebaseDatabase.getInstance().getReference("new user");

        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds : snapshot.getChildren()) {

                    String name = ds.child("a").getValue(String.class);
                    String mobile = ds.child("b").getValue(String.class);

                    etName.setText(name);
                    etPhone.setText(mobile);

                    break;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        etName.setEnabled(false);
        etPhone.setEnabled(false);

        profileRef = FirebaseDatabase.getInstance()
                .getReference("UserProfile");

        btnSave.setOnClickListener(v -> {

            HashMap<String,Object> map = new HashMap<>();

            map.put("email", etEmail.getText().toString().trim());
            map.put("village", etVillage.getText().toString().trim());
            map.put("district", etDistrict.getText().toString().trim());
            map.put("state", etState.getText().toString().trim());

            // Demo key
            profileRef.child("User1").setValue(map)
                    .addOnSuccessListener(unused ->
                            Toast.makeText(Editvillagerpage.this,
                                    "Profile Saved",
                                    Toast.LENGTH_SHORT).show())
                    .addOnFailureListener(e ->
                            Toast.makeText(Editvillagerpage.this,
                                    e.getMessage(),
                                    Toast.LENGTH_SHORT).show());

        });

    }
}