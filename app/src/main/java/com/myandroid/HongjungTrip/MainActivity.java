package com.myandroid.HongjungTrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

    }

    public void myListener1(View Target){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);//인텐트 시작
    }
    public void myListener2(View Target){
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);//인텐트 시작
    }
}