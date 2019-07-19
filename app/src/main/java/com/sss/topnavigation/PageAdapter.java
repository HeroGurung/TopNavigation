package com.sss.topnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class PageAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    public PageAdapter(FragmentManager fm,int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new IntroductionFragment();
            case 1:
                return new ObjectiveFragment();
            case 2:
                return new StaffsFragment();
            case 3:
                return new RulesFragment();
                default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}

