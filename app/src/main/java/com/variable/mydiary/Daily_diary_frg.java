package com.variable.mydiary;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Daily_diary_frg extends Fragment {
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily_diary_frg, container, false);


        List<String> data = new ArrayList<>();
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        data.add("ddd");
        recyclerView=view.findViewById(R.id.recyDailydiary);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        // Initialize the adapter and attach it to the RecyclerView
        PostAdapter mAdapter = new PostAdapter(getContext(), data);
        recyclerView.setAdapter(mAdapter);
return view;
    }
}