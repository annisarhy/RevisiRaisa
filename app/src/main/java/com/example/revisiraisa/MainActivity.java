package com.example.revisiraisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pengajar(View view) {
        Intent explicit = new Intent(MainActivity.this, DataPengajar.class);
        startActivity(explicit);
    }


    public void quiz(View view) {
        Intent explicit = new Intent(MainActivity.this, DataKuis.class);
        startActivity(explicit);
    }
}
