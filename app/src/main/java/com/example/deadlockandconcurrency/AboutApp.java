package com.example.deadlockandconcurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class AboutApp extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);
        //getSupportActionBar().setTitle("Back to home");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

  /*  @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

   */
}