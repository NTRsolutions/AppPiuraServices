package com.piuraservices.piuraservices.views.activitiesadmin.admintelefonia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.piuraservices.piuraservices.R;

public class TelefoniaInfoReclamosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefonia_info_reclamos);
        getSupportActionBar().setTitle("Información de reclamos");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
