package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
EditText edt1,edt2,edt3,edt4,edt5;
AppCompatButton btn1,btn2;
String getName,grtMobileNum,getEmailId,getPass,getConPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edt1=(EditText) findViewById(R.id.edt1);
        edt2=(EditText) findViewById(R.id.edt2);
        edt3=(EditText) findViewById(R.id.edt3);
        edt4=(EditText) findViewById(R.id.edt4);
        edt1=(EditText) findViewById(R.id.edt1);
    }
}