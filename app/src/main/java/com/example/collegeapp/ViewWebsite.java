package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class ViewWebsite extends AppCompatActivity {
WebView webv;//object create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_website);
        //object link
        webv=(WebView) findViewById(R.id.web);
        webv.loadUrl("https://www.mzcet.in/default.php");
    }
}