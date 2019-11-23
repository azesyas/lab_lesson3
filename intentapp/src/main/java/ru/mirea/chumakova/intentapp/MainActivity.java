package ru.mirea.chumakova.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    String dateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));
        textView1 = (TextView) findViewById(R.id.textView2);
        textView1.setText(dateString);
    }

    public void clickForNewAct(View view) {
        Intent intent = new Intent(MainActivity.this, Second_activity.class);
        TextView textView1 = (TextView) findViewById(R.id.textView2);
        intent.putExtra("key", textView1.getText());
        startActivity(intent);
    }
    }

