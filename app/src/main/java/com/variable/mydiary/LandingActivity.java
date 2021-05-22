package com.variable.mydiary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.infideap.drawerbehavior.Advance3DDrawerLayout;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

public class LandingActivity extends AppCompatActivity  {

    AdvanceDrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    SearchView searchView;
    TextView toolbar_titl;
    ViewPager viewPager;
    TabLayout tableLayout;
    LinearLayout linearLayoutsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        viewPager=findViewById(R.id.viewPagerId);
        tableLayout=findViewById(R.id.tablayout);
        linearLayoutsearch=findViewById(R.id.linSearch);
//        searchView=findViewById(R.id.search);
//        toolbar_titl=findViewById(R.id.toolbar_title);
//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        drawerLayout=(AdvanceDrawerLayout) findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigation);
        toolbar=findViewById(R.id.toolbar);

         //setSupportActionBar(toolbar);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        drawerLayout.setViewScale(Gravity.START, 0.9f);
        drawerLayout.setViewElevation(Gravity.START, 20f);
        drawerLayout.useCustomBehavior(Gravity.END);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            Fragment temp=null;
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                drawerLayout.closeDrawer(GravityCompat.START);
                drawerLayout.useCustomBehavior(GravityCompat.START); //assign custom behavior for "Left" drawer
//                drawer.useCustomBehavior(GravityCompat.END); //assign custom behavior for "Right" drawer

                switch (menuItem.getItemId()){

                    case R.id.item_profile:
                        temp= new All_frg();
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        break;
                    default:
                        temp=new All_frg();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,temp).commit();

                return true;

            }
        });

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
//        View view = navigationView.getHeaderView(0);
//        TextView textView=view.findViewById(R.id.drawrProfilename);
//        textView.setText("Admin");

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }else {
            super.onBackPressed();
        }
    }


    private void setupViewPager(ViewPager viewPager) {

        Fragment_Adapter fragment_adapter=new Fragment_Adapter(getSupportFragmentManager());
        fragment_adapter.addFragment(new All_frg(),"All");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Daily Diary");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Workout");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Picnic");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Events");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Sports");
        fragment_adapter.addFragment(new Daily_diary_frg(),"Games");
        fragment_adapter.addFragment(new Family_frg(),"Family");
        fragment_adapter.addFragment(new Daily_diary_frg(),"General");

        viewPager.setAdapter(fragment_adapter);


    }

    public void searchIconBtn(View view) {
       // TransitionManager.beginDelayedTransition(linearLayoutsearch,new AutoTransition());
        linearLayoutsearch.setVisibility(View.VISIBLE);
        TransitionManager.beginDelayedTransition(linearLayoutsearch,new AutoTransition());


    }

    public void cancelSearchBtn(View view) {

        linearLayoutsearch.setVisibility(View.GONE);
        TransitionManager.beginDelayedTransition(linearLayoutsearch,new AutoTransition());

    }
}