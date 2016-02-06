package com.example.melanie.ideal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Browse extends AppCompatActivity {

    private ImageButton parkaButton;
    private ImageButton michaelKorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        parkaButton = (ImageButton) findViewById(R.id.parkaButton);
        parkaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Browse.this, Details.class));
            }
        });

        michaelKorsButton = (ImageButton) findViewById(R.id.michaelKorsCrossbodyButton);
        michaelKorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Browse.this, Details.class));
            }
        });
    }

}
