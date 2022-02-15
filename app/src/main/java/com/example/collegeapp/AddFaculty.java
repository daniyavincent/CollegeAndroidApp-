package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
    EditText txt1,txt2,txt3,txt4,txt5;
    AppCompatButton btn1,btn2;
    String getFacultyName,getDepartment,getQualification,getMobileNum,getEmailId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        txt1=(EditText) findViewById(R.id.txt1);
        txt2=(EditText) findViewById(R.id.txt2);
        txt3=(EditText) findViewById(R.id.txt3);
        txt4=(EditText) findViewById(R.id.txt4);
        txt5=(EditText) findViewById(R.id.txt5);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName=txt1.getText().toString();
                getDepartment=txt1.getText().toString();
                getQualification=txt1.getText().toString();
                getMobileNum=txt1.getText().toString();
                getEmailId=txt1.getText().toString();

                Toast.makeText(getApplicationContext(),getFacultyName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDepartment, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getQualification, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMobileNum, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getEmailId, Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);

            }
        });


    }
}