package com.asmen.uts_arkyanausman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button btnMenu1 = findViewById(R.id.btnMenu1);
        Button btnMenu2 = findViewById(R.id.btnMenu2);
        Button btnMenu3 = findViewById(R.id.btnMenu3);
        Button btnMenu4 = findViewById(R.id.btnMenu4);
        Button btnMenu5 = findViewById(R.id.btnMenu5);


        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Menu1);
            }
        });

        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu2 = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(Menu2);
            }
        });

        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = "0812345678910";
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });

        btnMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://profile.arkyana.my.id";
                Intent openbrowser = new Intent(Intent. ACTION_VIEW);
                openbrowser.setData(Uri.parse(url));
                startActivity(openbrowser);
            }
        });

        btnMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("text/html");
                email.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "admin@arkyana.my.id" });
                email.putExtra(Intent.EXTRA_SUBJECT, "Kritik dan Saran");
                email.putExtra(Intent.EXTRA_TEXT, "Terima Kasih");
                startActivity(Intent.createChooser(email, "Send Email"));
            }
        });

    }
}