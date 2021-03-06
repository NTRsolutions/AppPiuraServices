package com.piuraservices.piuraservices.views.activitiesepsgrau;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.piuraservices.piuraservices.R;
public class EPS_grauActivity extends AppCompatActivity {

    ImageView imgtramites;
    ImageView imgreclamos;
    ProgressDialog ringProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eps_grau);
        getSupportActionBar().setTitle("Entidad EPS Grau S.A");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgtramites = (ImageView) findViewById(R.id.img_tramiteseps);
        imgreclamos = (ImageView) findViewById(R.id.img_reclamoseps);

    }
    public void onClickedtramites(View v) {
        imgtramites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent("views.activitiesepsgrau.InfoTramitesEpsActivity");
                //Intent intent = new Intent(getApplicationContext(), com.piuraservices.piuraservices.views.activitiesepsgrau.InfoTramitesEpsActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClickedreclamos(View v) {
        imgreclamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("views.activitiesepsgrau.InfoReclamosEpsActivity");
                //Intent intent = new Intent(getApplicationContext(),InfoReclamosEpsActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onClickOpenGoogleMaps(View v) {

        Uri uri = Uri.parse("geo:41.3825581,2.1704375?z=16&q=-5.19449, -80.6328201(EPS Grau Piura)");
        //startActivity( new Intent(Intent.ACTION_VIEW, uri));
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        Intent chooser=Intent.createChooser(intent,"Abrir Google Maps");
        startActivity(chooser);
        //Uri uri = Uri.parse("geo:41.3825581,2.1704375?z=16&q=-5.19449, -80.6328201(EPS Grau Piura)");
        //startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    public void onClickOpenEmail(View v) {

        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("email"));
        String[]s={"epsgrau.com"};
        intent.putExtra(Intent.EXTRA_EMAIL,s);
        intent.putExtra(Intent.EXTRA_SUBJECT," ");
        intent.putExtra(Intent.EXTRA_TEXT," ");
        intent.setType("message/rfc822");
        Intent chooser=Intent.createChooser(intent,"Enviar Email");
        startActivity(chooser);

    }
    public void onClickOpenWeb(View v) {
        //Uri uri = Uri.parse("https://www.epsgrau.pe/webpage/desktop/views/");
        //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //startActivity(intent);
        //WebView webView=new WebView(this);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://www.epsgrau.pe/webpage/desktop/views/");
        //Intent intent = new Intent("views.activities.OpenWebActivity");
        loadingpage(v);
        Intent intent = new Intent(EPS_grauActivity.this,OpenWebEpsGrauActivity.class);
        startActivity(intent);


    }
    public void onClickOpenCall(View v) {
            Intent i = new Intent(Intent.ACTION_DIAL);
            String spsgrau= "073307741";
            if (spsgrau.trim().isEmpty()) {
                i.setData(Uri.parse("tel:073307741"));
            } else {
                i.setData(Uri.parse("tel:" + spsgrau));
            }
            if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getApplication(), "Please conceda permisos para llamar", Toast.LENGTH_LONG).show();
                requestPermission();
            } else {
                startActivity(i);
            }
    }
        //permisos para llamadas
        private void requestPermission() {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
    //new with timer
    public void loadingpage(View view) {
         ringProgressDialog = ProgressDialog.show(EPS_grauActivity.this, "Please wait ...", "Loading...", true);
        ringProgressDialog.setCancelable(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Here you should write your time consuming task...
                    // Let the progress ring for 10 seconds...
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ringProgressDialog.dismiss();
            }
        }).start();
    }
}
