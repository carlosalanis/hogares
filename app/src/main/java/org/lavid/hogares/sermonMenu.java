package org.lavid.hogares;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

import java.util.Calendar;
import java.util.Date;

public class sermonMenu extends AppCompatActivity {

    CardView cardSermon1; CardView cardSermon2; CardView cardSermon3;
    CardView cardSermon4; CardView cardSermon5; CardView cardSermon6;
    CardView cardSermon7; CardView cardSermon8; CardView cardSermon9;
    CardView cardSermon10; CardView cardSermon11; CardView cardSermon12;
    CardView cardSermon13; CardView cardSermon14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sermon_menu);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Calendar calendar = Calendar.getInstance();
        int week = calendar.WEEK_OF_YEAR;


        cardSermon1 = findViewById(R.id.card_view);
        cardSermon1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "lospobres.html");
                startActivity(mainIntent);
            }
        });

        cardSermon2 = findViewById(R.id.card_view2);
        cardSermon2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losquelloran.html");
                startActivity(mainIntent);
            }
        });

        cardSermon3 = findViewById(R.id.card_view3);
        cardSermon3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "loshumildes.html");
                startActivity(mainIntent);
            }
        });

        cardSermon4 = findViewById(R.id.card_view4);
        cardSermon4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losquetienenhambre.html");
                startActivity(mainIntent);
            }
        });

        cardSermon5 = findViewById(R.id.card_view5);
        cardSermon5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losmisericordiosos.html");
                startActivity(mainIntent);
            }
        });

        cardSermon6 = findViewById(R.id.card_view6);
        cardSermon6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losdelimpio.html");
                startActivity(mainIntent);
            }
        });

        cardSermon7 = findViewById(R.id.card_view7);
        cardSermon7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losqueprocuran.html");
                startActivity(mainIntent);
            }
        });

        cardSermon8 = findViewById(R.id.card_view8);
        cardSermon8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "losperseguidos.html");
                startActivity(mainIntent);
            }
        });


        cardSermon9 = findViewById(R.id.card_view9);
        cardSermon9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "lasal.html");
                startActivity(mainIntent);
            }
        });

        cardSermon10 = findViewById(R.id.card_view10);
        cardSermon10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "laconsumacion.html");
                startActivity(mainIntent);
            }
        });
        cardSermon10.setVisibility(View.GONE);

        cardSermon11 = findViewById(R.id.card_view11);
        cardSermon11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "laira.html");
                startActivity(mainIntent);
            }
        });
        cardSermon11.setVisibility(View.GONE);

        cardSermon12 = findViewById(R.id.card_view12);
        cardSermon12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "eladulterio.html");
                startActivity(mainIntent);
            }
        });
        cardSermon12.setVisibility(View.GONE);

        cardSermon13 = findViewById(R.id.card_view13);
        cardSermon13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "unavida.html");
                startActivity(mainIntent);
            }
        });
        cardSermon13.setVisibility(View.GONE);

        cardSermon14 = findViewById(R.id.card_view14);
        cardSermon14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), chapters.class);
                mainIntent.putExtra("cap", "lavenganza.html");
                startActivity(mainIntent);
            }
        });
        cardSermon14.setVisibility(View.GONE);

        if(week>2){ cardSermon10.setVisibility(View.VISIBLE); }
        if(week>3){ cardSermon11.setVisibility(View.VISIBLE); }
        if(week>4){ cardSermon12.setVisibility(View.VISIBLE); }
        if(week>5){ cardSermon13.setVisibility(View.VISIBLE); }
        if(week>6){ cardSermon14.setVisibility(View.VISIBLE); }

    }
}
