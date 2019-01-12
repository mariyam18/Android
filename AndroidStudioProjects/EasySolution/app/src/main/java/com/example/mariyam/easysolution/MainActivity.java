package com.example.mariyam.easysolution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    private Button btnCOmp;
    private Button btnExtc;
    private Button btnIt;
    ConnectionDetector cd;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-9689904728447304~2970023949");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        cd =new ConnectionDetector(this);

        btnCOmp = (Button) findViewById(R.id.btnComp);
        btnCOmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cd.isConnected()){
                    Toast.makeText(MainActivity.this,"Connected",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,compPage.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please check your Net Connection",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnExtc = (Button) findViewById(R.id.btnExtc);
        btnExtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cd.isConnected()){
                    Toast.makeText(MainActivity.this,"Connected",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,extc_Page.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please check your Net Connection",Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnIt = (Button) findViewById(R.id.btnIt);
        btnIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cd.isConnected()) {
                    Toast.makeText(MainActivity.this, "Connected", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, it_page.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Please check your Net Connection", Toast.LENGTH_SHORT).show();
                }

            }});
    }





}
