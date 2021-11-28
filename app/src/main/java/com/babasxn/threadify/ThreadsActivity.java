package com.babasxn.threadify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThreadsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threads);

        Intent intent = getIntent();
        String message = intent.getStringExtra(InputActivity.MESSAGE_TEXT);
        String count= intent.getStringExtra(InputActivity.MESSAGE_COUNT) + "/180";
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        textView.setText(message);
        textView2.setText(count);
    }

    public String divideText(String text)
    {

    }

}