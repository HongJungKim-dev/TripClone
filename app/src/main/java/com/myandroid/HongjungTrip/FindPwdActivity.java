package com.myandroid.HongjungTrip;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FindPwdActivity extends AppCompatActivity {
    Toolbar toolbar;
    ActionBar actionBar;

    EditText et_id;
    Button btn_find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_pwd);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false); //기본 제목을 없애기
        actionBar.setDisplayHomeAsUpEnabled(true);

        et_id = (EditText) findViewById(R.id.et_id_find);
        btn_find = (Button) findViewById(R.id.btn_find);
    }

    public void onClick(View v) {
        if(v == btn_find){
            String id_str = et_id.getText().toString();

            if(id_str.trim().length()>0){
                Toast.makeText(getApplicationContext(), "아이디 : "+id_str + ", 입력완료", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getApplicationContext(), "다시 입력하시오", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
