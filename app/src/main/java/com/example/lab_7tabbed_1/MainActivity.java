package com.example.lab_7tabbed_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tl;
    ViewPager VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl=findViewById(R.id.tab_Layout);
        tl.addTab(tl.newTab().setText("Tab-1"));
        tl.addTab(tl.newTab().setText("Tab-2"));
        tl.addTab(tl.newTab().setText("Tab-3"));
        tl.setTabGravity(tl.GRAVITY_FILL);

        VP=findViewById(R.id.Viewer);
        PagerAdapter adapter=new PageAdapter(getSupportFragmentManager(),tl.getTabCount());
        VP.setAdapter(adapter);
        VP.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                VP.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public class PageAdapter extends FragmentStatePagerAdapter{
        int CountTab;

        public PageAdapter(@NonNull FragmentManager fm, int CountTab) {
            super(fm);
            this.CountTab=CountTab;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return new Tab_1();
                case 1:return new Tab_2();
                case 2:return new Tab_3();
            }
            return new Tab_1();
        }

        @Override
        public int getCount() {
            return CountTab;
        }
    }
}