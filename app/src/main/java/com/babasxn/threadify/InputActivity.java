package com.babasxn.threadify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    public static final String MESSAGE_TEXT = "com.babasxn.threadify.MESSAGE";
    public static final String MESSAGE_COUNT = "com.babasxn.threadify.MESSAGE_COUNT";

    EditText editTextThread;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editTextThread= (EditText) findViewById(R.id.editTextThread);
    }

    public void NextIntent(View view) {


        Intent intent = new Intent(this, ThreadsActivity.class);
        startActivity(intent);
        String message = editTextThread.getText().toString();
        String length = Integer.toString(message.length());
        intent.putExtra(MESSAGE_TEXT,message);
        intent.putExtra(MESSAGE_COUNT,length);
        startActivity(intent);
    }

}