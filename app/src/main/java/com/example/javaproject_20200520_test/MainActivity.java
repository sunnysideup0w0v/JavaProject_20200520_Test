package com.example.javaproject_20200520_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.javaproject_20200520_test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String inputId = binding.idEdt.getText().toString();
                String inputPw = binding.pwEdt.getText().toString();
                // 안드로이드 SDK 에서의 String 비교는 == 이 아니라 equals()를 사용해서 비교해줘야함.
                if(inputId.equals("admin") && inputPw.equals("qwer")){
                    Toast.makeText(MainActivity.this, "관리자입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
