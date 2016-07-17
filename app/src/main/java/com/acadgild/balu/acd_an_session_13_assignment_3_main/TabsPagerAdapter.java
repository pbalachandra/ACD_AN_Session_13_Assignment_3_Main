package com.acadgild.balu.acd_an_session_13_assignment_3_main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by BALU on 5/1/2016.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index)
    {
        switch (index)
        {
            case 0 :
                return new AudioFragment();
            case 1:
                return new VideoFragment();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 2;
    }
}
