package com.variable.mydiary;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Creat_post_frg extends AppCompatActivity {

    Dialog dialog;
    TextView accpet,declin;
     ImageView closebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat_post);
        accpet=findViewById(R.id.accept);
        declin=findViewById(R.id.decline);
        closebtn=findViewById(R.id.imageView5);
        dialog=new Dialog(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


       // dialog=new Dialog(AddServiceActivity.this);
        dialog.setContentView(R.layout.custum_dialog);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        accpet=dialog.findViewById(R.id.accept);
        declin=dialog.findViewById(R.id.decline);
        dialog.show();
        accpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   startActivity(new Intent(AddServiceActivity.this,MainActivity.class));
              //  Toast.makeText(Creat_post_frg.this, "Okey", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        declin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   startActivity(new Intent(AddServiceActivity.this,MainActivity.class));
                startActivity(new Intent(Creat_post_frg.this,LandingActivity.class));
                finish();
            }
        });

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closemethod();


            }
        });






    }

    private void closemethod()
    {
        startActivity(new Intent(Creat_post_frg.this,LandingActivity.class));
        finish();


    }

    public void AddPhotobtn(View view) {

        BootomeSheet_dialog3 bootomeSheet_dialog3=new BootomeSheet_dialog3();
        bootomeSheet_dialog3.show(getSupportFragmentManager(),"Tag");

    }


}

