package ru.mirea.chumakova.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(text);

    }
}

