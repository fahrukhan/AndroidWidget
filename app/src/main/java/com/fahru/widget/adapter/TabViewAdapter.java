package com.fahru.widget.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.fahru.widget.fragments.TabContact;
import com.fahru.widget.fragments.TabHistory;
import com.fahru.widget.fragments.TabStatus;

public class TabViewAdapter extends FragmentPagerAdapter {
    private int numbOfTabs;

    public TabViewAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        numbOfTabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabContact();
            case 1:
                return new TabStatus();
            case 2:
                return new TabHistory();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
