package com.example.villageos;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class villagemap extends AppCompatActivity {

    private MapView map;
    private MyLocationNewOverlay myLocationOverlay;
    private static final int REQUEST_LOCATION = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration.getInstance().setUserAgentValue(getPackageName());

        setContentView(R.layout.activity_villagemap);

        map = findViewById(R.id.map);
        FloatingActionButton btn = findViewById(R.id.btn);

        map.setMultiTouchControls(true);

        // Udatare Village
        GeoPoint village = new GeoPoint(17.832574, 73.955767);

        map.getController().setZoom(16.0);
        map.getController().setCenter(village);

        // Marker
        Marker marker = new Marker(map);
        marker.setPosition(village);
        marker.setTitle("Udatare Village");
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(marker);

        // Permission Check
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {

            showMyLocation();

        } else {

            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION);
        }

        // Floating Button
        btn.setOnClickListener(v -> {

            if (myLocationOverlay != null &&
                    myLocationOverlay.getMyLocation() != null) {

                map.getController().animateTo(myLocationOverlay.getMyLocation());
                map.getController().setZoom(18.0);
            }
        });
    }

    private void showMyLocation() {

        myLocationOverlay =
                new MyLocationNewOverlay(
                        new GpsMyLocationProvider(this),
                        map);

        myLocationOverlay.enableMyLocation();
        myLocationOverlay.enableFollowLocation();

        map.getOverlays().add(myLocationOverlay);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode,
                permissions,
                grantResults);

        if (requestCode == REQUEST_LOCATION) {

            if (grantResults.length > 0 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                showMyLocation();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        map.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        map.onPause();
    }
}