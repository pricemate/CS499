package com.example.melanie.ideal;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class CategoriesActivity extends AppCompatActivity {

    ImageButton womenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        womenButton = (ImageButton) findViewById(R.id.womenIcon);
    }
}

