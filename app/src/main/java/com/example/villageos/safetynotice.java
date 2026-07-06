package com.example.villageos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class safetynotice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safetynotice);
        TextView t4=findViewById(R.id.t4);
        String notice=" Safety Notice\n" +
                "Date: 20 July 2026\n" +
                "Notice:\n" +
                "Residents are advised to follow all safety guidelines during the rainy season. Avoid damaged electric poles, report suspicious activities immediately, and keep children away from flooded areas. In case of any emergency, contact the Gram Panchayat office.\n" +
                "– Gram Panchayat";
        t4.setText(notice);
    }
}