package com.example.villageos;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class adhealthcamp extends AppCompatActivity {



    EditText campName,campDate,campLocation,campDescription;

    Button btnPublish;


    DatabaseReference db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_adhealthcamp);



        campName=findViewById(R.id.campName);
        campDate=findViewById(R.id.campDate);
        campLocation=findViewById(R.id.campLocation);
        campDescription=findViewById(R.id.campDescription);


        btnPublish=findViewById(R.id.btnPublish);



        db= FirebaseDatabase.getInstance()
                .getReference("HealthCamps");



        btnPublish.setOnClickListener(v -> {



            String name=campName.getText().toString();
            String date=campDate.getText().toString();
            String location=campLocation.getText().toString();
            String desc=campDescription.getText().toString();



            String id=db.push().getKey();



            healthmodel model =
                    new healthmodel(
                            name,
                            date,
                            location,
                            desc
                    );



            db.child(id)
                    .setValue(model)
                    .addOnSuccessListener(unused -> {


                        Toast.makeText(
                                adhealthcamp.this,
                                "Health Camp Published",
                                Toast.LENGTH_SHORT
                        ).show();



                        campName.setText("");
                        campDate.setText("");
                        campLocation.setText("");
                        campDescription.setText("");

                    });



        });


    }

}