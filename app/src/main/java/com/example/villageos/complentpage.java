package com.example.villageos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class complentpage extends AppCompatActivity {
DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_complentpage);
        Spinner s1=findViewById(R.id.s1);
        EditText d1=findViewById(R.id.d1);
        Button btn=findViewById(R.id.btn);
        String[] color={"complaints","Water Supply Issue","Electicity Issue","Road Damage","Cleanliness Issue","Street Light Not Working","Sewage Problem","Health Care Issue","Education Issue","Other"};
        ArrayAdapter ar=new ArrayAdapter(complentpage.this, android.R.layout.simple_spinner_dropdown_item,color);
        s1.setAdapter(ar);
        db = FirebaseDatabase.getInstance().getReference("Complaints");

 btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String type = s1.getSelectedItem().toString();
            String desc = d1.getText().toString().trim();

            if (desc.isEmpty()) {
                Toast.makeText(complentpage.this,
                        "Enter description",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            String id = db.push().getKey();

            ComplaintModel cm = new ComplaintModel(type, desc);

            db.child(id).setValue(cm);

            Toast.makeText(complentpage.this,
                    "Complaint Submitted",
                    Toast.LENGTH_SHORT).show();

            d1.setText("");
        }
    });
}
}

