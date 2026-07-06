package com.example.villageos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class electricitysupply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricitysupply);
        TextView t2=findViewById(R.id.t2);
        String notice="Electricity Notice\n" +
                "Date: 15 July 2026\n" +
                "Notice:\n" +
                "Electricity supply will remain interrupted from 9:00 AM to 1:00 PM due to scheduled maintenance by the electricity department. Please plan your activities accordingly.\n" +
                "– Electricity Department";
        t2.setText(notice);
    }
}