package com.example.mealguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.text.BreakIterator;

public class DisplayMessageActivity extends AppCompatActivity {
    BreakIterator textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //get the intent that started this activity from main activity file and
        //extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //Capture the layout's TextView and set the string as it's text
        TextView textview = findViewById(R.id.textView);
        textView.setText(message);
    }
}