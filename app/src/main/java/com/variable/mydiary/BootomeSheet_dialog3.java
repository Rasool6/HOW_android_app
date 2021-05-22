package com.variable.mydiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BootomeSheet_dialog3  extends BottomSheetDialogFragment {

    public BootomeSheet_dialog3() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view=inflater.inflate(R.layout.add_photo_dialog,container,false);


        TextView textView=view.findViewById(R.id.textView12);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Creat_post_frg.class));

            }
        });
        return  view;
    }
}
