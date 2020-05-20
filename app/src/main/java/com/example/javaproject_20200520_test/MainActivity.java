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
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final String id = binding.idInput.getText().toString();
        final String pw = binding.pwInput.getText().toString();

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id == "admin" && pw == "qwer"){
                    Toast.makeText(MainActivity.this, "관리자입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
