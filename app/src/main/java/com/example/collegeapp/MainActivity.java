package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText edt1,edt2;
AppCompatButton btn1,btn2;
    String getEmailId,getPassword,prefValue;
SharedPreferences mypreferences;//object create to read and store value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //object linking
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);

        edt1=(EditText) findViewById(R.id.edt1);
        edt2=(EditText) findViewById(R.id.edt2);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);

        //redirect to dashboard
        prefValue=mypreferences.getString("email",null);
        if(prefValue!=null){
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmailId= edt1.getText().toString();
                getPassword= edt2.getText().toString();

                if(getEmailId.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    //set preference value
                    SharedPreferences.Editor myEdit=mypreferences.edit();
                    myEdit.putString("email",getEmailId);
                    myEdit.commit();

                    Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);
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