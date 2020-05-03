package com.fahru.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.fahru.widget.adapter.TabViewAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TabView extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pageAdapter;
    TabItem tabContact;
    TabItem tabStatus;
    TabItem tabHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view);

        tabLayout = findViewById(R.id.tab_view_parent);
        viewPager = findViewById(R.id.tab_view_pager);
        tabContact = findViewById(R.id.tab_view1);
        tabStatus = findViewById(R.id.tab_view2);
        tabHistory = findViewById(R.id.tab_view3);

        pageAdapter = new TabViewAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
