package com.piuraservices.piuraservices.views.activitiesadmin;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.piuraservices.piuraservices.R;
import com.piuraservices.piuraservices.views.activitiesadmin.adminclaro.AdminInfoClaroActivity;
import com.piuraservices.piuraservices.views.activitiesadmin.adminenosa.AdminInfoEnosaActivity;
import com.piuraservices.piuraservices.views.activitiesadmin.adminentel.AdminInfoEntelActivity;
import com.piuraservices.piuraservices.views.activitiesadmin.adminepsgrau.AdminInfoEpsgrauActivity;
import com.piuraservices.piuraservices.views.activitiesadmin.admintelefonia.AdminInfoTelefoniaActivity;

import java.util.zip.Inflater;

public class AdministrarInformacionActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaelementos;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_informacion);
        getSupportActionBar().setTitle("Administrar Información");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] informacion = {"Información de consulta EPS GRAU SA", "Información de consulta ENOSA", "Información de consulta Movistar", "Información de consulta Claro", "Información de consulta Entel"};
        Inflater inflater;
        listaelementos = (ListView) findViewById(R.id.list_admininformacion);
        adapter = new ArrayAdapter<String>(AdministrarInformacionActivity.this, android.R.layout.simple_list_item_1, informacion);
        listaelementos.setAdapter(adapter);
        listaelementos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        if (i == 0) {
            Intent epsgrau = new Intent(getApplicationContext(), AdminInfoEpsgrauActivity.class);
            startActivity(epsgrau);
            //Toast.makeText(this, "item" + i, Toast.LENGTH_SHORT).show();
            //Intent addAccountIntent = new Intent(Settings.ACTION_ADD_ACCOUNT);
            //addAccountIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
            //addAccountIntent.putExtra(Settings.EXTRA_AUTHORITIES, new String[]{"views.activitiesadmin.AdminInfoEpsgrauActivity"});
            //startActivity(addAccountIntent);
        }
        if (i == 1) {
            Intent enosa = new Intent(getApplicationContext(), AdminInfoEnosaActivity.class);
            startActivity(enosa);
        }
        if (i == 2) {
            Intent telefonia = new Intent(getApplicationContext(), AdminInfoTelefoniaActivity.class);
            startActivity(telefonia);
        }
        if (i == 3) {
            Intent telefonia = new Intent(getApplicationContext(), AdminInfoClaroActivity.class);
            startActivity(telefonia);
        }
        if (i == 4) {
            Intent telefonia = new Intent(getApplicationContext(), AdminInfoEntelActivity.class);
            startActivity(telefonia);
        }

    }
}
