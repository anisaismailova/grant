package com.example.lol.grant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase grantsDB;
    private DatabaseReference grantsReference;

    private EditText grantName;
    private EditText grantDescription;
    private Button publishButton;
    private TextView grantsText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grantsDB = FirebaseDatabase.getInstance();
        grantsReference = grantsDB.getReference().child("grants");

      //Initialize interface
        grantName = (EditText)findViewById(R.id.grantName);
        grantDescription =(EditText)findViewById(R.id.grantDescription);
        publishButton = (Button)findViewById(R.id.publishButton);
        grantsText = (TextView)findViewById(R.id.textView);

        }



    }

        publishButton

