package com.variable.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView   =findViewById(R.id.splashImage);

//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        imageView.animate().alpha(1f).setDuration(1000);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1*3000);
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });
        thread.start();


    }

}