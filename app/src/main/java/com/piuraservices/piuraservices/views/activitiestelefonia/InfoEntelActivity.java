package com.piuraservices.piuraservices.views.activitiestelefonia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.piuraservices.piuraservices.R;

public class InfoEntelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_entel);
        getSupportActionBar().setTitle("Empresa Entel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}