package com.variable.mydiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.zip.Inflater;

public class Bottom_dialog_Frg  extends BottomSheetDialogFragment {

    LinearLayout linearLayoutbtn1,linearLayoutbtn2,linearLayoutbtn3,linearLayoutbtn4,linearLayoutbtn5,
    linearLayoutbtn6,linearLayoutbtn7,linearLayoutbtn8;

    public Bottom_dialog_Frg() {
    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                BottomSheetDialog dialog = (BottomSheetDialog) getDialog();
//// androidx should use: com.google.android.material.R.id.design_bottom_sheet            FrameLayout bottomSheet = (FrameLayout)
//                dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet);
//                BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);
//                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//                behavior.setPeekHeight(0);
//            }
//        });
//    }





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.dialog_content,container,false);


        TextView textView=view.findViewById(R.id.textView9);

        linearLayoutbtn1=view.findViewById(R.id.linearLayoutbtn1);
        linearLayoutbtn2=view.findViewById(R.id.linearLayoutbtn2);
        linearLayoutbtn3=view.findViewById(R.id.linearLayoutbtn3);
        linearLayoutbtn4=view.findViewById(R.id.linearLayoutbtn4);
        linearLayoutbtn5=view.findViewById(R.id.linearLayoutbtn5);
        linearLayoutbtn6=view.findViewById(R.id.linearLayoutbtn6);
        linearLayoutbtn7=view.findViewById(R.id.linearLayoutbtn7);
        linearLayoutbtn8=view.findViewById(R.id.linearLayoutbtn8);

        linearLayoutbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });
        linearLayoutbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });
        linearLayoutbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });

        linearLayoutbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });

        linearLayoutbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });
        linearLayoutbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });
        linearLayoutbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });

        linearLayoutbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottomsheet_dialg2_frg bottomsheet_dialg2_frg=new Bottomsheet_dialg2_frg();
                bottomsheet_dialg2_frg.show(getActivity().getSupportFragmentManager(),"Tag");
            }
        });




        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   startActivity(new Intent(getActivity(),LandingActivity.class));
            }
        });
        return view;
    }
}
