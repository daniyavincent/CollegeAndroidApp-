package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String getEmailId,getPassword;
EditText edt1,edt2;
AppCompatButton btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText) findViewById(R.id.edt1);
        edt2=(EditText) findViewById(R.id.edt2);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmailId= edt1.getText().toString();
                getPassword= edt2.getText().toString();

                if(getEmailId.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(getApplicationContext(), getEmailId, Toast.LENGTH_SHORT).show();
               // Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
            }
        });
    }
}