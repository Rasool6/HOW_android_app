package com.variable.mydiary;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class BlankFragment1 extends Fragment {
    ViewPager viewPager;
    TabLayout tableLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_blank1, container, false);

        viewPager=view.findViewById(R.id.viewPagerId);
        tableLayout=view.findViewById(R.id.tablayout);

        return view;    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupViewPager(viewPager);
        tableLayout.setupWithViewPager(viewPager);

        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {

        Fragment_Adapter fragment_adapter=new Fragment_Adapter(getChildFragmentManager());
        fragment_adapter.addFragment(new All_frg(),"All");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Daily Diary");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Workout");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Picnic");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Events");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Sports");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Games");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Family");
        fragment_adapter.addFragment(new Daily_diary_frg(),"General");


        viewPager.setAdapter(fragment_adapter);


    }
}