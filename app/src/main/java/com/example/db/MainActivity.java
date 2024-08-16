package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatabaseHelper databaseHelper = new MyDatabaseHelper(this);

//        databaseHelper.addContact("Aryan","9949799889");
//        databaseHelper.addContact("Aman","9794631656");
//        databaseHelper.addContact("Ashish","9745863541");
//        databaseHelper.addContact("Chanu","9856324785");

        ArrayList<ContactModel> arrContact = databaseHelper.fetchContact();

        for (int i=0;i<arrContact.size();i++){
            Log.d("CONTACT_INFO","Name: " + arrContact.get(i).name + ",Phone no: "+arrContact.get(i).phone_no);
        }
    }
}