package com.babasxn.threadify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMakeThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMakeThread=findViewById(R.id.buttonMakeThread);
    }


    public void NextIntent(View view) {
        Intent intent = new Intent(this, InputActivity.class);
        startActivity(intent);
    }
}