package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Layout B");

        tvnama = findViewById(R.id.tvnama);

        Intent terima = getIntent();
        String ynama = terima.getStringExtra("xNama");
        tvnama.setText(ynama);

    }
}