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

public class SignUpActivity extends AppCompatActivity {
    Toolbar toolbar;
    ActionBar actionBar;
    EditText et_id;
    EditText et_pwd;
    EditText et_pwd_confirm;
    Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//레이아웃 생성
        super.onCreate(savedInstanceState); //초기 컴포넌트 초기화
        setContentView(R.layout.sign_up);//화면에 나타날 view가 담긴 xml파일을 불러와서 액티비티 설정
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

        et_id = (EditText) findViewById(R.id.et_id_sign);
        et_pwd = (EditText) findViewById(R.id.et_pwd_sign);
        et_pwd_confirm = (EditText) findViewById(R.id.et_pwd_confirm);
        btn_done = (Button) findViewById(R.id.btn_done_sign);
    }
    public void onClick(View v) {
        if(v == btn_done){
            String id_str = et_id.getText().toString();
            String pwd_str = et_pwd.getText().toString();
            String pwd_confirm_str = et_pwd_confirm.getText().toString();


            if(id_str.trim().length()>0
                    && pwd_str.trim().length()>0){
                if(pwd_str.equals(pwd_confirm_str)) {
                    Toast.makeText(getApplicationContext(), "아이디 : " + id_str + ", 입력완료", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "비밀번호를 확인하시오", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(getApplicationContext(), "다시 입력하시오", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
