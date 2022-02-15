package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton btn1,btn2,btn3,btn4,btn5,btn6;
SharedPreferences mypreferences;//object create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);
        btn3=(AppCompatButton) findViewById(R.id.btn3);
        btn4=(AppCompatButton) findViewById(R.id.btn4);
        btn5=(AppCompatButton) findViewById(R.id.btn5);
        btn6=(AppCompatButton) findViewById(R.id.btn6);

        mypreferences=getSharedPreferences("login",MODE_PRIVATE);//object link

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
      btn6.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             //navigate to mainActiviy while click logout
             SharedPreferences.Editor myEdit=mypreferences.edit();
             myEdit.clear();
             myEdit.commit();

              Intent i=new Intent(getApplicationContext(),MainActivity.class);
              startActivity(i);
          }
      });
    }
}