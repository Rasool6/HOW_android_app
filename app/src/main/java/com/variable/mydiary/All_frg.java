package com.variable.mydiary;

import android.graphics.Color;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class All_frg extends Fragment {
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_frg, container, false);
        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        FloatingActionButton floatingActionButton=view.findViewById(R.id.floatingActionButton);

                    floatingActionButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Bottom_dialog_Frg bottom_dialog_frg=new Bottom_dialog_Frg();
                            bottom_dialog_frg.show(getActivity().getSupportFragmentManager(),"Tag");


                        }
                    });







        List<String> data = new ArrayList<>();
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");

        // Initialize the adapter and attach it to the RecyclerView
        PostAdapter mAdapter = new PostAdapter(getContext(), data);
        recyclerView.setAdapter(mAdapter);

        return view;
    }



}