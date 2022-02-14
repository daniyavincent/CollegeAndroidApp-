package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);
        btn3=(AppCompatButton) findViewById(R.id.btn3);
        btn4=(AppCompatButton) findViewById(R.id.btn4);
        btn5=(AppCompatButton) findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddStudent.class);
                startActivity(i);
            }
        });
      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),AddFaculty.class);
              startActivity(i);
          }
      });
      btn3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),SearchStudent.class);
              startActivity(i);
          }
      });
      btn4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),SearchFaculty.class);
              startActivity(i);
          }
      });
      btn5.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),ViewWebsite.class);
              startActivity(i);
          }
      });
    }
}