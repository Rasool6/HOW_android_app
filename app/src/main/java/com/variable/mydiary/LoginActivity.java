package com.variable.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void singUpBtn(View view) {
        startActivity(new Intent(LoginActivity.this,SignUpActivity.class));

    }

    public void loginBtn(View view) {
        startActivity(new Intent(LoginActivity.this,LandingActivity.class));
    }
}