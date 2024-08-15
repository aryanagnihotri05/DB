package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatabaseHelper databaseHelper = new MyDatabaseHelper(this);

        databaseHelper.addContact("Aryan","9949799889");
        databaseHelper.addContact("Aman","9794631656");
        databaseHelper.addContact("Ashish","9745863541");
        databaseHelper.addContact("Chanu","9856324785");
    }
}