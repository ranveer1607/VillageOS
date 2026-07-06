package com.example.villageos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class watersuplynotice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watersuplynotice);
        TextView t1=findViewById(R.id.t1);
        String notice1="Date: 12 July 2026\n" +
                "Notice:\n" +
                "Water supply will be temporarily unavailable from 10:00 AM to 3:00 PM due to pipeline maintenance work." +
                " Residents are requested to store sufficient drinking water in advance. We regret the inconvenience.\n" +
                "– Gram Panchayat";
        t1.setText(notice1);
    }
}