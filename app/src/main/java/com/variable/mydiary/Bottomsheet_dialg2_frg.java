package com.variable.mydiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Bottomsheet_dialg2_frg extends BottomSheetDialogFragment {

    LinearLayout linearLayout,linearLayoutbtn2,linearLayoutbtn3,linearLayoutbtn4,linearLayoutbtn5,
            linearLayoutbtn6;

    public Bottomsheet_dialg2_frg() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.dialog_content2,container,false);

       linearLayout=view.findViewById(R.id.linearLayoutbtn1);
        linearLayoutbtn2=view.findViewById(R.id.linearLayoutbtn22);
        linearLayoutbtn3=view.findViewById(R.id.linearLayoutbtn33);
        linearLayoutbtn4=view.findViewById(R.id.linearLayoutbtn44);
        linearLayoutbtn5=view.findViewById(R.id.linearLayoutbtn55);
       // linearLayoutbtn6=view.findViewById(R.id.linearLayoutbtn55);
        TextView textView=view.findViewById(R.id.textView9);

       linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               //  Creat_post_frg creat_post_frg=new Creat_post_frg();
                 startActivity(new Intent(getActivity(),Creat_post_frg.class));


           }
       });

        linearLayoutbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Creat_post_frg creat_post_frg=new Creat_post_frg();
                startActivity(new Intent(getActivity(),Creat_post_frg.class));


            }
        });
        linearLayoutbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Creat_post_frg creat_post_frg=new Creat_post_frg();
                startActivity(new Intent(getActivity(),Creat_post_frg.class));


            }
        });
        linearLayoutbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Creat_post_frg creat_post_frg=new Creat_post_frg();
                startActivity(new Intent(getActivity(),Creat_post_frg.class));


            }
        });
        linearLayoutbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Creat_post_frg creat_post_frg=new Creat_post_frg();
                startActivity(new Intent(getActivity(),Creat_post_frg.class));


            }
        });


       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               startActivity(new Intent(getActivity(),LandingActivity.class));

//               Fragment mFragment = new Bottom_dialog_Frg();
//               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.botomsheet1, mFragment).commit();

           }
       });
        return view;
    }
}
